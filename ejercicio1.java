import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int numero3 = scanner.nextInt();

        System.out.println("\n¡Buen dia, " + nombreCompleto + "! Has ingresado los siguientes numeros:");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Numero 3: " + numero3);


        scanner.close();
    }
}


