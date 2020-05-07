/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;
/**
 * @author Canan EROĞLU
 */
public class Kullanici {
    private static Kullanici kullanici;
    private Kullanici() {    }
    public static Kullanici getKullanici()
    {
        if(kullanici==null)
            kullanici=new Kullanici();
        return kullanici;
    }
    private String kullaniciAdi;
    private String sifre;
    private double cihazSicaklik;
    CSicaklik sicaklik=new CSicaklik();
    Sogutucu sogutucu=new Sogutucu();
    public Sogutucu getSogutucu()
    {
        return sogutucu;
    }
    public void setCihazSicaklik()
    {
        cihazSicaklik=sicaklik.getSicaklik();
    }
    public double getCihazSicaklik()
    {
        setCihazSicaklik();
        return cihazSicaklik;
    }
    public void setKullaniciAdi(String kullaniciAdi)
    {
        this.kullaniciAdi=kullaniciAdi;
    }

    public String getKullaniciAdi()
    {
        return kullaniciAdi;
    }

    public void setSifre(String sifre)
    {
        this.sifre=sifre;
    }
    public String getSifre()
    {
        return sifre;
    }
}
