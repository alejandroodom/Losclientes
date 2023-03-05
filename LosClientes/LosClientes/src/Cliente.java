import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private ArrayList<Cliente> clientes;

    public Cliente(String nombre, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    public void crearCliente() {
        System.out.println("¿Nombre?");
        this.nombre = teclado.nextLine();
        clientes.add(new Cliente(this.nombre, clientes));
        System.out.println("Cliente n.º" + clientes.size() + " [" + this.nombre + "]" + " añadido");
    }

    public void mostrarClientes(Cliente cliente) {
        for(int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente n.º" + (i + 1) + " [" + cliente.getClientes().get(i).getNombre() + "]");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
