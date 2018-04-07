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
public class Gamemaster {
    private final Random rand = new Random();
    
    public Gamemaster() {}
    
    public int rollDice()
    {
        return rand.nextInt(6)+1;
    }
}