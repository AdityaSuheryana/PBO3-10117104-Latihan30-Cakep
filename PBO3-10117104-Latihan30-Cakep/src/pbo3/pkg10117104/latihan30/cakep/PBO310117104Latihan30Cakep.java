/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama         : Aditya Suheryana
 * Kelas        : IF-3/PBO3
 * Nim          : 10117104
 * Deskripsi    : Menampilkan Program Cakep yang teks nya warna warni
 */
public class PBO310117104Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner scn =new Scanner(System.in);   
    System.out.println((char)27+ "[01;31mKamu"+(char)27+
            "[01;32m ngerjain sendiri"+(char)27+"[01;33m Latihan "
                +(char)27+"[01;34m sampe Latihan 30 ini ?");
                System.out.printf((char)27+"[01;34mjawab "+(char)27+
                "[01;35m(Yoi/Enggak) : ");
    String jawab=scn.next();
    System.out.println("");
    if("Yoi".equals(jawab) || ("yoi".equals(jawab))){
        System.out.println((char)27+"[01;31mCakep Bener. "+(char)27+
                "[01;35mGoodJob");
        
        
    }
    if("Enggak".equals(jawab) || ("ENGGAK".equals(jawab)))
    {
        System.out.println((char)27+"[01;31mTetep Cakep Sih");
        System.out.println((char)27+"[01;36mSing Penting Paham Konsep nya yen");
        System.out.println("Keep the code works dude");
    }    
    }
    
}
