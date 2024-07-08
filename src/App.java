import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas(letras de un caracter conformen a otra)
        runEjerccios();
    }

    //Static xq estan en main, existen sin crear una instancia, 
    private static void runEmpleadoExample() {

        System.out.println("\n Lista de Empleados");
        EmpleadoContoller empCntrl = new EmpleadoContoller();
        empCntrl.addEmpleado(new Empleado(1, "Diana", "Developer"));
        empCntrl.addEmpleado(new Empleado(8, "Carolina", "Designer"));
        empCntrl.addEmpleado(new Empleado(2, "Sebas", "Developer"));
        empCntrl.addEmpleado(new Empleado(5, "Carolina", "Analyst"));

        empCntrl.imprimirEmpleados();

    }

    private static void runMapExample() {
        new Mapa();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        // Test para sumatoriaDeDos
        int[] nums = { 11, 2, 7, -2 };
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println(
                    "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron dos números que sumen " + objetivo);
        }

        objetivo = 10;
        resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println(
                    "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron dos números que sumen " + objetivo);
        }

        //// EJERCICIO 2
        // Test para areAnagrams
        String str1 = "listen";
        String str2 = "silent";
        boolean sonAnagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

        str1 = "hello";
        str2 = "bello";
        sonAnagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

    }
}
