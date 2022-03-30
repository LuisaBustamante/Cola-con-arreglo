
import javax.swing.JOptionPane;

public class ColaConArreglo {

    private int max;
    private int[] cola;
    private int frente;
    private int fin;

    public ColaConArreglo() {
        this.max = 100;
        this.frente = 0;
        this.fin = 0;
        this.cola = new int[this.max + 1];
    }

    public ColaConArreglo(int max) {
        this.max = max;
        this.frente = 0;
        this.fin = 0;
        this.cola = new int[this.max + 1];
    }

    public boolean colaLlena() {
        return this.fin == this.max;
    }

    public boolean colaVacia() {
        return this.frente == this.fin;
    }

    public void insertarCola() {
        if (this.colaLlena()) {
            JOptionPane.showMessageDialog(null, "La Cola está llena");
        } else {
            int item = Integer.parseInt(JOptionPane.showInputDialog(null, "Elemento que desea agregar a la Cola..."));
            this.fin++;
            this.cola[fin] = item;
        }
    }

    public void eliminarCola() {
        if (this.frente == this.fin) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
        } else {
            for (int i = frente; i <= fin - 1; i++) {
                cola[i] = cola[i + 1];
            }
            fin--;
        }
    }
//cola[i] = cola[i + 1];
//cola[1] = cola[1 + 1];
//cola[1] = cola[2]; lo que esta en cola 2 posicion pasa a la cola 1 posicion 
    public void mostrarCola() {
        if (this.colaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía\n No hay datos que mostrar", "Mostrar datos", JOptionPane.WARNING_MESSAGE);
        } else {
            String mostrar = "";
            for (int i = frente + 1; i <= fin; i++) {
                mostrar = mostrar + cola[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "Total es : " + this.fin + "\n" + "Los datos de la cola son : \n" + mostrar, "Mostrar datos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void vaciarCola() {
        frente = 0;
        fin = 0;
    }
}
