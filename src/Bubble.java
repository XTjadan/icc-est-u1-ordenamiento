import models.Estudiante;

public class Bubble {

    public void sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length ; i++) {
            System.out.println("Pasada = " + i);
            boolean commbinaciones = false;
        // for j
            for(int j = 1 ; j < arreglo.length - i; j++) {
                comparaciones++;
                //COMPRACION IF 
                if(arreglo[j - 1] > arreglo[j]) {
                    cambios++;
                    commbinaciones = true;
                    // INTERCAMBIO
                    int aux = arreglo [j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;

        
                }
            }
            if(!commbinaciones){
                break;
            }
            System.out.println("cambios: " + cambios);
            System.out.println("comparaciones: " + comparaciones);

    
        }
        System.out.println("Cambios = " + cambios);
        System.out.println("comparacion = " + comparaciones);
        
    }

    public void sortEstudiantesNota(Estudiante[] estudiantes ){
        for(int i = 0; i < estudiantes.length; i++){
            boolean cambio = false;
            for(int j = 0; j < estudiantes.length - i - 1; j++){
                if(estudiantes[j].getNota() > estudiantes[j + 1].getNota()){
                    //Intercambio
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    cambio = true;

                }
                

            }
            if ((!cambio)) {
                break;
            }


        }


    }



    public void sortEstudiantesName(Estudiante[] estudiantes ){
        for(int i = 0; i < estudiantes.length; i++){
            boolean cambio = false;
            for(int j = 0; j < estudiantes.length - i - 1; j++){
                if(estudiantes[j].getNota() > estudiantes[j + 1].getNota() ) {
                    //Intercambio
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    cambio = true;

                }
                

            }
            if ((!cambio)) {
                break;
            }


        }


    }

        
   public void sortEstudiantes(Estudiante[] estudiantes ){
        for(int i = 0; i < estudiantes.length; i++){
            boolean cambio = false;
            for(int j = 0; j < estudiantes.length - i - 1; j++){
                if(estudiantes[j].getNota() > estudiantes[j + 1].getNota()){
                    //Intercambio
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    cambio = true;

                }
                

            }
            if ((!cambio)) {
                break;
            }


        }


    } 









}
