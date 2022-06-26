package com.mycompany.rockpaperscissorgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Assassin
 */

public class RockPaperScissor {
    public static void main(String[] md){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int count =1;
        int flag =0;
        int p_point = 0, c_point = 0;
        System.out.println("WELCOM TO ROCK, PAPER & SCISSOR GAME");
        
        while(count<=5){
            System.out.print("\n-----------------------------------------------------\n");
            System.out.printf("ROUND %d\n\n",count);
            System.out.println("PLAYER : SELECT \n(1)ROCK \n(2)PAPER \n(3)SCISSOR");
            int opt = sc.nextInt();
            switch(opt){
                case 1 ->System.out.println("\nPLAYER: ROCK");
                
                case 2 ->System.out.println("\nPLAYER: PAPER");
                
                case 3 ->System.out.println("\nPLAYER: SCISSOR");
                
                default ->System.out.println("\noops!!!");
                
            }
            int min = 1;
            int com_opt = min+rand.nextInt(3);
            
            switch(com_opt){
                case 1 ->System.out.println("\nCOMPUTER: ROCK");
                
                case 2 ->System.out.println("\nCOMPUTER: PAPER");
                
                case 3 ->System.out.println("\nCOMPUTER: SCISSOR");
                
                default ->System.out.println("\noops!!!");
                
            }
            
            
            
            // if both chooses same option: DRAW
            
            if(opt==com_opt){
                System.out.printf("\nROUND %d: DRAW\n",count);
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
            //rock and paper choosen : paper wins
            
            else if(opt==1 && com_opt==2 ){
                System.out.printf("\nROUND %d: COMPUTER WINS\n",count);
                c_point +=1;
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
             //paper and rock choosen : paper wins
            
            else if(opt==2 && com_opt==1){
                System.out.printf("\nROUND %d: PLAYER WINS\n",count);
                p_point += 1;
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
            //rock and scissor choosen : rock wins
            
            else if(opt==1 && com_opt==3){
                System.out.printf("\nROUND %d: PLAYER WINS\n",count);
                p_point +=1;
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
            //scissor and rock choosen : rock wins
            
            
            else if(opt==3 && com_opt==1){
                System.out.printf("\nROUND %d: COMPUTER WINS\n",count);
                c_point +=1;
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
            //paper and scissor choosen : scissor wins
            
            else if(opt==2 && com_opt==3){
                System.out.printf("\nROUND %d: COMPUTER WINS\n",count);
                c_point+=1;
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
            //scissor and paper : scissor wins
            
            else if(opt==3 && com_opt==2){
                System.out.printf("\nROUND %d: PLAYER WINS\n",count);
                p_point+=1;
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            
            else{
                System.out.printf("\nROUND %d: FAULTY\n",count);
                
                System.out.printf("PLAYER SCORE: %d COMPUTER SCORE: %d",p_point,c_point);
            }
            count++;
            
        }
        
        System.out.print("\n-----------------------------------------------------\n");
        System.out.print("\n-----------------------------------------------------\n");
        if(c_point>p_point)
            System.out.println("COMPUTER IS THE WINNER!!!!");
        
        else 
            System.out.println("PLAYER IS THE WINNER!!!!");
        
        
    }
    
}

