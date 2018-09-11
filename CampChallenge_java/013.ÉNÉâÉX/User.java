
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesgrimm
 */
public class User extends Human {
  @Override
  public void setCard(ArrayList<Integer> j){
       for(int i=0;i<j.size();i++){
           myCards.add(j.get(i));
       }
   }
  @Override
   public boolean checkSum(){
    int hand=0;
    for(int i=0;i<myCards.size();i++){
        hand+=myCards.get(i);
    }if(hand>15){
        return true;
    }else{
        return false;
    }
}
  @Override
   public int open(){
       int hand=0;
       for(int i=0;i<myCards.size();i++){
           hand+=myCards.get(i);
       }
           return hand;
   }  
}
