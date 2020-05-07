/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Canan EROĞLU
 */
public class VeriTabani {
    private final String url = "jdbc:postgresql://localhost:5432/nesneOdev";
    private final String user = "postgres";
    private final String password = "Canan.123";
    public Connection conn = null;
    public PreparedStatement pst=null;
    public Connection baglanti() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Bağlantı başarılı.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void kullaniciKontrol(Kullanici kullanici) throws SQLException 
    {
        Statement stmt = conn.createStatement();
        String query = "select * from kullanici";
        ResultSet rs =  stmt.executeQuery(query);
        while (rs.next()) {
           // System.out.println(kullanici.getSifre()+" "+kullanici.getKullaniciAdi()); 
            String ad = rs.getString("kullaniciAdi");
            String sifre = rs.getString("sifre");
           if(ad.equals(kullanici.getKullaniciAdi()) && sifre.equals(kullanici.getSifre()))
           {
               JOptionPane.showMessageDialog(null,"Hoşgeldiniz");
               anaMenu amp = new anaMenu();
               girisEkrani gp = new girisEkrani();
               //gp.dispose();
               gp.setVisible(false);
               
               amp.setVisible(true);
               
           }
            else
            {
                JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre yanlış.");
            }
        }
        
    }
        
    
}
