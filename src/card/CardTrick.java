/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modifier: Julian Mastalerz
 * Student Number: 991731038
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        for (Card card: magicHand){
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a card value (1-13: ");
        int valueInput = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        String suitInput = scan.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(valueInput);
        userCard.setSuit(suitInput);
        // and search magicHand here
        boolean cardFound = false;
        for (Card card: magicHand){
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())){
                cardFound = true;
                break;
            }
        }
        //Then report the result here
        if (cardFound) {
            System.out.println("Congratulations, your card is in the magic hand");
        } else {
            System.out.println("Sorry, your card is not in the magic hand");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
