import java.util.Scanner;
import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println(("ingresa el dia (1 lunes - 7 domingo)"));
        int dia = sc.nextInt();
        System.out.println("ingrese la hora (0 -23)");
        int hora =sc.nextInt();

        if (dia < 1|| dia >7 ){
            System.out.println("error dia incorrecto ");
            return;


        }
        if (hora <0|| hora>23 ){
            System.out.println("error la hora es incorrecta ");
            return;

        }
        boolean abierta = false;
        String horario = "";
        switch (dia){
            case 1,2,3,4,5 -> {
                abierta = hora >=6 && hora <20 ;
                horario = "horario de lunes a viernes es 6a - 8 pm";

            }
            case 6->{
                abierta= hora >=7 && hora <14;
                horario ="horario de sabado 7am- 2pm";

            }
            case 7->{
                abierta = false;
                horario = "el domingo esta cerrado";

            }
        }

        if (abierta){
            System.out.println("lacafeteria esta abierta");

        }else {
            System.out.println(" lacafeteria esta cerrada");

        }
        System.out.println(horario);

        sc.close();

    }
}