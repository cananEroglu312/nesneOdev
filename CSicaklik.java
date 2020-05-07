/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;

import java.util.Random;

/**
 *
 * @author Canan EROĞLU
 */
public class CSicaklik implements SicaklikInterface{
    private double sicaklik;
    CSicaklik()
    {
        setSicaklik();
    }
    Random rand = new Random();
    public void setSicaklik()
    {
        sicaklik =rand.nextInt(30)+10;
    }
    
    
    public double getSicaklik()
    {
        return sicaklik;
    }
}
