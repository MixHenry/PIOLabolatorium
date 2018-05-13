/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        Gamemaster gamemaster = new Gamemaster(); 
        Player player = new Player();
        
        int mode = 1; //1-comp 2-human
        
        int randomInteger = gamemaster.rollDice();
        int randomIntegerGuess = player.random_guess();
        int manualIntegerGuess = player.manual_guess();
        if(mode==1){
            while(randomInteger != randomIntegerGuess)
            {
               System.out.println("Nie udało się. " + randomInteger + " " + randomIntegerGuess);
               randomInteger = gamemaster.rollDice();
               randomIntegerGuess = player.random_guess();
            }
            System.out.println("Wygrałeś " + randomInteger + " " + randomIntegerGuess);
        }
        else if(mode==2){
            while(randomInteger != randomIntegerGuess){
               System.out.println("Nie udało się. " + randomInteger + " " + randomIntegerGuess);
               randomInteger = gamemaster.rollDice();
               randomIntegerGuess = player.manual_guess();
            }
        System.out.println("Wygrałeś " + randomInteger + " " + randomIntegerGuess);
        }
    }
    
}
