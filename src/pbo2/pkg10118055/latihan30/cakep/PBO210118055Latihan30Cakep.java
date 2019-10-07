/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan30Cakep {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    
   
public static String input;


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ANSI_RED+"kamu "+ANSI_GREEN+"ngerjain sendiri" +ANSI_YELLOW+" latihan 17 sampe "+ANSI_BLUE+"latihan 30 ini ?"+ANSI_RESET);
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("jawab (yoi/enggak):");
        input = userInput.next();
        
        if("yoi".equals(input)){
        System.out.println(ANSI_RED+"cakep bener."+ANSI_PURPLE+"good job");
        } else if("enggak".equals(input)){
            System.out.println(ANSI_RED+"tetap cakep");
            System.out.println(ANSI_BLUE+"sing penting paham konsep");
            System.out.println("keep the code works dude");
        }
    }
    
}
