import java.io.*;
import java.util.*;

public class arrange{
  public static void main(String[] args) throws Exception {
    File rFile = new File("./"+args[0]);
    List<String> list = new ArrayList<String>();
    FileReader fr = null;
    BufferedReader br = null;
    int c0 = 0;
    int c1 = 0;
    //機械学習するイケメンの数
    int cool =61;
    //機械学習する非イケメンの数
    int clumsy =61;

    try {
      fr = new FileReader(rFile);
      br = new BufferedReader(fr);
      String line;

      while ((line = br.readLine()) != null) {
        if(line.startsWith("-1 ")){
          c0++;
          if(c0 < cool){
            list.add(line);
          }
        }else if(line.startsWith("1 ")){
          c1++;
          if(c1 < clumsy){
            list.add(line);
          }
        }
      }
      writeList(list,args[1]);
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
