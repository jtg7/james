package file;

import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesgrimm
 */
public class file1 {
    public static void main(String[] args){
        try{
            File intr = new File("text,txt");
        FileWriter intro = new FileWriter(intr);
        intro.write("石見猛"+"<br>"+"19歳"+"<br>"+"好きなスポーツはサッカー");
        intro.close();
        }catch(IOException e){
           e.printStackTrace();
        }
        
    }
}
