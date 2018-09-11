
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
public abstract class Human {//has the commen part of the dealer and user
    
  abstract public int open();//sum of the cards in the hand 
  abstract public void setCard(ArrayList<Integer> j);//draw one card
  abstract public boolean checkSum();//decied rather to draw another card or not
  ArrayList<Integer> myCards = new ArrayList<Integer>();//hand cards
}
 

