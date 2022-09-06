/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
       int enteroNum = 1;
       float flotanteNum1 = 2.5f;
       float flotanteNum2 = 4.5f;
       float flotanteNum3 = 5.5f;
       float flotanteNum4 = 2.5f;
       float flotanteNum5 = 1.5f;
       double variableDoble = 2.4;
       
       String cadena = "hola Mundo";
                                        //IMPRIMO COMO PRUEBA AL PUNTO 3)
       
       /* System.out.println(cadena);
        System.out.println(enteroNum);
        System.out.println(flotanteNum1);
        System.out.println(variableDoble);*/
        
        ArrayList <Float> ListaRales = new ArrayList <>(); //4)PROCEDO A HACER EL PROMEDIO DE FLOATS
        
        ListaRales.add(flotanteNum1);
        ListaRales.add(flotanteNum2);
        ListaRales.add(flotanteNum3);
        ListaRales.add(flotanteNum4);
        ListaRales.add(flotanteNum5);
        
        float promedio = 0;
        float contador = 0;
        float resultado;
        
        for(float numero:ListaRales) {
            promedio += numero;
            contador += 1;
            System.out.println(numero);
        }
        
        resultado = promedio / contador;
        
        System.out.println("el promedio es: " + resultado);
    }
}
