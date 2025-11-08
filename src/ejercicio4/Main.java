/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.List;

/**
 *
 * @author sofim
 */
public class Main {

    public static void main(String[] args) {
        List<Animal> animales = List.of(
                new Perro("Harry"),
                new Gato("Michii"),
                new Vaca("Lola")
        );

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }

    }
}
