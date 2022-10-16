import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        double descuento=0;
        int subsidio=0;
        int bonoTrabajadores=0;
        double total_sueldos=0;

        for (int trabajadores=1; trabajadores<=3; trabajadores++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Nombre del trabajador: ");
            String nTrabajador= sc.nextLine();

            System.out.println("Asignacion mensual: ");
            int asignMensual=sc.nextInt();

            System.out.println("\n");

            int bono=0;
            double total_sueldo=0;

            if(asignMensual<=2500000) {
                descuento=asignMensual*0.5;
                total_sueldo=(asignMensual-descuento)+(bono);
            }
            else if (asignMensual>2500000 && asignMensual<4000000) {
                descuento=asignMensual*0.7;
                total_sueldo=asignMensual-descuento+(bono);

            }
            else if (asignMensual>4000000 && asignMensual<4500000) {
                descuento=asignMensual*0.9;
                total_sueldo=asignMensual-descuento+(bono);
            }
            else {
                descuento=asignMensual*0.095;
                total_sueldo=(asignMensual-descuento)+(bono);
            }
            if (asignMensual<2500000) {
                bono=135000;
                bonoTrabajadores++;
            }
            else {
                bono=0;
            }

            total_sueldos=total_sueldos+total_sueldo;

            System.out.println("empleado"+trabajadores);

            System.out.println("Asignacion mensual: "+asignMensual);
            System.out.println("Nombre del trabajador: "+nTrabajador);
            System.out.println("Valor del bono: "+bono);
            System.out.println("Descuento: "+descuento);
            System.out.println("sueldo mensual: "+total_sueldo);
            System.out.println("\n");
        }
        System.out.println("suma de los sueldos mensuales: "+total_sueldos);
        System.out.println("trabajadores con derecho a subsidio: "+bonoTrabajadores);
    }


}
