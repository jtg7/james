/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesgrimm
 */
public class blackjack {
   public static void main(String[] args){
       User hand = new User();//player
       Dealer hand2 = new Dealer();//dealer
       
        hand2.cards();
        hand2.deal();
        hand2.setCard(hand2.deal());
        hand2.checkSum();
       hand2.open();
       while(hand2.open()<16){
           hand2.hit();
           hand2.setCard(hand2.hit());
       }
        
        hand2.deal();
        hand.setCard(hand2.deal());
        hand.open();
        System.out.println("あなたの手札は"+hand.open()+"です");
        hand.checkSum();
        hand.open();
        while(hand.open()<15){
            hand2.hit();
            hand.setCard(hand2.hit());
            System.out.println("あなたの手札は"+hand.open()+"です");
        }
        
        System.out.println("あなたの手札は"+hand.open()+"です");
        System.out.println("ディーラーの手札は"+hand2.open()+"です");
        if(hand.open()>hand2.open() && hand.open()<=21||hand.open()<=21&&hand2.open()>21){
            System.out.print("あなたの勝ちです");
        }else if(hand.open()==hand2.open()&&hand.open()<=21){
            System.out.print("引き分けです");
        }else{
            System.out.print("あなたの負けです");
        }
   } 
}
