import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); // de nuevo se crea el sacaner para leer teclado
        System.out.println("ingresa el nombre de la bebida");// se pide la bebida
        String nombre = sc.nextLine();// lee la linea
        System.out.println("ingresa la temperatura");
        double temperatura = sc.nextDouble();// lee el numero en decimal

        String clasificacion;// se crea la variable para guarar el resultado
        if(temperatura > 60){// condicionales
            clasificacion = "caliente";// se clasifica
        } else if (temperatura >=30) {
            clasificacion="templada";

        }else {
            clasificacion =" fria ";
        }
        System.out.println(nombre +" "+ clasificacion);// mostramos resultado y epsacios para no pegarlos
        sc.close();

    }
}


