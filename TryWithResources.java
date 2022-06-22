import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;

public class TryWithResources{

    public void tryResources() throws IOException{

        try(
                FileOutputStream fos =new FileOutputStream("C:\\Users\\smita\\Desktop\\Day2Practice");
                FileInputStream fis = new FileInputStream("C:\\Users\\smita\\Desktop\\Day2Practice")){

            String str = "Hello Everyone!";
            byte byteArray1[] = str.getBytes();  // Converting string into byte array
            fos.write(byteArray1);  //Code to write data into file
            System.out.println("Write Data");
            System.out.println(str);


            String str1 = "Welcome to India";
            byte[] byteArray2 = str.getBytes();
            fis.read(byteArray2);

            System.out.println("Read Data");  //Code to read data from file
            System.out.println(str1);
        }catch(IOException e){
            e.printStackTrace();

        }
    }
    public static void main(String[] args) throws IOException {
        TryWithResources tr = new TryWithResources();
        tr.tryResources();
    }
}