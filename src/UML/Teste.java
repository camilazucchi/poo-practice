package UML;

import UML.model.*;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {

        Plano plano = new Plano("Plano de Saúde XYZ", 650.00);
        Endereco enderecoPaciente = new Endereco("Rua 123", 20, "Cidade Exemplo", "Estado Exemplo");
        Endereco enderecoMedico = new Endereco("Rua 345", 70, "Cidade Exemplo", "Estado Exemplo");
        Paciente paciente = new Paciente("Ricardo", LocalDate.of(1997, 8, 19), enderecoPaciente, "00000001", plano);
        Especialidade especialidade = new Especialidade("Ortopedia");
        Medico medico = new Medico("Eduarda", LocalDate.of(1999, 9, 13), enderecoMedico, 1222, especialidade, 300.00);
        Consulta consulta = new Consulta(paciente, medico, LocalDate.now(), "Exemplo de receituário", 700.00);
        consulta.marcar(medico, paciente, LocalDate.now());

        Sala sala = new Sala("Sala B05106");
        Procedimento procedimento = new Procedimento(paciente, medico, LocalDate.now(), sala, "Nenhuma observação", 1200.00, 120);
        procedimento.marcar(medico, paciente, LocalDate.now());
        procedimento.gerarDados();


    }
}
