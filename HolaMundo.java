import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {
        // imprimir datos en pantalla
        System.out.println("Hola Andres!");

        System.out.print("como van las cosas ");
        System.out.print(10 );

        System.out.printf(" aqui va un entero %d%n", 10);

        System.out.printf("Mi nombre es %s y tengo %d años%n","Andres Rojas",15);

        var entrada = new Scanner(System.in);
        System.out.println("por favor ingrese su nombre");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }
    
}