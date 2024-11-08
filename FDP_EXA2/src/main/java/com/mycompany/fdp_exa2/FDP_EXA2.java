/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fdp_exa2;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class FDP_EXA2 {

    public static void main(String[] args) {
        int piedra=1, tijera=2, papel=3;
        int num, i=0;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Recuerde que;");
        System.out.println("Piedra=1");
        System.out.println("Tijera=2");
        System.out.println("Papel=3");
        System.out.println("Diga un numero del 1-3");
        num=cap.nextInt();
        if(Math.random()==piedra&&num==tijera){
            System.out.println("gano maquina");
        }
    }
}
