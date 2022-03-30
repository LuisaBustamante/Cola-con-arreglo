
import javax.swing.JOptionPane;

public class EjecutarCola {

    public static void main(String[] Args) {

        int max;
        max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la Cola"));

        ColaConArreglo cola = new ColaConArreglo(max);

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"
                    + "2. ELIMINAR DATOS\n"
                    + "3. OBSERVAR DATOS\n"
                    + "4. VACIAR COLA\n"
                    + "5. SALIR\n"
                    + "--------------------------------------------------------\n"
                    + "INGRESE LA OPCION [1 - 5]", "MENU COLA", JOptionPane.QUESTION_MESSAGE));

            switch (op) {
                case 1:
                    cola.insertarCola();
                    break;
                case 2:
                    cola.eliminarCola();
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    cola.vaciarCola();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCIÓN VALIDA \n", "ERROR OPCIÓN", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true);
    }
}
