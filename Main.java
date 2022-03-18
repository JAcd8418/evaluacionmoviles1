package co.edu.cesde;

import java.util.Scanner;

public class Main {

    //definir variables
        public static void main(String[] args) {
            // write your code here
            Scanner inputdata = new Scanner(System.in);
            int km, dif;
            double imp ;
            long precio = 0;
            System.out.print("Ingrese el número de kilometros recorridos: ");
            km = inputdata.nextInt();
            if (km <= 300){
                precio = 300000;
                System.out.println(precio);
            }
            else
            if(km > 300 && km <= 1000) {
                dif = km - 300;
                System.out.println("la cantidad de kilometros mayor a 300 es: " + dif);
                System.out.println("los "+ dif + " * 15000 = $ " + dif * 15000);
                precio = (dif * 15000) + 300000;
                System.out.println("El valor a cancelar es: $ "+ precio);
            }
            else
            if (km >= 1000){
                dif = km - 1000;
                System.out.println("la cantidad de kilometros mayor a 1000 es: " + dif);
                System.out.println("los "+ dif + " * 10000 = $ " + dif * 10000);
                precio = (dif * 10000) + 300000;
                System.out.println("EL valor a cancelar es: $ " + precio);
            }
            imp = precio/ 1.16;
            System.out.println("El valor antes del impuesto es: $ " + imp);


        }
}
