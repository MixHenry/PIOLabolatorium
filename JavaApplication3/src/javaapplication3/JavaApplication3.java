/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Random;

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
        
        int randomInteger = gamemaster.rollDice();
        int randomIntegerGuess = player.guess();
        
        while(randomInteger != randomIntegerGuess)
        {
            System.out.println("Nie udało się. " + randomInteger + " " + randomIntegerGuess);
            randomInteger = gamemaster.rollDice();
            randomIntegerGuess = player.guess();
        }
        System.out.println("Wygrałeś " + randomInteger + " " + randomIntegerGuess);
    }
    
}
