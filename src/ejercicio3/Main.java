/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sofim
 */
public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 120000));
        empleados.add(new EmpleadoTemporal("Luis", 1500, 80));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + "Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}
