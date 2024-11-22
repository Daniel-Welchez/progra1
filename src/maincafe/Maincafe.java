/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maincafe;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Maincafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        cafeprocedimiento procedimiento = new cafeprocedimiento();
        int opcion;
        
        do{
            System.out.println("*****MENU PRINCIPAL******");
            System.out.println("1. Procesar nueva compra");
            System.out.println("2. Cerrar caja y salir");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    procedimiento.compra();
                break;
                
                case 2:
                    procedimiento.cerrarcaja();
                break;
                
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                break;
            }
        } while(opcion != 2);
    }
}
    
    

