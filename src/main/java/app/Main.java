package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Medicamento> lista = new ArrayList<>();

    int opcao;

    do {
        System.out.println("\n1 - Cadastrar medicamento");
        System.out.println("2 - Listar medicamentos");
        System.out.println("3 - Marcar como tomado");
        System.out.println("0 - Sair");

        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Horário: ");
                String horario = sc.nextLine();

                lista.add(new Medicamento(nome, horario));
                break;

            case 2:
                for (int i = 0; i < lista.size(); i++) {
                    Medicamento m = lista.get(i);
                    System.out.println(i + " - " + m.getNome() + " | " + m.getHorario() +
                            " | Tomado: " + m.isTomado());
                }
                break;

            case 3:
                System.out.print("Índice: ");
                int index = sc.nextInt();

                if (index >= 0 && index < lista.size()) {
                    lista.get(index).marcarComoTomado();
                } else {
                    System.out.println("Índice inválido!");
                }
                break;
        }
    } while (opcao != 0);

    sc.close();
}
}

