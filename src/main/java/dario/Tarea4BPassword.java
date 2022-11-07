/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dario;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author dario
 */
public class Tarea4BPassword {

    public static void main(String[] args) {

        String opcion = "";

        do {

            String texto = """
                                       Elige qué quieres hacer:
                          ----------------------------------------------------------------------------------------------------
                                        1. Crear pin para tarjetas móviles (4 carácteres)
                                        2. Generar contraseña para sistema operativo (8 carácteres)       
                                        3. Genera una secuencia de carácteres de la longitud que tu elijas
                                        Para terminar escribe: "salir"
                          ----------------------------------------------------------------------------------------------------
                                """;

            opcion = JOptionPane.showInputDialog(texto);

            switch (opcion) {
                case "1":
                    for (int i = 0; i < 10; i++) {
                        String pin = RandomStringUtils.randomNumeric(4);
                        System.out.println(pin);
                    }
                    break;
                case "2":
                    for (int i = 0; i < 10; i++) {
                        String password = RandomStringUtils.randomAlphanumeric(8);
                        System.out.println(password);
                    }
                    break;
                case "3":
                    // Array de caracteres o tipo char
                    
                    try {
                    char[] conjuntoCaracteres = {'a', 'z', 'b', '$', '&', '*', '=', '@', '~', '¡'};
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad de carácteres que usará la contraseña"));
                    for (int i = 0; i < 10; i++) {
                        String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
                        System.out.println(password2);
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No has introducido un número entero");
                }

                break;
            }

            if (opcion.equalsIgnoreCase("salir")) {
                JOptionPane.showMessageDialog(null, "Adiós");
            }

        } while (!opcion.equalsIgnoreCase("salir"));

    }
}
