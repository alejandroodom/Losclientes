import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente("", clientes);

        int opcion = 1;
        do {
            System.out.println("--Menú--");
            System.out.println("1. Mostrar clientes");
            System.out.println("2. Crear un cliente");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion) {
                case 1:
                    cliente.mostrarClientes(cliente);
                    break;
                case 2:
                    cliente.crearCliente();
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while(opcion >= 1 && opcion <= 2);
    }
}