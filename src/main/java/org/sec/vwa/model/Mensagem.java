package org.sec.vwa.model;

/**
 * Created by kleber on 14/12/16.
 */
public class Mensagem {

    String nome;
    String mensagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "nome='" + nome + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}

