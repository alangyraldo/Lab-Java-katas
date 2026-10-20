import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int total =0;
        int opc =0;

        while (opc !=6){
            System.out.println("menu de la cafeteria");
            System.out.println("1 cafe - 4000");
            System.out.println("2 muffin - 3500");
            System.out.println("3 sandwich - 7500");
            System.out.println("4 jugo - 5000");
            System.out.println("5 té - 3000");
            System.out.println("6 salir");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    total= total + 4000;
                    System.out.println("producto agregado cafe a 4000");
                    break;

                case 2:
                    total = total + 3500;
                    System.out.println("producto agergado muffin a 3500");
                    break;
                case 3:
                    total = total +7500;
                    System.out.println("producto agregado sandwich a 7500");
                    break;
                case 4:
                    total = total + 5000;
                    System.out.println("producto agregado jugo a 5000");
                    break;
                case 5:
                    total = total + 3000;
                    System.out.println("producto agregado té a 3000");
                    break;
                case 6:
                    break;

                default :
                    System.out.println("opcion invalida");
            }
        }
        System.out.println("total de pedido " + String.format("%,d", total));
        sc.close();
    }
}