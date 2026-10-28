package EX01;
import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioAdministrativo(
                101,
                "Artur",
                3500.00,
                LocalDate.of(2024, 3, 10),
                "Financeiro"
        ));

        funcionarios.add(new FuncionarioTecnico(
                102,
                "Adriele",
                4500.00,
                LocalDate.of(2023, 7, 15),
                "Redes de computadores"
        ));

        funcionarios.add(new FuncionarioAdministrativo(
                103,
                "Iuri",
                3200.00,
                LocalDate.of(2025, 1, 20),
                "Recursos Humanos"
        ));

        funcionarios.add(new FuncionarioTecnico(
                104,
                "Marcelo",
                5000.00,
                LocalDate.of(2022, 9, 5),
                "Desenvolvimento de software"
        ));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("--------------------------");
            funcionario.exibirDados();
        }
    }
}
