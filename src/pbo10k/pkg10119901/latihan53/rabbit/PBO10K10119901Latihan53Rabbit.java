/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan53.rabbit;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan program rabbit
 *
 */
public class PBO10K10119901Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("Peter", true, "grass", 4, "grey");
        
        System.out.println("Hello, His name is " + r.getName());
        System.out.println(r.getName() + " is Vegetarian? " + r.isVegetarian());
        System.out.println(r.getName() + " eats " + r.getEats());
        System.out.println(r.getName() + " has " + r.getNoOfLegs() + " legs");
        System.out.println(r.getName() + " color is " + r.getColor());
    }
}
