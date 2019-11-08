package simulacroexamen;

import java.util.Scanner;

public class SimulacroExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        double acumuladorPares = 0;
        int numeroVecesPares = 0;
        double acumuladorImpares = 0;
        int numeroVecesImpares = 0;
//Haz esto
        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                acumuladorPares = acumuladorPares + numero;
                numeroVecesPares++;
            } else if (numero % 2 != 0) {

            }

        } while (numero >= 0);
       
        System.out.println("1- Suma de los números pares introducidos");
        System.out.println("2- Media de los números pares introducidos con dos decimales");
        System.out.println("3- Media de los números impares introducidos con dos decimales");
        System.out.println("4- Cuántos números hemos introducido");
        System.out.println("5- Cuántos números de los introducidos has sido ceros, cuántos han sido pares y cuantos impares");
        System.out.println("6- Salir");
        int opcion = 0;
        System.out.println("Introduce una opción");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(acumuladorPares);
                break;
            case 2:
                System.out.println(acumuladorPares / numeroVecesPares);
                break;
            case 3:
                break;
            case 4:
                break;

        }

    }

}
