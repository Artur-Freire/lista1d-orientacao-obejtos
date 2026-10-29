package ex01;

import java.time.LocalDate;

public class FuncionarioTecnico extends Funcionario{
    private String especialidade;
    public FuncionarioTecnico(int matricula, String nome, double salario,
                                     LocalDate dataAdmissao, String setor) {
        super(nome, matricula, salario, dataAdmissao);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Especialidade: " + especialidade);
    }

}
