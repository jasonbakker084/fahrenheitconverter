/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.fahrenheit;
import java.util.Scanner;


/**
 *
 * @author jasonbakker
 */
public class Main {
    public static void main(String[] args) {
        
    float temperature;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter temperature in Fahrenheit");
    temperature = in.nextInt();
 
    temperature = ((temperature - 32)*5)/9;
 
    System.out.println("temperature in Celsius = " + temperature);
        System.out.println("jason");
        System.out.println("bakker");
        System.out.println("test1");
        System.out.println("test2");
        System.out.println("test3");
        System.out.println("test4");
  }
}
