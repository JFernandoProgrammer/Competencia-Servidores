/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminumerosprimos;

/**
 *
 * @author samsung
 */
import java.util.Scanner;

public class RMINumerosPrimos {
	public static void main(String[] args) {
		//final double MS_POR_SEGUNDO=1000;
		final double NS_POR_SEGUNDO=1000000000;
		
		
		//calcula si es primo;
		 Scanner leer = new Scanner(System.in);
         //numeros primos
         int limite;
         System.out.println("Ingrese un numero: ");
         limite = leer.nextInt();
       //imptime mensaje hasta que número tiene que procesar
         System.out.println("los numeros primos hasta el numero: "+limite);
         //inicia conteo de tiempo
         long INICIO_NS = System.nanoTime();
         System.out.println("1");
         for(int i=1;i<limite;i++) {
             int count=0;
         for(int j=1;j<=i;j++) {	
            
             if(i%j==0)
                 count++;
             }
            if(count==2)
                System.out.println(i);
         }
         // finaliza el punto del proceso
		long DURACIÓN_NS = System.nanoTime()-INICIO_NS;
		double DURACIÓN_S2  = DURACIÓN_NS / NS_POR_SEGUNDO;	
		System.out.println("Test 2 resultados en Nanosegundos del servidor 1");
		System.out.println("El algoritmo se demoro " + DURACIÓN_NS + " Nanosegundos");;
		System.out.println("El algoritmo se demoro " + DURACIÓN_S2 + " Segundos");
		
	}
}
