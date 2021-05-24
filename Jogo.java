package mistureba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public abstract class Jogo {
    public String nome;
    private int pontuacao;
    private Mistureba mistureba;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pontuacao
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * @return the mistureba
     */
    public Mistureba getMistureba() {
        return mistureba;
    }

    /**
     * @param mistureba the mistureba to set
     */
    public void setMistureba(Mistureba mistureba) {
        this.mistureba = mistureba;
    }
}
