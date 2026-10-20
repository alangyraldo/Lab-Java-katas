import java.util.Scanner;

public class Kata7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double totalCompra =0;
        String respuesta;

        do{
            System.out.println("ingresa el precio del producto");
            double precio =sc.nextDouble();
            System.out.print("ingresa la cantidad");
            int cantidad =sc.nextInt();

            double porcentajeDes;
            int etiqueta;
            if(cantidad>=11){
                porcentajeDes = 0.15;
                etiqueta = 15;
            }else if (cantidad >=6){
                porcentajeDes=0.10;
                etiqueta=10;
            } else if (cantidad>=3) {
                porcentajeDes =0.05;
                etiqueta =5;
            }else {
                porcentajeDes = 0;
                etiqueta=0;
            }
            double subtotal = precio * cantidad;
            double descuento = subtotal * porcentajeDes;
            double subtotaldesc = subtotal - descuento;
            double iva = subtotaldesc * 0.19;
            double totalproducto = subtotaldesc +iva;
            System.out.println("subtotal $"+String.format("%.2f", subtotal));
            System.out.println("descuento "+etiqueta+"% : $"+String.format("%.2f", descuento));
            System.out.println("iva (19%) "+String.format("%.2f", iva ));
            System.out.println("total $"+String.format("%.2f", totalproducto));
            totalCompra= totalCompra + totalproducto;

            System.out.println("agrega otro producto? (S/N)");
            respuesta =sc.next();

        } while (respuesta.equals("S")|| respuesta.equals("s"));
        System.out.println("total de la compra fue por $"+String.format("%.2f", totalCompra));
        sc.close();
    }
}