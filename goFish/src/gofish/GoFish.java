/*
 * Lainie Cederholm
 * AT Computer Science 2020-2021
 * 
 */
package gofish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lainiecederholm
 */
public class GoFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a deck of cards and hands
        Scanner keyIn = new Scanner(System.in);
        ArrayList<String> stock = new ArrayList<>();
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        int stockSize, p1Size, p2Size, count, turn, p1book, p2book, kind, fullBook;
        int cA, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, cJ, cQ, cK;
        String nextCard, cast, match;
        p1book = 0;
        p2book = 0;
        kind = 0;
        fullBook = 0;
        
        for (int i = 0; i<4; i++){
            stock.add("Ace");
            stock.add("2");
            stock.add("3");
            stock.add("4");
            stock.add("5");
            stock.add("6");
            stock.add("7");
            stock.add("8");
            stock.add("9");
            stock.add("10");
            stock.add("Jack");
            stock.add("Queen");
            stock.add("King");
        }
        
        Collections.shuffle(stock);
        
        //deal each player 7 cards
        for(int n = 0; n<7; n++){
            nextCard = stock.get(0);
            p1.add(nextCard);
            stock.remove(nextCard);
            nextCard = stock.get(0);
            p2.add(nextCard);
            stock.remove(nextCard);        
        }
        System.out.println("Here is player one's hand:");
        System.out.println(p1);
        System.out.println("Here is player two's hand:");
        System.out.println(p2);
        
        turn = 0;
        while(stock.size()!=0){
            while (turn == 0){
                System.out.println("Player one, it is now your turn");
                System.out.println("Here is your hand: ");
                System.out.println(p1);
                System.out.println("Player two, do you have any: ");
                cast = keyIn.next();
                p2Size = p2.size();
                count = 0;
                for(int x = 0; x<p2Size; x++){
                    if(cast.equalsIgnoreCase(p2.get(x))|| cast.equalsIgnoreCase(p2.get(x)+"s")){
                        cast = p2.get(x);
                        p2.remove(cast);
                        p1.add(cast);
                        count++;
                    }
                    else{
                    }
                    
                    p2Size = p2.size();
                }
                
                if(count>0){
                    System.out.println("Yes I do.");
                }
                else{
                    System.out.println("No. Go fish.");
                    System.out.println("Here is your new card: ");
                    System.out.println(stock.get(0));
                    p1.add(stock.get(0));
                    stock.remove(0);
                    if ((stock.get(0)).equals(cast)){
                        System.out.println("I fished my wish!");
                    }
                    else{
                        turn = 1;
                    }
                }
                
                cA = 0;
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                c5 = 0;
                c6 = 0;
                c7 = 0;
                c8 = 0;
                c9 = 0;
                c10 = 0;
                cJ = 0;
                cQ = 0;
                cK = 0;
                
                for(int k = 0; k < p1.size(); k++){
                    match = p1.get(k);
                    switch(match){
                        case "Ace":
                            cA++;
                            if (cA>=4){
                                System.out.println("I have a book of Aces");
                                for (int a = 0; a<4; a++){
                                    p1.remove("Ace");
                                }
                                p1book++;
                            }
                            break;
                        case "1":
                            c1++;
                            if (c1>=4){
                                System.out.println("I have a book of ones");
                                for (int a = 0; a<4; a++){
                                    p1.remove("1");
                                }
                                p1book++;
                            }
                            break;
                        case "2":
                            c2++;
                            if (c2>=4){
                                System.out.println("I have a book of twos");
                                for (int a = 0; a<4; a++){
                                    p1.remove("2");
                                }
                                p1book++;
                            }
                            break;
                        case "3":
                            c3++;
                            if (c3>=4){
                                System.out.println("I have a book of threes");
                                for (int a = 0; a<4; a++){
                                    p1.remove("3");
                                }
                                p1book++;
                            }
                            break;
                        case "4":
                            c4++;
                            if (c4>=4){
                                System.out.println("I have a book of fours");
                                for (int a = 0; a<4; a++){
                                    p1.remove("4");
                                }
                                p1book++;
                            }
                            break;
                        case "5":
                            c5++;
                            if (c5>=4){
                                System.out.println("I have a book of fives");
                                for (int a = 0; a<4; a++){
                                    p1.remove("5");
                                }
                                p1book++;
                            }
                            break;
                        case "6":
                            c6++;
                            if (c6>=4){
                                System.out.println("I have a book of sixes");
                                for (int a = 0; a<4; a++){
                                    p1.remove("6");
                                }
                                p1book++;
                            }
                            break;
                        case "7":
                            c7++;
                            if (c7>=4){
                                System.out.println("I have a book of sevens");
                                for (int a = 0; a<4; a++){
                                    p1.remove("7");
                                }
                                p1book++;
                            }
                            break;
                        case "8":
                            c8++;
                            if (c8>=4){
                                System.out.println("I have a book of eights");
                                for (int a = 0; a<4; a++){
                                    p1.remove("8");
                                }
                                p1book++;
                            }
                            break;
                        case "9":
                            c9++;
                            if (c9>=4){
                                System.out.println("I have a book of nines");
                                for (int a = 0; a<4; a++){
                                    p1.remove("9");
                                }
                                p1book++;
                            }
                            break;
                        case "10":
                            c10++;
                            if (c10>=4){
                                System.out.println("I have a book of tens");
                                for (int a = 0; a<4; a++){
                                    p1.remove("10");
                                }
                                p1book++;
                            }
                            break;
                        case "Jack":
                            cJ++;
                            if (cJ>=4){
                                System.out.println("I have a book of jacks");
                                for (int a = 0; a<4; a++){
                                    p1.remove("Jack");
                                }
                                p1book++;
                            }
                            break;
                        case "Queen":
                            cQ++;
                            if (cQ>=4){
                                System.out.println("I have a book of queens");
                                for (int a = 0; a<4; a++){
                                    p1.remove("Queen");
                                }
                                p1book++;
                            }
                            break;
                        case "King":
                            cK++;
                            if (cK>=4){
                                System.out.println("I have a book of kings");
                                for (int a = 0; a<4; a++){
                                    p1.remove("King");
                                }
                                p1book++;
                            }
                            break;
                        default:
                            System.out.println("not registering");
                            break;
                    }
                }
            }
            
            while (turn == 1){
                System.out.println("Player two, it is now your turn");
                System.out.println("Here is your hand: ");
                System.out.println(p2);
                System.out.println("Player one, do you have any: ");
                cast = keyIn.next();
                p1Size = p1.size();
                count = 0;
                for(int y = 0; y<p1Size; y++){
                    if(cast.equalsIgnoreCase(p1.get(y))|| cast.equalsIgnoreCase(p1.get(y)+"s")){
                        cast = p1.get(y);
                        p1.remove(cast);
                        p2.add(cast);
                        count++;
                    }
                    else{

                    }
                    p1Size = p1.size();
                }
                
                if(count>0){
                    System.out.println("Yes I do.");
                }
                else{
                    System.out.println("No. Go fish.");
                    System.out.println("Here is your new card");
                    System.out.println(stock.get(0));
                    p2.add(stock.get(0));
                    stock.remove(0);
                    if ((stock.get(0)).equals(cast)){
                        System.out.println("I fished my wish!");
                    }
                    else{
                        turn = 0;
                    }
                }
                cA = 0;
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                c5 = 0;
                c6 = 0;
                c7 = 0;
                c8 = 0;
                c9 = 0;
                c10 = 0;
                cJ = 0;
                cQ = 0;
                cK = 0;
                for(int k = 0; k < p1.size(); k++){
                    match = p1.get(k);
                    switch(match){
                        case "Ace":
                            cA++;
                            if (cA>=4){
                                System.out.println("I have a book of Aces");
                                for (int a = 0; a<4; a++){
                                    p2.remove("Ace");
                                }
                                p2book++;
                            }
                            break;
                        case "1":
                            c1++;
                            if (c1>=4){
                                System.out.println("I have a book of ones");
                                for (int a = 0; a<4; a++){
                                    p2.remove("1");
                                }
                                p2book++;
                            }
                            break;
                        case "2":
                            c2++;
                            if (c2>=4){
                                System.out.println("I have a book of twos");
                                for (int a = 0; a<4; a++){
                                    p2.remove("2");
                                }
                                p2book++;
                            }
                            break;
                        case "3":
                            c3++;
                            if (c3>=4){
                                System.out.println("I have a book of threes");
                                for (int a = 0; a<4; a++){
                                    p2.remove("3");
                                }
                                p2book++;
                            }
                            break;
                        case "4":
                            c4++;
                            if (c4>=4){
                                System.out.println("I have a book of fours");
                                for (int a = 0; a<4; a++){
                                    p2.remove("4");
                                }
                                p2book++;
                            }
                            break;
                        case "5":
                            c5++;
                            if (c5>=4){
                                System.out.println("I have a book of fives");
                                for (int a = 0; a<4; a++){
                                    p2.remove("5");
                                }
                                p2book++;
                            }
                            break;
                        case "6":
                            c6++;
                            if (c6>=4){
                                System.out.println("I have a book of sixes");
                                for (int a = 0; a<4; a++){
                                    p2.remove("6");
                                }
                                p2book++;
                            }
                            break;
                        case "7":
                            c7++;
                            if (c7>=4){
                                System.out.println("I have a book of sevens");
                                for (int a = 0; a<4; a++){
                                    p2.remove("7");
                                }
                                p2book++;
                            }
                            break;
                        case "8":
                            c8++;
                            if (c8>=4){
                                System.out.println("I have a book of eights");
                                for (int a = 0; a<4; a++){
                                    p2.remove("8");
                                }
                                p2book++;
                            }
                            break;
                        case "9":
                            c9++;
                            if (c9>=4){
                                System.out.println("I have a book of nines");
                                for (int a = 0; a<4; a++){
                                    p2.remove("9");
                                }
                                p2book++;
                            }
                            break;
                        case "10":
                            c10++;
                            if (c10>=4){
                                System.out.println("I have a book of tens");
                                for (int a = 0; a<4; a++){
                                    p2.remove("10");
                                }
                                p2book++;
                            }
                            break;
                        case "Jack":
                            cJ++;
                            if (cJ>=4){
                                System.out.println("I have a book of jacks");
                                for (int a = 0; a<4; a++){
                                    p2.remove("Jack");
                                }
                                p2book++;
                            }
                            break;
                        case "Queen":
                            cQ++;
                            if (cQ>=4){
                                System.out.println("I have a book of queens");
                                for (int a = 0; a<4; a++){
                                    p2.remove("Queen");
                                }
                                p2book++;
                            }
                            break;
                        case "King":
                            cK++;
                            if (cK>=4){
                                System.out.println("I have a book of kings");
                                for (int a = 0; a<4; a++){
                                    p2.remove("King");
                                }
                                p2book++;
                            }
                            break;
                    }
                }
            }
            
        }
        
        if(p1book>p2book){
            System.out.printf("Player one wins with %d books.", p1book);
        }
        
        else if(p2book>p1book){
            System.out.printf("Player two wins with %d books", p2book);
        }
        
        else{
            System.out.printf("It's a tie. Both players have %d books", p1book);
        }
        
        System.out.println("Thanks for playing!");
        // TODO code application logic here
    }
    
}
