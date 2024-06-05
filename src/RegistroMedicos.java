import java.util.LinkedList;
import java.util.Scanner;
public class RegistroMedicos {
    public static void main(String[] args) {
        LinkedList<Medico> listaMedicos = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int idCounter = 1;
        boolean continuar = true;

        while (continuar) {
            System.out.println("datos del médico:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Especialidad: ");
            String especialidad = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            Medico medico = new Medico(idCounter++, nombre, apellido, especialidad, telefono);
            listaMedicos.add(medico);

            System.out.print("¿ingresar otro médico? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\n registrados:");
        for (Medico medico : listaMedicos) {
            System.out.println(medico);
        }

        scanner.close();
    }
}
