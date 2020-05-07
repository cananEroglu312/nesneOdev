/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;

/**
 *
 * @author Canan EROĞLU
 */
public class Sogutucu implements Observer{
    @Override
    public void update(boolean sogutucuDurum)
    {
        if(sogutucuDurum==true)
            sogutucuyuAc();
        else 
            sogutucuyuKapat();
    }
    private boolean durum;
    Sogutucu()
    {
        durum=false;
    }
    private void sogutucuyuAc()
    {
        durum=true;
    }
    private void sogutucuyuKapat()
    {
        durum=false;
    }
    public boolean getDurum()
    {
        return durum;
    }
}
