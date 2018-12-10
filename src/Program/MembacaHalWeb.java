/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *
 * @author LENOVO
 */
public class MembacaHalWeb {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://google.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
 
        String inputLine;
        while ((inputLine = br.readLine()) != null) {            
            System.out.println(inputLine);
        }
        br.close();
    }
}