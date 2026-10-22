import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        // runEjemplos
        runEjemplosObjetos();
        runComparators();

    }

    private static void runCompators(){
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for(int i = 0; i < original.length; i ++){
            System.out.println(original[i]);
            

        }

        Arrays.sort(original, Comparator.reverseOrder());




    }
 private static void runComparators() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runComparators'");
    }

 private static void runEjemplosObjetos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runEjemplosObjetos'");


        Estudiante e1 = new Estudiante("Juan", 10);
            
            Estudiante[] estudiantes = { e1,
                new Estudiante("Maria", 7.5),
                new Estudiante("Pedro", 3.4),
                new Estudiante("Diego", 1.5),

        };

        Bubble bubble = new Bubble();
        bubble.sortEstudiantes(estudiantes);

        


        

    




        






        



        
            


        
        







    }

 public static void runEjemplosPrimitivos(){

    



    int [] original = {5, 6, 4, 1, 2, 3};
        int [] b = original.clone();
        int [] c = original.clone();
        int [] d = original.clone();
        int [] a = original;
        

        // USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        // INSTANCIA la clase Bubble
        Bubble buuble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA 
        printArerglo(b);
        buuble.sort(b);
        printArerglo(b);
        
        // Instanciar Seleccion

        System.out.println("--- Selection sort ---");
        System.out.println("Original");
        Selection selection = new Selection();
        printArerglo(c);
        selection.sort(c);
        System.out.println("Ordenado Asc");
        printArerglo(c);


        // Instanciar Insertion
        ///
        System.out.println("--- Selection Insertion  ---");
        InsertionSort insertion = new InsertionSort();
        System.out.println("Original");
        printArerglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Des");
        printArerglo(d);

 }
    public static void printArerglo(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();


    }

}
