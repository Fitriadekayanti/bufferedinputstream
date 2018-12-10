/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Program;
import java.io.FileInputStream;
import java.io.IOException;
 
/**
 *
 * @author nave
 */
public class MembacaFile {
    public static void main(String args[]){
        FileInputStream finput=null;
        int data;
 
        
        try{
            finput = new FileInputStream("f:/note.txt");
        }catch(IOException e){}
      
        try{
            while((data = finput.read())!=-1){
               
                System.out.print((char) data);
            }
 
        }catch(IOException e){}
        try{
             finput.close();
        }catch(IOException e){}
 
    }
}
