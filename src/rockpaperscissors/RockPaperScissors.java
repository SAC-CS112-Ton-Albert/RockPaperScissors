/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;


import java.util.Scanner;
/**
 *
 * @author albertton
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    int one; //playertwo     
    int two; //playerone
    
    System.out.println("Player 1, enter 1 for rock, 2 for paper, or 3 for scissors:");
    one  = input.nextInt(); // scanner for player 2
    
    System.out.println("Player 2, enter 1 for rock, 2 for paper, or 3 for scissors:");
    two  = input.nextInt(); // scanner for player 1
   
   
    if (one == 1) 
       if (two == 1) 
         System.out.println("It's a tie!");
    if (one == 2) 
       if (two == 2) 
         System.out.println("It's a tie!");
    if (one == 3) 
       if (two == 3) 
         System.out.println("It's a tie!");
    if (one == 1) //rock
       if (two == 3) //scissors
         System.out.println("Rock beats scissors. Player 1 wins!!");
    if (one == 2) //paper 
        if (two == 1) //rock
         System.out.println("Paper beats rock. Player 1 wins!!"); 
    if (one == 3) //scissors
        if (two == 2) //paper
         System.out.println("Scissor beats paper. Player 1 wins!!"); 
    if (one == 1) //rock
        if (two == 2) //paper
         System.out.println("Paper beats rock. Player 2 wins!!"); 
    if (one == 2) //paper
        if (two == 3) //scissors
         System.out.println("Scissor beats paper. Player 2 wins!!!"); 
    if (one == 3) //scissors
        if (two == 1) //rock
         System.out.println("Rock beats scissors. Player 2 wins!!"); 
    else 
         System.out.println("Invalid user input."); 
    
   
    }
    
}
