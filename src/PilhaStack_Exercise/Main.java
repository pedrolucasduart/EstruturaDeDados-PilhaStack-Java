package PilhaStack_Exercise;

import PilhaStack_Base.PilhaStack;

public class Main {
    public static void main(String[] args) {
        InversaoNumeroPilha inversaoNumeroPilha = new InversaoNumeroPilha(4);

        inversaoNumeroPilha.push(1);
        inversaoNumeroPilha.push(2);
        inversaoNumeroPilha.push(3);
        inversaoNumeroPilha.push(4);

        System.out.println("Entrada Normal: ");
        inversaoNumeroPilha.empilharNormal();

        System.out.println("\nNúmero invertido: ");
        inversaoNumeroPilha.empilharInvertido();

    }
}
