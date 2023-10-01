package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExcepction e) {
            e.getMessage();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExcepction();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 0; contagem >= 0; i++) {
            System.out.println("Imprimindo o número " + i);
            contagem--;
        }
    }
}