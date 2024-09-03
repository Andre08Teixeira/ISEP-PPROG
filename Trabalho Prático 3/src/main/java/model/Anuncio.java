package model;

import java.util.Date;


/**
 * The type Anuncio.
 */
public class Anuncio {
    
    private final Date dtInicioPublicitacao;
    private final Date dtFimPublicitacao;
    private final Date dtInicioCandidatura;
    private final Date dtFimCandidatura;
    private final Date dtInicioSeriacao;
    private final Date dtFimSeriacao;
    private ListaCandidaturas listaCandidaturas;
    private Tarefa tarefa;

    /**
     * Instantiates a new Anuncio.
     *
     * @param dtInicioPublicitacao the dt inicio publicitacao
     * @param dtFimPublicitacao    the dt fim publicitacao
     * @param dtInicioCandidatura  the dt inicio candidatura
     * @param dtFimCandidatura     the dt fim candidatura
     * @param dtInicioSeriacao     the dt inicio seriacao
     * @param dtFimSeriacao        the dt fim seriacao
     */
    public Anuncio(Date dtInicioPublicitacao,Date dtFimPublicitacao,Date dtInicioCandidatura,
    Date dtFimCandidatura,Date dtInicioSeriacao,Date dtFimSeriacao){
        if (dtInicioPublicitacao == null) {
            throw new IllegalArgumentException("Data de início da publicação inválida!");
        }if (dtFimPublicitacao == null) {
            throw new IllegalArgumentException("Data de fim da publicação inválida!");
        }if (dtInicioCandidatura == null) {
            throw new IllegalArgumentException("Data de início de candidatura inválida!");
        }if (dtFimCandidatura == null) {
            throw new IllegalArgumentException("Data de fim de candidatura inválida!");
        }if (dtInicioSeriacao == null) {
            throw new IllegalArgumentException("Data de início da seriação inválida!");
        }if (dtFimSeriacao == null) {
            throw new IllegalArgumentException("Data de fim da seriação inválida!");
        }
        this.dtInicioPublicitacao=dtInicioPublicitacao;
        this.dtFimPublicitacao=dtFimPublicitacao;
        this.dtInicioCandidatura=dtInicioCandidatura;
        this.dtFimCandidatura=dtFimCandidatura;
        this.dtInicioSeriacao=dtInicioSeriacao;
        this.dtFimSeriacao=dtFimSeriacao;
    }


    /**
     * Get lista candidaturas lista candidaturas.
     *
     * @return the lista candidaturas
     */
    public ListaCandidaturas getListaCandidaturas(){
        return listaCandidaturas;
    }

    /**
     * Get dt inicio candidatura date.
     *
     * @return the date
     */
    public Date getDTInicioCandidatura(){
        return dtInicioCandidatura;
    }

    /**
     * Get dt fim candidatura date.
     *
     * @return the date
     */
    public Date getDTFimCandidatura(){
        return dtFimCandidatura;
    }

    /**
     * Get tarefa tarefa.
     *
     * @return the tarefa
     */
    public Tarefa getTarefa(){
        return tarefa;
    }

    /**
     * Set lista candidaturas.
     *
     * @param lc the lc
     */
    public void setListaCandidaturas(ListaCandidaturas lc){
        this.listaCandidaturas=lc;
    }

    /**
     * Set tarefa.
     *
     * @param t the t
     */
    public void setTarefa(Tarefa t){
        this.tarefa=t;
    }
    
    
    @Override
    public String toString(){
        return String.format("Data de início da publicação: %s\nData de fim da publicação: %s\n"
                + "Data de início de candidatura: %s\nData de fim de candidatura: %s\n"
                + "Data de início da seriação: %s\nData de fim da seriação: %s",
                dtInicioPublicitacao,dtFimPublicitacao,dtInicioCandidatura,dtFimCandidatura,dtInicioSeriacao,dtFimSeriacao);
    }
    
    
    
    
}
