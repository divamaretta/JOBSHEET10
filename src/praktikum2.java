/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Maretta
 */
public class praktikum2 {
    
    public static void main(String[] args) {
        int[] data = new int[]{ 83, 76, 45, 90, 85, 80, 78, 74};
        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
            
        }
        double rtrt = 0;
        for (int a = 0; a < data.length; a++)
            rtrt+=data[a]; rtrt/=data.length; 
            System.out.print("\nNilai Rata-Rata pada Array: " + rtrt);
            System.out.println("\n");
            System.out.print("Nilai yang ada diatas Rata-Rata :");
            for (int p = 0; p < data.length; p++) {
                if (data[p]>rtrt) {
                    System.out.print(data[p]+"\t");
                    
                }
            
        }
        
        
            
        
        
                
                
         
                
            
            
        }
    }
       
    
    

