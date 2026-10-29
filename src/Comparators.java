import java.util.ArrayList;
import java.util.List;
import models.Estudiante;
import java.util.Comparator;

public class Comparators {

    private List<Estudiante> estList;
    private Estudiante[] estArray;
    
    
    public Comparators() {
    Estudiante e1 = new Estudiante("Juan", 10);    
    estArray = new Estudiante[] {e1,
                new Estudiante("Maria", 7.5),
                new Estudiante("Pedro", 3.4),
                new Estudiante("Pedro", 7),
                new Estudiante("Diego", 6.8),


    };
        estList = new ArrayList<>(List.of(estArray));

        //Llamaada ejemplo
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        
    }    
    
    private void print(List<Estudiante> list){
        // for est in list:
        for(Estudiante e : list){
            System.out.println(e);

        }

        
    }
    /**
     * Comparator -> por VALOR  
     * Lamba extractora directa: nota ascendente
     */

    public void ejemplo1() {
        System.out.println("Ejemplo 1");
        List<Estudiante> lista = new ArrayList<>(estList);
        //Comparator -> obj != (Envolvete de primitivo ni Sitrng )
        Comparator <Estudiante> comparator = Comparator.comparingDouble(x -> x.getNota());
        lista.sort(comparator);
        //imprimir 
        print(lista);

    }

    
    /*
    *Ordena por Nota Ascendentemente
    *Comparot -> por Valor
    *Referencia
     */

    public void ejemplo2() {
        System.out.println("Ejemplo 2");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);
        print(lista);



    }
    /*
    *Ordena por Nota Ascendentemente
    *Comparot -> por Valor
    *Referencia
     */
    
    private void ejemplo3() {
        System.out.println("Ejemplo 3");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante:: getNota).reversed();
        lista.sort(comparator);
        print(lista);


    }
    
    private void ejemplo4() {
        System.out.println("Ejemplo 4");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante::getName);
        lista.sort(comparator);
        print(lista);
        





}



    /*
    *Ordena por Nota ascendente 
    *Compator -> compara Dos tipos
    *Lamdba
     */
     private void ejemplo5() {
        System.out.println("Ejemplo 5");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1 , e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        print(lista);

     }


    
     private void ejemplo6() {
        System.out.println("Ejemplo 6");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1 , e2) -> e1.getName().compareTo(e2.getName());
        lista.sort(comparator);
        print(lista);

     }



     private void ejemplo7() {
        System.out.println("Ejemplo 7");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1 , e2) -> e2.getName().compareTo(e1.getName());
        lista.sort(comparator);
        print(lista);

     }


     private void ejemplo8() {
        System.out.println("Ejemplo 8");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1 , e2) -> e1.getName().compareTo(e2.getName());
        lista.sort(comparator);
        print(lista);

     }






}

