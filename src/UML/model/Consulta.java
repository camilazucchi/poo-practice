package UML.model;

import java.time.LocalDate;

public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private String receituario;
    private double valor;

    public Consulta(Paciente paciente, Medico medico, LocalDate data, String receituario, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.receituario = receituario;
        this.valor = valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void marcar(Medico medico, Paciente paciente, LocalDate data) {
        System.out.println("Consulta marcada com sucesso!");
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Data: " + data);
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public Consulta pesquisarPorPaciente(Paciente paciente) {
        if (paciente.getNome().equalsIgnoreCase("")) {
            System.out.println("Paciente encontrado com sucesso.");
            return this;
        } else {
            System.out.println("Paciente não encontrado.");
            return null;
        }
    }


}
