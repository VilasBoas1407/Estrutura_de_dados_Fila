package com.mycompany.fila;

import java.util.Random;


/**
 *
 * @author 119119592 - Lucas Vilas Boas, Leandro César
 */
public class TesteFila {

    public static void main(String[] args) {
        System.out.println("============ ATIVIDADE FILA =============");

        Fila p = new Fila();
        int max = 10, r, n;
        Random random = new Random();

        try {
            for (int i = 0; i < max; i++) {
                r = Math.abs(random.nextInt() % max);
                p.insert(r, i);
                
            }
            p.print();
            p.remove();
            System.out.println("======================================");
            p.print();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}