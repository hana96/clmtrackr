import java.io.*;
import java.util.*;

public class split{
  public static void main(String[] args) throws Exception {
    File rFile = new File("./"+args[0]);
    List<String> learning = new ArrayList<String>();
    List<String> train = new ArrayList<String>();
    FileReader fr = null;
    BufferedReader br = null;
    int c0 = 0;
    int c1 = 0;
    //学習用の非イケメンデータ数
    int coolL = 45;
    //学習用のイケメンデータ数
    int clumsyL = 45;

    try {
      fr = new FileReader(rFile);
      br = new BufferedReader(fr);
      String line;

      while ((line = br.readLine()) != null) {
        if(line.startsWith("-1 ")){
          c0++;
          if(c0 <= coolL){
            learning.add(line);
          }else{
            train.add(line);
          }
        }else if(line.startsWith("1 ")){
          c1++;
          if(c1 <= clumsyL){
            learning.add(line);
          }else{
            train.add(line);
          }
        }
      }
      //学習用データ
      writeList(learning,args[1]);
      //判定用データ
      writeList(train,args[2]);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
        fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  public static void writeList(List<String> list,String file){
    FileWriter filewriter = null;
    try {
      File wFile = new File("./"+file);
      filewriter = new FileWriter(wFile);
      for(String text:list){
        filewriter.write(text+"\n");
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        filewriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
