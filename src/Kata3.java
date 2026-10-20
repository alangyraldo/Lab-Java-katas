import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class Kata3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double subtotal = 0;// sera un acumulador y empeiza desde 0
        double precio; // variable para guardar el precio

        do {// inicio del bloque que se repite
            System.out.println("ingrese el precio del producto (digite 0 para terminar)");//solicitamos el valor
            precio =sc.nextDouble();// lo leera en decimal
            subtotal = subtotal +precio;

        }while (precio!=0);// repita mientras
        double iva = subtotal *0.19; // calculos
        double totalConIVA = subtotal+iva;// claculo + iva
        System.out.println("el subtotal es "+String.format("%.2f",subtotal));// muestra decimales con 2 decimales
        System.out.println("el iva es de 19%" +  String.format("%.2f", iva));

        if (totalConIVA > 50000){// condicionales
            double descuento = totalConIVA * 0.10;
            double totalFinal = totalConIVA - descuento;
            System.out.println("total con iva " + String.format("%.2f", totalConIVA));
            System.out.println("descuento del 10%  " + String.format("%.2f", descuento));
            System.out.println("total a pagar " + String.format("%.2f", totalFinal));


        }else {
            System.out.println("total  " + String.format("%.2f", totalConIVA));
        }
        sc.close();


    }
}