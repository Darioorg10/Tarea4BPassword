/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea4bpassword;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author dario
 */
public class Tarea4BPassword {

    public static void main(String[] args) {
        // Opcion 1 - Pin 4 digitos
        for (int i = 0; i < 10; i++) {
           String pin = RandomStringUtils.randomNumeric(4);
            System.out.println(pin);
        }
        // Opción 2
        System.out.println("--------------------");
        for (int i = 0; i < 10; i++) {
           String password = RandomStringUtils.randomAlphanumeric(8);
            System.out.println(password);
        }
        
        // Opción 3
        System.out.println("---------------------");
        
        // Array de caracteres o tipo char
        char[] conjuntoCaracteres = {'a','z','b','$','&','*','1'};
        int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce el número de carácteres"));
        
            for (int i = 0; i < 10; i++) {
           String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
            System.out.println(password2);
        }
            
            String opcion ="""
                                       Elige qué quieres hacer:
                                        1. Crear pin para tarjetas móviles (4 carácteres)
                                        2. Generar contraseña para sistema operativo (8 carácteres)       
                                        3. """
        
    }
}
