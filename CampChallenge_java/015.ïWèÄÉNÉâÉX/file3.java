/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.*;
import java.util.Date;
/**
 *
 * @author jamesgrimm
 */


public class file3 {
    public static void main(String[] args){
        try{
            Date start = new Date();
   System.out.println(start);
   File fi = new File("text.txt");
   FileWriter fwr = new FileWriter(fi,true);
   fwr.write("開始時刻のタイムスタンプは"+(int)start.getTime());
   fwr.close();
       String tr = " 綺麗な青空 ";
   FileWriter il = new FileWriter(fi,true);
   il.write(tr.trim());
   il.close();
   FileWriter te = new FileWriter(fi,true);
   te.write(tr.replace("青空","海"));
   te.close();
   FileReader fr = new FileReader(fi);
   BufferedReader br = new BufferedReader(fr);
     System.out.println(br.readLine());
    
     fr.close();
        Date finish = new Date();
    System.out.print(finish);
   
        }catch(IOException e){
            e.printStackTrace();
        }   
}

    
    }
