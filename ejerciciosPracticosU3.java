package unidad3cacodo;
import java.util.ArrayList;
import java.util.Iterator;

public class Unidad3CaCodo {
    public static void main(String[] args) {
        
        //4)Crear un ArrayList y llenarlo con al menos 10 elementos.
        System.out.println("Ejercicio 4)");
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alejandra");
        nombres.add("Braulio");
        nombres.add("Carina");
        nombres.add("Diego");
        nombres.add("Elizabeth");
        nombres.add("Fernando");
        nombres.add("Gabriela");
        nombres.add("Héctor");
        nombres.add("Isabel");
        nombres.add("Julián");
        
        System.out.println("El ArrayList tiene " + nombres.size() + " elementos.");
        System.out.println("Los elementos del ArrayList son: " + nombres);
        
        System.out.println("");
        System.out.println("*****************************************************************************************");
        System.out.println("");
        
        //9)Dado un ArrayList con números, desarrolle un método que muestre por 
        //pantalla el número mayor y otro que muestre el menor de la lista.
        //Utilice un Iterador para recorrer el ArrayList.
        System.out.println("Ejercicio 9)");
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(65);
        numeros.add(1655);
        numeros.add(164);
        numeros.add(1546);
        numeros.add(-658);
        numeros.add(545);
        
        //Maximo
        Iterator<Integer> nummax = numeros.iterator();
        int max;
        max = numeros.get(0); //Establezco el primer elemento de la lista como el máximo, por si son todos enteros negativos
        int aux1;
        while(nummax.hasNext()){
            aux1 = nummax.next();
            if (aux1 > max) {
               max = aux1;
            }
        }
        System.out.println("El máximo número de la Lista es: " + max);
        
        //Mínimo
        Iterator<Integer> nummin = numeros.iterator();
        int min;
        min = numeros.get(0); //Establezco que el primer elemento de la lista sea el mínimo
        int aux2;
        while(nummin.hasNext()){
            aux2 = nummin.next();
            if (aux2 < min) {
               min = aux2;
            }
        }
        System.out.println("El mínimo número de la Lista es: " + min);
    }
}