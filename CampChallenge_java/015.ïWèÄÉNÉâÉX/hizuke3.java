/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hizuke;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author jamesgrimm
 */
public class hizuke3 {
   public static void main(String[] args) {
      Date d = new Date(1478221200000L);
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      System.out.print(sdf.format(d));
      
    }} 

  
