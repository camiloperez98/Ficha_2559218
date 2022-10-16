import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Cantidad de personas a encuestar?: ");
        int cantidad= sc.nextInt();

        int contadorPersonas=1;
        int bajoPeso=0;
        int pesoNormal=0;
        int sobrePeso=0;
        int obesidad=0;

        while(contadorPersonas<=cantidad){
            Scanner entrada=new Scanner(System.in);

            System.out.println("Nombre: ");
            String nombre=entrada.nextLine();

            System.out.println("peso: ");
            float peso=entrada.nextFloat();

            System.out.println("estatura: ");
            float estatura= entrada.nextFloat();

            double imc=peso/(Math.pow(estatura,2));

            if (imc<=18.5){
                System.out.println(nombre+" estas bajo de peso");
                bajoPeso++;
            }
            else if (imc>18.5 && imc<24.9) {
                System.out.println(nombre+" estas en tu peso normal");
                pesoNormal++;
            }
            else if (imc>25.0 && imc<29.9) {
                System.out.println(nombre+" estas en sobrepeso");
                sobrePeso++;
            }
            else if (imc>30.0) {
                System.out.println(nombre+" presentas obesidad");
                obesidad++;
            }
            contadorPersonas++;
        }
        System.out.println("Personas encuestadas: "+cantidad);
        System.out.println("Personas con bajo peso: "+bajoPeso);
        System.out.println("Personas con peso normal: "+pesoNormal);
        System.out.println("Personas con sobrepeso: "+sobrePeso);
        System.out.println("Personas con obesidad: "+obesidad);

    }
}
