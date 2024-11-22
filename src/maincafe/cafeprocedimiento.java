/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincafe;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class cafeprocedimiento {
    //Atributos con los precios
    int preciocafesmall = 45;
    int preciocafemedium = 56;
    int preciocafebig = 65;
    
    int preciomilk = 5;
    int preciocremora = 8;
    int preciosencillo = 0;
    
    int totalclientes = 0;
    int totalpequenos = 0;
    int totalmedianos = 0;
    int totalgrandes = 0;
    double totalcaja = 0;
    double preciofinal = 0;
    
    //Metodo del procedimiento de la compra
    public void compra(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione el tamano del cafe: 1 - Pequeno, 2 - Mediano, 3 - Grande");
        int tamanocafe = sc.nextInt();
        int precioinicial = 0;
        
        switch(tamanocafe){
            case 1:
                precioinicial = preciocafesmall;
                totalpequenos++;
            break;
            
            case 2:
                precioinicial = preciocafemedium;
                totalmedianos++;
            break;
            
            case 3:
                precioinicial = preciocafebig;
                totalgrandes++;
            break;
            
            default:
                System.out.println("Seleccion no valida, seleccione un numero de los mostrados");
            break;
        }
        
        System.out.println("Seleccione el agregado del cafe: 1 - Leche, 2 - Cremora, 3 - Sencillo");
        int agregadocafe = sc.nextInt();
        int precioagregado = 0;
        
        switch(agregadocafe){
            case 1:
                precioagregado = preciomilk;
            break;
            
            case 2:
                precioagregado = preciomilk;
            break;
            
            case 3:
                precioagregado = preciomilk;
            break;
            
            default:
                System.out.println("Seleccion no valida, seleccione un numero de los mostrados");
            break;
        }
        
   
        System.out.println("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();
        
        //Precio final
        preciofinal = precioinicial + precioagregado;
        if(edad >= 65){
            preciofinal = preciofinal * 0.25;
        }
        
        totalclientes++;
        totalcaja += preciofinal;
        
        System.out.println("El precio a pagar es: "+preciofinal);
    }
    
    public void cerrarcaja(){
        System.out.println("*****RESUMEN DEL DIA******");
        System.out.println("Clientes atendidos: " + totalclientes);
        System.out.println("Cafes pequenos vendidos: " + totalpequenos);
        System.out.println("Cafes medianos vendidos: " + totalmedianos);
        System.out.println("Cafes grandes vendidos: " + totalgrandes);
        System.out.printf("Total en caja del dia:"+ totalcaja);
    }
}

