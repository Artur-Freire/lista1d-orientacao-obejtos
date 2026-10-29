package ex02;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private ArrayList<HistoricoPreco> historico;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.historico = new ArrayList<>();

        historico.add(new HistoricoPreco(preco));
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco < 0) {
            System.out.println("O preço não pode ser negativo.");
            return;
        }

        this.preco = novoPreco;
        historico.add(new HistoricoPreco(novoPreco));

        System.out.println("Preço alterado com sucesso!");
    }

    public void exibirHistorico() {
        System.out.println("Histórico de preços do produto: " + nome);

        for (HistoricoPreco registro : historico) {
            registro.exibirDados();
            System.out.println("----------------------");
        }
    }

    public int quantidadeAlteracoes() {
        return historico.size() - 1;
    }

    public double maiorPreco() {
        double maior = historico.get(0).getValor();

        for (HistoricoPreco registro : historico) {
            if (registro.getValor() > maior) {
                maior = registro.getValor();
            }
        }

        return maior;
    }

    public double menorPreco() {
        double menor = historico.get(0).getValor();

        for (HistoricoPreco registro : historico) {
            if (registro.getValor() < menor) {
                menor = registro.getValor();
            }
        }

        return menor;
    }
}