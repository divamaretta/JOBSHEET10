/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequential.search;

import java.util.Scanner;

/**
 *
 * @author Diva Maretta
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cari;
        boolean  found = false;
        String[] data =new String[] {"Mie aceh", "Sate", "Soto medan", "Bihun Kari"," Anyang", "Sate","Nasi goreng"};
        Scanner div= new Scanner(System.in);
        System.out.println("masukkan nama makanan yang ingin  di cari : ");
        cari = div.next();
        for (String data1 : data) {
            if(cari == null ? data [1] == null : cari.equals(data [1])){
                found = true;
                break;
            }
        }
        
        if (found == true){
            System.out.println("Data ditemukan!");
        }else{
            System.out.println("Data tidak ditemukan!");
        }
        
        
    }}

    