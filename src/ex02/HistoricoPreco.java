package ex02;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistoricoPreco {
    private double valor;
    private LocalDateTime dataAlteracao;

    public HistoricoPreco(double valor) {
        this.valor = valor;
        this.dataAlteracao = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Preço: R$ " + valor);
        System.out.println("Data da alteração: "
                + dataAlteracao.format(formato));
    }
}