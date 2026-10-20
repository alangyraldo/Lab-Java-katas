import java.util.Scanner;// se importa scaner para leer los datos

public class Kata1 {// esya es la clase principla
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// se crea el sacaner sc que lee el teclado

        System.out.print("ingresa el total de la cuenta ");// se pide el total
        int total = sc.nextInt();// se guarda en la variable
        System.out.print("ingresa el porcentaje de propina");// se pide el %
        int porcentaje = sc.nextInt();// se guarda como entero


        if (total <= 0) {//si el valor es negatico o 0 es invalido
            System.out.println("error total invalido");
            return;// aca se termina y regresa el main entiendo yo
        }
        if (porcentaje < 0 || porcentaje > 100) {// si el % es menor que 0 y mayor de 100
            System.out.println("error porcentaje invalido");// muetsra el error
            return;
        }

        int propina = total * porcentaje / 100; // calculo
        int totalAPagar = total + propina;// otro calculo

        System.out.println("propina $" + propina);// se imprime resultado
        System.out.println("total a pagar $" + totalAPagar);

        if (porcentaje > 30) {// optra condicion si es el % es mayor
            System.out.println("ropina generosa");// muestra mensaje
        } else if (porcentaje < 5) {
            System.out.println("propina muy baja");
        }


        sc.close();// se scierra eel scaner
    }
}