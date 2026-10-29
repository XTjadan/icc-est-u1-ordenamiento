import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
       // runEjemplosObjetos();
       // runComparators();
        //runComparatorsObj();
        //runComparatorsObj2();

        Comparators comparators = new Comparators();


    }

    private static void runComparatorsObj2(){
            Estudiante e1 = new Estudiante("Juan", 10);           
            Estudiante[] estudiantes = { e1,
                new Estudiante("Maria", 7.5),
                new Estudiante("Pedro", 3.4),
                new Estudiante("Diego", 6.8),
    };

    Comparator.naturalOrder();
    Comparator.reverseOrder();
    Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());
    Arrays.sort(estudiantes, compNota);
    System.out.println(Arrays.toString(estudiantes));

    List<Estudiante> estudianteLista = new ArrayList<>(List.of(e1,           
                new Estudiante("Maria", 7.5),
                new Estudiante("Pedro", 3.4),
                new Estudiante("Diego", 6.8)

    ));

}

    private static void runComparatorsObj() {
            List<Integer> numeros = new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));
                
            //Orden de menor a mayor

            numeros.sort(Comparator.naturalOrder());
            numeros.sort(null);
            System.out.println(numeros);
            // ordenar de mayor a menor
            numeros.sort(Comparator.reverseOrder());
            System.out.println(numeros);

    }

    private static void runComparators() {
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for(int i = 0; i < original.length; i ++){
            System.out.println(original[i]);
        }

        System.out.println("------");
        Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
        



    }
 
    

 private static void runEjemplosObjetos() {

        Estudiante e1 = new Estudiante("Juan", 10);
        
            Estudiante[] estudiantes = { e1,
                new Estudiante("Maria", 7.5),
                new Estudiante("Pedro", 3.4),
                new Estudiante("Diego", 3.5),
        };

        Bubble bubble = new Bubble();
        printArergloEst(estudiantes, "original");
        bubble.sortEstudiantes(estudiantes);
        printArergloEst(estudiantes, "ordenado");
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

    public static void printArergloEst(Estudiante[] arr, String mensaje) {
    System.out.println("--- " + mensaje + " ---");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}



}
