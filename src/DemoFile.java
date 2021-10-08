import java.io.*;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        String a[] = new String[3];
        a[0] = "Macbook";
        a[1] = "DELL";
        a[2] = "HP";
        File file = new File("mt.txt");
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for (String item: a){
            outputStreamWriter.write(item);
            outputStreamWriter.flush();
        }

//        //khai bao 1 doi tuong file
//        File file = new File("demo.txt");
//        //tao 1 dong ket noi voi file
//        InputStream inputStream = new FileInputStream(file);
//        // tao 1 doi tuong doc file voi dong tren
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        // tao 1 doi tuong bo dem
//        BufferedReader reader = new BufferedReader(inputStreamReader);
//
//        String line = "";
//        while ((line = reader.readLine())!=null ){
//            System.out.println(line);
//        }
    }
}
