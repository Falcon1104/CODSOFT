/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergame;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author kulka
 */

class Game{

    public Random ran;
    public int randomNumberGenerated;

    public int userInput;
    public Scanner sc;


public Game(){
   
       
       ran=new Random() ;
       randomNumberGenerated=ran.nextInt(100);
       userInput=0;
       sc=new Scanner(System.in); 


}


public void guess(){


int i=0;

while(i==0){
    
    
    
    
    for(int j = 1;j <=  5;  j++){
        
        randomNumberGenerated=ran.nextInt(100);
        
        System.out.println("Guess the number between 0 and 100");
        userInput=sc.nextInt();
        
        
        if(userInput==randomNumberGenerated){
            
            System.out.println("Correct Guess and Score : " + (600-(j*100)));
            System.out.println("Press 0 to continue or any other key to exit");
            i=sc.nextInt();
            break;
            
        }
        if(j==5){
            System.out.println("The number was :"+randomNumberGenerated);
            System.out.println("Score : 0 ! try again");
            System.out.println("Game over press 0 to play again and press any other key to exit ");
            i=sc.nextInt();
            
        }
        
     }
    
    
    
    
    

}

}



}


public class RandomNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome lets start !!!");
        Game g1=new Game() ;
        g1.guess();
        
    }
    
}
