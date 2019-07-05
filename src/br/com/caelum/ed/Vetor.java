package br.com.caelum.ed;

import java.util.Arrays;

/**
 * Created by george on 05/07/19.
 */
public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {

    }

    public Aluno pega(int posicao) {
        return new Aluno();
    }

    public void remove(int posicao) {

    }

    public boolean contem (Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return this.alunos.length;
    }

    public String toString(){
        return Arrays.toString(alunos);
    }
}
