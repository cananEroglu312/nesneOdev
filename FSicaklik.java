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
public class FSicaklik implements SicaklikInterface{
    private double sicaklik;
    FSicaklik()
    {
        setSicaklik();
    }
    Random rand = new Random();
    public void setSicaklik()
    {
        int c=rand.nextInt(30)+10;
        sicaklik = (c*1.8)+32;
    }
    
    public double getSicaklik()
    {
        return sicaklik;
    }
}
