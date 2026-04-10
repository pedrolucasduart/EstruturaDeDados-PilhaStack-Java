package PilhaStack_Exercise;

public class InversaoNumeroPilha {
    public int topo;
    public int capacidade;
    public int[] elementos;


    public InversaoNumeroPilha(int tamanho) {
        topo = -1;
        capacidade = tamanho;
        elementos = new int[tamanho];
    }

    // Empilha um dígito no topo da pilha
    public void push(int valor) {
        if (estaCheia()) {
            System.out.println("Overflow");
            return;
        }
        topo++;
        elementos[topo] = valor;
    }

    // Empilha cada dígito do número
    public void empilharNormal() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
    }

    // Desempilha os dígitos formando o número invertido
    public void empilharInvertido() {
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
    }

    // Verifica se a pilha está cheia
    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

}
