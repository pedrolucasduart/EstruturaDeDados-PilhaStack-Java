public class PilhaStack {
    public int topo;
    public int capacidade;
    public int[] elementos;

    public PilhaStack(int tamanho) {
        topo = -1;
        capacidade = tamanho;
        elementos = new int[tamanho];
    }

    // Insere um elemento no topo da pilha
    public void push(int valor) {
        if (estaCheia()) {
            System.out.println("Overflow - Pilha cheia!");
            return;
        }

        topo++;
        elementos[topo] = valor;
    }

    // Remove e retorna o elemento que está no topo da pilha
    public int pop() {
        if (estaVazia()){
            System.out.println("Underflow - Pilha vazia!");
            return -1;
        }

        int valor = elementos[topo];
        topo--;
        return valor;
    }

    // Retorna o elemento do topo sem removê-lo
    public int peek() {
        if (estaVazia()) {
            return -1;
        }
        return elementos[topo];
    }

    // Imprime os elementos da pilha do topo à base
    public void imprimePilha() {
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }

    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }


    public static void main(String[] args) {
        PilhaStack pilhaStack = new PilhaStack(3);

        pilhaStack.push(10);
        pilhaStack.push(20);
        pilhaStack.push(30);

        System.out.println("Elementos da pilha: ");
        pilhaStack.imprimePilha();

        System.out.println("\nElemento do topo: " + pilhaStack.peek());
        System.out.println("\nElemento removido pelo pop: " + pilhaStack.pop());

        System.out.println("\nPilha após remover o topo: ");
        pilhaStack.imprimePilha();

        System.out.println("\nNovo elemento do topo: " + pilhaStack.peek());

        System.out.println("\nPilha final: ");
        pilhaStack.imprimePilha();
    }
}
