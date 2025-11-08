/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author sofim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio 2
        Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + "Área: " + f.calcularArea());
        }
    }

}
