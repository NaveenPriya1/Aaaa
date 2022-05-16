package MuLtithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyTheFile {
    
    
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("FileWrite.text");
        if (fileInputStream != null) {
            System.out.println("File is Riding");
            
        }
        int x=0;
        String s1="";
        while ((x=fileInputStream.read())!=-1) {
                s1=(char)x+s1;
            
        }
        System.out.println(s1);
        System.out.println();
        fileInputStream.close();
        
        //Input Close
        
    
        FileOutputStream fO=new FileOutputStream("CopyFile.text");
        if(fO!=null) {
        System.out.println("File Wite Started.....");
        
        }
        String s2="";
        for (int i = s1.length()-1; i >=0; i--) {
            s2=s2+s1.charAt(i);
        }
        byte[] b1=s2.getBytes();
        fO.write(b1);
        System.out.println("File Creted Succesfully.....");
        fO.close();
        System.out.println("File close...");

}}