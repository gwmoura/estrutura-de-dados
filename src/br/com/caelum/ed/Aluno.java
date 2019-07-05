package br.com.caelum.ed;

/**
 * Created by george on 05/07/19.
 */
public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {

        Aluno outro = (Aluno) o;

        return this.nome.equals(outro.nome);
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
