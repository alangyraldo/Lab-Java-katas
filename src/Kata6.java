import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalClientes =0;
        int contadorHoras =0;
        int horaPico = -1;
        int maxClientes =-1;

        System.out.println("ingresa la hora (0 - 23 / -1 para terminar) ");
        int hora=sc.nextInt();

        while (hora !=-1) {
            if (hora < 0 || hora > 23) {
                System.out.println("hora incorrecta");
            } else {
                System.out.println("ingrese el numero de clientes en esa hora ");
                int clientes = sc.nextInt();
                if (clientes < 0) {
                    System.out.println("numero de clientes incorecto");

                } else {
                    totalClientes = totalClientes + clientes;
                    contadorHoras++;

                    if (clientes > maxClientes) {
                        maxClientes = clientes;
                        horaPico = hora;
                    }
                }

            }

            System.out.println("ingrese la hora (0 -23 / -1 para finalizar");
            hora = sc.nextInt();
        }
        if (contadorHoras ==0){
            System.out.println("no se ingresaron datos ");
        }else {
            double promedio = (double) totalClientes / contadorHoras;
            System.out.println("reporte dde clientes ");
            System.out.println("total de clientes " + totalClientes);

            System.out.println("promedio por hora " + String.format("%.2f", promedio));
            System.out.println("hora con mas clientes" + horaPico + "(" + maxClientes + "clientes ");
        }
        sc.close();
        }
    }