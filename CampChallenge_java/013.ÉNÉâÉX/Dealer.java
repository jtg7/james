
import java.util.ArrayList;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesgrimm
 */
public class Dealer extends Human {
     public ArrayList<Integer> cards = new ArrayList<>();
    public void cards(){//deck 13*4=52cards
       for (int n=1;n<=4;n++){//by putting forbun inside forbun it allows the 13 cards to be added to cards 4 times
           for (int i=1;i<=13;i++){//printing out 13 cards and adding it to cards
               cards.add(i);//add goes after so theres no mistakes in the order of the calculation
           }
       }      
    }

public ArrayList<Integer> deal(){
ArrayList<Integer> data1 = new ArrayList<>();//putting card info of data1 in arraylist
Random ran = new Random();//instantiation of random class
for(int i=0;i<2;i++){
Integer in = ran.nextInt(cards.size());//nextInt a method to make the order random
data1.add(cards.get(in));
} return data1;
}

public ArrayList<Integer> hit(){
ArrayList<Integer> data2 = new ArrayList<>();
Random ran = new Random();
for(int i=0;i<1;i++){
    Integer in = ran.nextInt(cards.size());
    data2.add(cards.get(in));
}return data2;
}

     @Override
     public void setCard(ArrayList<Integer> j){//putting the cards drawn from the arraylist in to mycrads
   for(int i=0;i<j.size();i++){
       myCards.add(j.get(i));
   }  
}
     @Override
     public boolean checkSum(){//deciding rather to draw another card or not
    int hand = 0;
    for(int i=0;i<myCards.size();i++){
        hand+=myCards.get(i);//sum
    }if(hand>=17){
        return true;
    }else{
        return false;
    }   
}
     @Override
     public int open(){//returning the sum 
    int hand=0;
    for(int i=0;i<myCards.size();i++){
        hand+=myCards.get(i);
    }return hand;
    }
}
