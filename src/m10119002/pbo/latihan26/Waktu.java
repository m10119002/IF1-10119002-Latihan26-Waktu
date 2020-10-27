/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan26;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program waktu saat ini
 * 
 * 
 */
public class Waktu {
    
    public static void main(String[] args) {
        String waktu = "";
        
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat
        ("EEEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
        waktu = formatter.format(date);
        
        System.out.println("Hari ini adalah hari : ".concat(waktu));
    }
}
