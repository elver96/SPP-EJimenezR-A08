/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglos;

/**
 *
 * @author elver
 */
public class EjercicioArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Este programa promedia el contenido de las pocosiones pares y suma 
        el contenido de las pocisiones nones de un arreglo
        */
        int promedio, sumaPar=0,sumaNon=0, cont=0,promI,cont2=0;
        int [][]matrix={{10,30,89,48,56},
                        {32,23,84,20,10},
                        {72,108,71,402,8}};
        //i inicia en 0, el ciclo se ejecuta mientras i < tamaño de arreglo 
        //i se incrementa de 2 en 2
    for (int i=0;i<matrix.length;i++){
        for(int j=0; j<matrix[i].length;j=j+2){
            sumaPar=sumaPar+matrix[i][j];
            cont++;
        }
    }
    promedio =sumaPar/cont;
        System.out.println(promedio);
    
        for(int i=0; i< matrix.length;i++){
            for(int j=1;j<matrix[i].length;j=j+2){
                sumaNon=sumaNon+matrix[i][j];
                cont2++;
            }
        }
            promI=sumaNon/cont2;
            System.out.println(sumaNon);
            System.out.println(promI);
    }
    
}
