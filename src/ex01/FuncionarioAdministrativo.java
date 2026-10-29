package ex01;

import java.time.LocalDate;

public class FuncionarioAdministrativo extends  Funcionario{
    private String setor;

    public FuncionarioAdministrativo(int matricula, String nome, double salario,
                                     LocalDate dataAdmissao, String setor) {
        super(nome, matricula, salario, dataAdmissao); //chama o construtor da classe Funcionario, inicializando os atributos herdados.
        this.setor = setor;//inicializa o atributo específico do funcionário administrativo.
    }
    public String getSetor() {
        return setor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor: " + setor);
    }

}
