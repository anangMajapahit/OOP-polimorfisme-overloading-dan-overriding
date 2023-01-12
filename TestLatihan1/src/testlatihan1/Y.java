/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlatihan1;

/**
 *
 * @author UmumPRT
 */
public class Y extends X{
    int c; //new instance variable of class y
    
    public void m1(){
        //Overriden method
        System.out.println("This is method m1 of class Y");
    }
    public void m2(){
        super.m1();
        System.out.println("this is method m2 of class Y");
    }
}
