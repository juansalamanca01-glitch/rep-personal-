public class Cola {
    private int[] elementos;
    private int frente;
    private int finalCola;
    private int tamano;
    private static final int CAPACIDAD = 5;

    public Cola() {
        elementos = new int[CAPACIDAD];
        frente = 0;
        finalCola = -1;
        tamano = 0;
    }

    public boolean encolar(int valor) {
        if (tamano == CAPACIDAD) {
            System.out.println("Error: La cola está llena.");
            return false;
        }
        finalCola = (finalCola + 1) % CAPACIDAD;
        elementos[finalCola] = valor;
        tamano++;
        return true;
    }

    public Integer desencolar() {
        if (tamano == 0) {
            System.out.println("Error: La cola está vacía.");
            return null;
        }
        int valor = elementos[frente];
        frente = (frente + 1) % CAPACIDAD;
        tamano--;
        return valor;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == CAPACIDAD;
    }

    // Método para "pintar" la cola (de frente a final, en orden FIFO)
    public void pintarCola() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.print("Cola (frente → final): ");
        int indice = frente;
        for (int i = 0; i < tamano; i++) {
            System.out.print(elementos[indice]);
            if (i < tamano - 1) {
                System.out.print(" → ");
            }
            indice = (indice + 1) % CAPACIDAD;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Cola c = new Cola();
        for (int i = 1; i <= 5; i++) {
            c.encolar(i);
        }
        c.pintarCola();

        System.out.println("\nDesencolando:");
        while (!c.estaVacia()) {
            System.out.println("Dequeue: " + c.desencolar());
        }
    }
}