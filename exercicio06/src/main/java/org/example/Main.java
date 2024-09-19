package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        // Adicionando filmes ao cinema
        cinema.adicionarFilme(new Filme("O Senhor dos Anéis", 20.0, 12));
        cinema.adicionarFilme(new Filme("Vingadores", 25.0, 14));
        cinema.adicionarFilme(new Filme("Coringa", 18.0, 16));
        cinema.adicionarFilme(new Filme("Frozen", 15.0, 3));
        cinema.adicionarFilme(new Filme("It: A Coisa", 22.0, 18));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Solicitando informações do cliente
                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();
                System.out.println("Qual a sua idade?");
                int idadeCliente = Integer.parseInt(scanner.nextLine());

                // Solicitando informações do filme
                System.out.println("Filmes disponíveis:");
                for (Filme filme : cinema.getFilmesDisponiveis()) {
                    System.out.println(filme.getNome() + " - Preço: " + filme.getPreco() + " - Idade mínima: " + filme.getIdadeMinima());
                }

                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();
                Filme filmeEscolhido = null;

                for (Filme filme : cinema.getFilmesDisponiveis()) {
                    if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                        filmeEscolhido = filme;
                        break;
                    }
                }

                if (filmeEscolhido == null) {
                    System.out.println("Filme não encontrado.");
                    continue;
                }

                // Solicitando o assento
                System.out.println("Qual assento você deseja? (A1, B2, A3, A4, A5):");
                String assento = scanner.nextLine();

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);
                Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);

                // Vendendo o ingresso
                cinema.venderIngresso(ingresso);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("Deseja continuar? (s/n)");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}