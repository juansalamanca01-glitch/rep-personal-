public class Pila {
    private int[] elementos;
    private int tope;
    private static final int CAPACIDAD = 5;

    public Pila() {
        elementos = new int[CAPACIDAD];
        tope = -1; // indica que está vacía
    }
    public boolean push(int valor) {
        if (tope == CAPACIDAD - 1) {
            System.out.println("Error: La pila está llena.");
            return false;
        }
        elementos[++tope] = valor;
        return true;
    }
    public Integer pop() {
        if (tope == -1) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        return elementos[tope--];
    }
    public boolean estaVacia() {
        return tope == -1;
    }
    public boolean estaLlena() {
        return tope == CAPACIDAD - 1;
    }
    // Método para "pintar" la pila (visualización vertical, top → bottom)
    public void pintarPila() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        System.out.println("Pila (top → bottom):");
        for (int i = tope; i >= 0; i--) {
            System.out.println("|  " + elementos[i] + "  |");
        }
        System.out.println("¯¯¯¯¯¯¯");
    }
    public static void main(String[] args) {
        Pila p = new Pila();
        for (int i = 1; i <= 5; i++) {
            p.push(i);
        }
        p.pintarPila();

        System.out.println("\nDesapilando:");
        while (!p.estaVacia()) {
            System.out.println("Pop: " + p.pop());
        }
    }
}