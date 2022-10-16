import java.util.Scanner;

public class Condicional04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese el nombre del empleado: ");
        String empleado=sc.nextLine();

        System.out.println("ingrese el valor del salario del empleado: ");
        float salario= sc.nextFloat();

        System.out.println("años de antigüedad en la empresa: ");
        int antigüedad= sc.nextInt();

        if (salario<3240000 || antigüedad>10) {
            System.out.println("el empleado: "+empleado+" aplica para el aumento");
        }
        else {
            System.out.println("el empleado: "+empleado+" no aplica para aumento");
        }



    }
}
