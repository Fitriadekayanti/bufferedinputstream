/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Program;
import java.io.*;

public class BUfferedreader{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Masukkan Nama : ");
String nama=br.readLine();
System.out.println("Hallo "+nama);
}
}