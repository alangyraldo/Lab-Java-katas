import java.util.Scanner;

public class Kata8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el numero de empleados ");
        int numEmpleados = sc.nextInt();
        if (numEmpleados == 0) {
            System.out.println("no se ingresaron empleados");
            return;
        }

        int totalHoras = 0;
        int masDe40 = 0;
        int menosDe20 = 0;
        String nombresMasDe40 = "";
        int nombresAgregados = 0;

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.print("empleado " + i + ": ");
            String nombre = sc.next();

            int horas;
            do {
                System.out.print("horas trabajadas ");
                horas = sc.nextInt();
                if (horas < 0) {
                    System.out.println("error las horas no pueden ser negativas");
                }
            } while (horas < 0);

            totalHoras = totalHoras + horas;

            if (horas > 40) {
                masDe40++;

                if (nombresAgregados > 0) {
                    nombresMasDe40 = nombresMasDe40 + ", ";
                }
                nombresMasDe40 = nombresMasDe40 + nombre;
                nombresAgregados++;
            }
            if (horas < 20) {
                menosDe20++;
            }
        }

        double promedio = (double) totalHoras / numEmpleados;
        int sueldoTotal = totalHoras * 12000;

        System.out.println("reporte de turnos");
        System.out.println("total de horas " + totalHoras);
        System.out.println("promedio de horas" + String.format("%.2f", promedio));
        if (masDe40 > 0) {
            System.out.println("empleados con mas de 40 horas " + masDe40 + " (" + nombresMasDe40 + ")");
        } else {
            System.out.println("empleados con mas de 40 horas 0");
        }
        System.out.println("empleados con menos de 20 horas " + menosDe20);
        System.out.println("sueldo total $" + String.format("%,d", sueldoTotal));

        sc.close();
    }
}