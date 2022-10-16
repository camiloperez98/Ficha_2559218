import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);



        String matricula= "si";

        int estrato_1=0;
        int estrato_2=0;
        int estrato_3=0;
        double totalMatriculas=0;
        int cantEstudiantes=0;



        while (matricula.equals("si")){
            double costoMatricula=0;
            double valor_total=0;
            int subsidio=0;

            System.out.println("Nombre del estudiante: ");
            String estudiante= sc.nextLine();

            System.out.println("Numero de creditos: ");
            int nCreditos= sc.nextInt();

            System.out.println("Estrato: ");
            int estrato=sc.nextInt();


            if (nCreditos<=20){
                costoMatricula=(nCreditos*85000);
            }
            else {
                 costoMatricula=((20*85000)+((nCreditos-20)*170000));
            }
            if (estrato==1){
                valor_total=(costoMatricula-(costoMatricula*0.8));
                estrato_1++;
                subsidio=200000;
            }
            else if (estrato==2) {
                valor_total=(costoMatricula-(costoMatricula*0.5));
                subsidio=100000;
                estrato_2++;
            }
            else if (estrato==3) {
                valor_total=(costoMatricula-(costoMatricula*0.3));
                estrato_3++;
            }
            cantEstudiantes++;

            System.out.println("Estudiante: "+estudiante);
            System.out.println("Costo de matricula: "+valor_total);
            System.out.println("Valor del subsidio: "+subsidio);

            totalMatriculas=totalMatriculas+costoMatricula;



            System.out.println("¿Matricular otro estudiante?: Si/no");

            matricula= sc.next();
        }

        System.out.println("RESUMEN DEL PROGRAMA");

        System.out.println("Cantidad de estudiantes: "+cantEstudiantes);
        System.out.println("Estudiantes por estratos:");
        System.out.println("Estrato 1: "+estrato_1);
        System.out.println("Estrato 2: "+estrato_2);
        System.out.println("Estrato 3: "+estrato_3);
        System.out.println("Total recaudos por matriculas: "+totalMatriculas);

    }
}
