package model;


/**
 * The type Tarefa.
 */
public class Tarefa {
    /**
     * Referencia da tarefa.
     */
    private final String REFERENCIA;
    /**
     * Designacao da tarefa.
     */
    private final String DESIGNACAO;
    /**
     * Descricao informal da tarefa.
     */
    private final String DESCINF;
    /**
     * Descricao tecnica da tarefa.
     */
    private final String DESCTECNICA;
    /**
     * Duracao estipulado da tarefa.
     */
    private final int DURACAO;
    /**
     * Custo estipulado da tarefa.
     */
    private final double CUSTO;
    
    
    private ListaCompetencias lc;

    /**
     * Criacao do objeto Tarefa.
     *
     * @param referencia   the referencia
     * @param designacao   the designacao
     * @param descInformal the desc informal
     * @param descTecnica  the desc tecnica
     * @param duracao      the duracao
     * @param custo        the custo
     */
    public Tarefa(String referencia, String designacao, String descInformal, String descTecnica, int duracao,
                  double custo) {
        this.REFERENCIA = referencia;
        this.DESIGNACAO = designacao;
        this.DESCINF = descInformal;
        this.DESCTECNICA = descTecnica;
        this.DURACAO = duracao;
        this.CUSTO = custo;
    }

    /**
     * Get lista competencias lista competencias.
     *
     * @return the lista competencias
     */
    public ListaCompetencias getListaCompetencias(){
        return lc;
    }

    /**
     * Set lista competencias.
     *
     * @param lc the lc
     */
    public void setListaCompetencias(ListaCompetencias lc){
        this.lc=lc;
    }

    /**
     * Get referencia string.
     *
     * @return the string
     */
    public String getReferencia(){
        return REFERENCIA;
    }

    /**
     * Get designacao string.
     *
     * @return the string
     */
    public String getDesignacao(){
        return DESIGNACAO;
    }
    
}
