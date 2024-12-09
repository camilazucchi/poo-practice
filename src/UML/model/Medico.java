package UML.model;

import java.time.LocalDate;

public class Medico extends Pessoa {

    private int CRM;
    private Especialidade especialidade;
    private double valorHora;

    public Medico(String nome, LocalDate dataNascimento, Endereco endereco, int CRM, Especialidade especialidade, double valorHora) {
        super(nome, dataNascimento, endereco);
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.valorHora = valorHora;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void cadastrar() {
        System.out.println("Cadastrando médico...");
    }

    public void alterar() {
        System.out.println("Alterando dados do médico " + getNome());
    }

    public void excluir() {
        System.out.println("Excluindo médico " + getNome());
    }

    public Medico consultar(int CRM) {
        if (CRM == this.getCRM()) {
            System.out.println("Médico com o CRM: " + CRM + " foi encontrado.");
            return this;
        } else {
            System.out.println("Médico com o CRM: " + CRM + " não foi encontrado.");
            return null;
        }
    }

    public Medico consultarPorNome(String nome) {
        if (this.getNome().equalsIgnoreCase(nome)) {
            System.out.println("Médico com o nome: " + nome + " foi encontrado.");
            return this;
        } else {
            System.out.println("Médico com o nome: " + nome + " não foi encontrado.");
            return null;
        }
    }

}
