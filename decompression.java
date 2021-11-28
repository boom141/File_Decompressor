import java.io.*;
import java.util.zip.*;

public class decompression {
    public static void Decompression(File source, File destination) throws IOException{
    byte[] buffer = new byte[1204];
   FileInputStream fis = new FileInputStream(source);
   GZIPInputStream gzis = new GZIPInputStream(fis); 
   FileOutputStream fos = new FileOutputStream(destination);
       int read;
                 
                while((read = gzis.read(buffer))!= -1){
                fos.write(buffer, 0, read);
                }
                gzis.close();
                fos.close();
                fis.close();
    }
     public static void main(String[] args){
        File source = new File("C:\\Users\\mumei\\Desktop\\compress.txt");
        File destination = new File("C:\\Users\\mumei\\Desktop\\decompress.txt");
        try{
        Decompression(source, destination);
        }catch(IOException e){
            System.out.println(e);
        }
    
    
}
}
