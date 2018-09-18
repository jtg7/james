/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hizuke;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jamesgrimm
 */
public class hizuke4 {
    public static void main(String[] args) {
      Date d = new Date(1420038000000L);
      Date a =new Date(1451573999000L);
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      System.out.println(sdf.format(d));
      System.out.println(sdf.format(a));
      long dateD =d.getTime();
      long dateA =a.getTime();
      long t =dateA-dateD;
      System.out.print("2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒のタイムスタンプの差は" + t +"です。");
      
    }
}
