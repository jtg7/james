/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.*;
/**
 *
 * @author jamesgrimm
 */
public class file2 extends file1 {
  public static void main(String[] args){
      try{
      File intr = new File("text,txt");
     FileReader fr = new FileReader(intr);
     BufferedReader br = new BufferedReader(fr);
     System.out.print(br.readLine());
     fr.close();
  }catch(IOException e){
      e.printStackTrace();
  }
  }
}
