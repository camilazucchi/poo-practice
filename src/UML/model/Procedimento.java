package UML.model;

import java.time.LocalDate;

public class Procedimento implements ITransmissaoDadosMinisterioSaude {

    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private Sala sala;
    private String observacoes;
    private double valor;
    private int tempoDuracao;

    public Procedimento(Paciente paciente, Medico medico, LocalDate data, Sala sala, String observacoes, double valor, int tempoDuracao) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.sala = sala;
        this.observacoes = observacoes;
        this.valor = valor;
        this.tempoDuracao = tempoDuracao;
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

    public void setMedicos(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public void marcar(Medico medico, Paciente paciente, LocalDate data) {
        System.out.println("Procedimento marcado com sucesso!");
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Data: " + data);
    }

    public void cancelar() {
        System.out.println("Procedimento cancelada.");
    }

    public Procedimento pesquisarPorMedico(Medico medico) {
        if (medico.getNome().equalsIgnoreCase("")) {
            System.out.println("Médico encontrado com sucesso.");
            return this;
        } else {
            System.out.println("Médico não encontrado.");
            return null;
        }
    }

    @Override
    public void gerarDados() {
        double sum = tempoDuracao * valor;
        System.out.println("Dados gerados do procedimento: ");
        System.out.println("Valor inicial: " + getValor());
        System.out.println("Tempo de duração: " + getTempoDuracao());
        System.out.println("Total: " + sum);
    }
}
