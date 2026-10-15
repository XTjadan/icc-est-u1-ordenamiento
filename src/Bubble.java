public class Bubble {

    public int[] sort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
        // for j
            for(int j = 1 ; j < arreglo.length; j++) {
                //COMPRACION IF 
                if(arreglo[j - 1] >= arreglo[j]) {
                    // INTERCAMBIO
                    int aux = arreglo [j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;

        
                }
            }
            
        

    
        }
        return null;
    }
}
