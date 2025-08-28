package CachePessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoMaxCache = 10;

        List<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(18, "Natanael", 1));
        banco.add(new Pessoa(20, "Cleiton", 2));
        banco.add(new Pessoa(41, "Ricardo", 3));
        banco.add(new Pessoa(52, "Geovanna", 4));
        banco.add(new Pessoa(63, "Elizabete", 5));
        banco.add(new Pessoa(74, "Aurino", 6));
        banco.add(new Pessoa(84, "Gil", 7));

        List<Pessoa> cache = new ArrayList<>();

        while (true) {
            System.out.print("\nDigite o ID da pessoa (ou -1 para sair): ");
            int idDigitado = sc.nextInt();

            if (idDigitado == -1) break;

            Pessoa pessoaNoCache = null;
            for (Pessoa p : cache) {
                if (p.getId() == idDigitado) {
                    pessoaNoCache = p;
                    break;
                }
            }

            if (pessoaNoCache != null) {
                System.out.println("Pessoa encontrada no cache: " + pessoaNoCache);
                continue;
            }

            Pessoa pessoaNoBanco = null;
            for (Pessoa p : banco) {
                if (p.getId() == idDigitado) {
                    pessoaNoBanco = p;
                    break;
                }
            }

            if (pessoaNoBanco != null) {
                if (cache.size() >= tamanhoMaxCache) {
                    Pessoa removida = cache.remove(0);
                    System.out.println("Cache cheio. Removendo pessoa mais antiga: " + removida);
                }

                cache.add(pessoaNoBanco);
                System.out.println("Pessoa buscada no banco e adicionada ao cache: " + pessoaNoBanco);
            } else {
                System.out.println("Pessoa com ID " + idDigitado + " não encontrada no banco.");
            }
        }

        sc.close();
    }
}