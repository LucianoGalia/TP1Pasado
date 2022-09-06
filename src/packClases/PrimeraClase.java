/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packClases;

import java.util.ArrayList;

public class PrimeraClase {
        int unEntero;
        String unaCadena;   
    
      public void mostrar() {
        
        System.out.println("Los atributos son: " + unaCadena + " y " + unEntero);
    }
    
    public static void main(String[] args) {

        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();  
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Auto";
        unObjeto2.unEntero = 7;
        unObjeto1.unaCadena = "Facultad";
        unObjeto1.unEntero = 2;
        unObjeto1.unaCadena = "Computadora";
        unObjeto1.unEntero = 3;
        unObjeto1.unaCadena = "Teclado";
        unObjeto1.unEntero = 6;
        
        ArrayList<PrimeraClase> guardoAtributos = new ArrayList <>();
        
        guardoAtributos.add(unObjeto1);
        guardoAtributos.add(unObjeto2);
        guardoAtributos.add(unObjeto3);
        guardoAtributos.add(unObjeto4);
        guardoAtributos.add(unObjeto5);       
        for(PrimeraClase x : guardoAtributos) {
          x.mostrar();
    }

}
