public class App {
    public static void main(String[] args) throws Exception {
        
        int [] original = {5, 6, 4, 1, 2, 3};
        int [] b = original.clone();
        int [] c = original;

        // USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        // INSTANCIA la clase Bubble
        Bubble buuble = new Bubble();
        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA 
        printArerglo(b);
        buuble.sort(b);
        printArerglo(b);
    
    }

    public static void printArerglo(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();


    }

}
