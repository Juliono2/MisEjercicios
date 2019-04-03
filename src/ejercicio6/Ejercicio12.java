/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio12 {
    public void operacion(){
        
     
        float Resultado;
        float a;
        float b;
        float c;
        
             
        System.out.println("Cual es el valor que le desea dar a ´A´: ");
        Scanner Entrada = new Scanner(System.in);
        a= Entrada.nextFloat();
        
        System.out.println("Cual es el valor que le desea dar a ´B´: ");
        Scanner Entrada2 = new Scanner (System.in);
        b = Entrada2.nextFloat();
        
        System.out.println("Cual es el valor que le desea dar a ´C´: ");
        Scanner Entrada3 = new Scanner(System.in);
        c = Entrada3.nextFloat();
        
        System.out.println("El valor de la expresion dada es: "+ Resultado);
        Resultado = (a+7*c)/(a+7*c)/(b+2-a)+2*b;
        
    }
}
