public class Selection {

    public void sort(int[] arreglo){
        int cambios = 0;
        int combinaciones = 0;
        for(int i = 0; i < arreglo.length;i ++) {
            int min = i;
            System.out.print("Pasada = " + i );
            System.out.print(" | ");
            System.out.println("cambio = " + arreglo[i]  );
            
            for(int j = i + 1; j < arreglo.length ; j++){
                combinaciones++;
                if(arreglo[j] < arreglo[min]){
                    min = j;    

                
                }

            }
            if(min != i){
                
                int temp = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = temp;
                cambios++;
                
            }           
        }
        System.out.println("Cambios = " + cambios);
        System.out.println("Combinaciones = " + combinaciones);
        
    }
    
}
