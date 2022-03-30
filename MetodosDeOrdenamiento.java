/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class MetodosDeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    }
        
}


/*
METODO BURBUJA

public static void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
    }

METODO INSERCION
public static void Insercion (int[] vector) {
      for (int i=1; i < vector.length; i++) {
         int aux = vector[i];
         int j;
         for (j=i-1; j > =0 && vector[j] > aux; j--){
              vector[j+1] = vector[j];
          }
         vector[j+1] = aux;
      }
   }

METODO SELECCIÓN
public static void Seleccion(int[]matrix){
        int i, j, k, p, buffer, limit = matrix.length-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i < = limit; i++){
                if(matrix[i] < matrix[p]) p = i;
                if(p != k){
                    buffer = matrix[p];
                    matrix[p] = matrix[k];
                    matrix[k] = buffer;
                }
            }
        }
    }

METODO SHELL SHORT
public static void shellSort(int[] matrix) {
    for ( int increment = matrix.length / 2;increment > 0;
          increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
        for (int i = increment; i < matrix.length; i++) {
            for (int j = i; j > = increment && matrix[j - increment] > matrix[j]; j -= increment) {
                int temp = matrix[j];
                matrix[j] = matrix[j - increment];
                matrix[j - increment] = temp;
            }
        }
    }
}
*/