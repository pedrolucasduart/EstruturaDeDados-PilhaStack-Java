package PilhaStack_Base;

public class Main {
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
