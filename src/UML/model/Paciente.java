package UML.model;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Paciente extends Pessoa {

    private String CPF;
    private Plano plano;

    public Paciente(String nome, LocalDate dataNascimento, Endereco endereco, String CPF, Plano plano) {
        super(nome, dataNascimento, endereco);
        this.CPF = CPF;
        this.plano = plano;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public void cadastrar() {
        System.out.println("Cadastrando paciente...");
    }

    public void alterar() {
        System.out.println("Alterando dados do paciente " + getNome());
    }

    public void excluir() {
        System.out.println("Excluindo paciente " + getNome());
    }

    public Paciente consultar(String CPF) {
        if (CPF.equals(this.getCPF())) {
            System.out.println("Paciente com o CPF " + CPF + " foi encontrado.");
            return this;
        } else {
            System.out.println("Paciente com o CPF: " + CPF + " não foi encontrado.");
            return null;
        }
    }

    public Paciente consultarPorNome(String nome) {
        if (this.getNome().equalsIgnoreCase(nome)) {
            System.out.println("Paciente com o nome: " + nome + " foi encontrado.");
            return this;
        } else {
            System.out.println("Paciente com o nome: " + nome + " não foi encontrado.");
            return null;
        }
    }

}