/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Player {
    private final Random rand = new Random();
    
    public Player() {}
    
    public int random_guess()
    {
        return rand.nextInt(6)+1;
    }
    public int manual_guess()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
