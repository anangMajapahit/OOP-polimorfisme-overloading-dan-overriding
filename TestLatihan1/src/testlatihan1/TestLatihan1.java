/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlatihan1;

/**
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 */
public class TestLatihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        
        y.m2(); //ini adalah pemangilan jama' dari kelas anak y yang mana sudah dijadikan stu juga untuk pemangilan dari kelas induk
        
        x.m1(); //ini adalah pemanggilan secara masing2 dari kelas induk
        y.m1(); //ini adalah pemanggilan secara masing2 dari kelas anak
        
        x = y; //parent pointing to object of child 
        
        x.m1(); //ini juga sama dengan yang diatas tadi pemanggilan masing2 dari kelas induk
        y.a = 10; 
    }
    
}
