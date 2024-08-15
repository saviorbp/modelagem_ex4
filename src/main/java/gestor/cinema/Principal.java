package gestor.cinema;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Criação dos objetos
        Genero genero = new Genero("Ação");

        Ator ator1 = new Ator("John Doe", "Protagonista", 35, 'M', "Americana");
        Ator ator2 = new Ator("Jane Roe", "Co-Protagonista", 28, 'F', "Britânica");

        Direcao direcao = new Direcao("John Smith", "Diretor", "Principal");

        Producao producao1 = new Producao("Alice Brown", "Produtor", "Principal");
        Producao producao2 = new Producao("Bob White", "Assistente de Produção", "Assistente");

        Filme filme = new Filme("Aventura Espacial", 2024, "Space Productions", "EUA", 120, genero);
        filme.adicionarPapel(ator1);
        filme.adicionarPapel(ator2);
        filme.adicionarPapel(direcao);
        filme.adicionarPapel(producao1);
        filme.adicionarPapel(producao2);

        Sala sala = new Sala(1, "Sala VIP", 50);

        Sessao sessao = new Sessao(new Date(), "20:00", filme, sala);

        Ingresso ingresso1 = new Ingresso(1, 10, "Inteira", 30.0f, "15/08/2024 18:00");
        Ingresso ingresso2 = new Ingresso(2, 11, "Meia-entrada", 15.0f, "15/08/2024 18:05");

        // Dados da sessão antes da venda de ingressos
        System.out.println("=== Antes da venda ===");
        sessao.exibirSessao();

        // Venda de ingressos
        sessao.venderIngresso(ingresso1);
        System.out.println("\n--- Detalhe do ingresso vendido ---");
        ingresso1.imprimirIngresso();
        sessao.venderIngresso(ingresso2);
        System.out.println("\n--- Detalhe do ingresso vendido ---");
        ingresso2.imprimirIngresso();

        // Dados da sessão após a venda de ingressos
        System.out.println("\n=== Depois da venda ===");
        sessao.exibirSessao();

        // Exibir detalhes dos ingressos vendidos
        System.out.println("\n=== Detalhes dos ingressos vendidos ===");
        System.out.println("--- Ingresso 1 ---");
        ingresso1.imprimirIngresso();
        System.out.println("--- Ingresso 2 ---");
        ingresso2.imprimirIngresso();
    }
}