import java.util.Scanner;

public class Condicional03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese la temperatura en °C: ");
        float temperatura=sc.nextFloat();

        if (temperatura<0) {
            System.out.println("ESTAMOS QUE NOS CONGELAMOS!!");
        }
        else if (temperatura>=1 && temperatura<=10) {
            System.out.println("ESTA HACIENDO MUCHO FRIO!!");
        }
        else if (temperatura>=11 && temperatura<=15) {
            System.out.println("EL CLIMA ESTA FRESCO!!");
        }
        else if (temperatura>15 && temperatura<22) {
            System.out.println("LLEGO LA PRIMAVERA!!");
        }
        else {
            System.out.println("HACE CALOR!!");


        }
    }
}
