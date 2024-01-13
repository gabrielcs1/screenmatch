package br.com.alura.screenmach.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

import java.security.Principal;

public class Episodio implements Classificavel {

    private int totalVisualizacoes;
    private int Numero;
    private String nome;
    private Serie serie;

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
