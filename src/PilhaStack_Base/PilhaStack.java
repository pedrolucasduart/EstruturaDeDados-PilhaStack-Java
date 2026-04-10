package PilhaStack_Base;

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

    // Verifica se a pilha está cheia
    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }
}
