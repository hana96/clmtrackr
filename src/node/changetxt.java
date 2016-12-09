
import java.io.*;

class changetxt {
  public static void main(String args[]){
    //顔検出できた男性の数
    int count = 0;
    //読み込み用ファイル
    File rFile = new File("./"+args[0]);
    //書き込み用ファイル
    File wFile = new File("./"+args[1]);
    FileWriter filewriter = null;
    FileReader fr = null;
    BufferedReader br = null;
    String text = "";

    try {
        fr = new FileReader(rFile);
        br = new BufferedReader(fr);
        filewriter = new FileWriter(wFile);
        String line;

        while ((line = br.readLine()) != null) {
          text += line;
        }
        text = text.replace("{","");
        text = text.replace("'","");
        text = text.replace("}","");
        count += boycount(text);
        text = changeLine(text);
        System.out.println(count);
        //System.out.println(text);
        filewriter.write(text);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            br.close();
            fr.close();
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }

  public static String changeLine(String text){
    for(int i = 1;i < 2001;i++){
      text = text.replace(("face"+i+": "),"\n");
    }
    return text;
  }

  public static int boycount(String text){
    int count = 0;
    for(int i = 1;i < 2001;i++){
      if(text.indexOf("face"+i+": ")!=-1) count++;
    }
    return count;
  }
}
