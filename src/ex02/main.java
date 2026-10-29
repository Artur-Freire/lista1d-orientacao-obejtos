package ex02;

public class main {
    public static void main(String[] args) {

        Produto produto = new Produto("Teclado", 150.00);

        produto.alterarPreco(180.00);
        produto.alterarPreco(130.00);
        produto.alterarPreco(200.00);

        System.out.println();

        produto.exibirHistorico();

        System.out.println("Quantidade de alterações: "
                + produto.quantidadeAlteracoes());

        System.out.println("Maior preço registrado: R$ "
                + produto.maiorPreco());

        System.out.println("Menor preço registrado: R$ "
                + produto.menorPreco());
    }
}