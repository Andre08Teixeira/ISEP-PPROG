package model;

/**
 * The type Classificacao.
 */
public class Classificacao implements Comparable<Classificacao> {
    private final int POSICAO;

    /**
     * Instantiates a new Classificacao.
     *
     * @param posicao the posicao
     */
    public Classificacao(int posicao) {
        this.POSICAO = posicao;
    }


    @Override
    public int compareTo(Classificacao o) {
        return POSICAO - o.POSICAO;
    }

    /**
     * Gets posicao.
     *
     * @return the posicao
     */
    public Integer getPosicao() {
        return POSICAO;
    }
}
