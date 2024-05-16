package projeto;

public class Aluno {
    private String nome;
    private String cpf;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
