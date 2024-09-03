package model;

import java.util.Date;


/**
 * The type Candidatura.
 */
public class Candidatura {
    
    private final Date DATACANDIDATURA;
    private final double VALORPRETENDIDO;
    private final int nrDias;
    private final String txtApresentacao;
    private final String txtMotivacao;
    private Freelancer freelancer;
    private Anuncio anun;
    private Classificacao classificacao;

    /**
     * Instantiates a new Candidatura.
     *
     * @param dataCandidatura the data candidatura
     * @param valorPretendido the valor pretendido
     * @param nrDias          the nr dias
     * @param txtApresentacao the txt apresentacao
     * @param txtMotivacao    the txt motivacao
     */
    public Candidatura(Date dataCandidatura,double valorPretendido,int nrDias,String txtApresentacao,String txtMotivacao){
        if (txtApresentacao == null || txtApresentacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Texto de Apresentação é inválido!");
        }else if(txtMotivacao == null || txtMotivacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Texto de motivação é inválido!");
        }else if(valorPretendido <0) {
            throw new IllegalArgumentException("Valor pretendido é inválido!");
        }else if(nrDias <=0) {
            throw new IllegalArgumentException("Número de dias é inválido!");
        }
        
    this.DATACANDIDATURA=dataCandidatura;
    this.VALORPRETENDIDO=valorPretendido;
    this.nrDias=nrDias;
    this.txtApresentacao=txtApresentacao;
    this.txtMotivacao=txtMotivacao;
    this.classificacao=new Classificacao(0);
    }

    /**
     * Get data candidatura date.
     *
     * @return the date
     */
    public Date getDataCandidatura(){
        return DATACANDIDATURA;
    }

    /**
     * Get freelancer freelancer.
     *
     * @return the freelancer
     */
    public Freelancer getFreelancer(){
        return freelancer;
    }

    /**
     * Get anuncio anuncio.
     *
     * @return the anuncio
     */
    public Anuncio getAnuncio(){
        return anun;
    }

    /**
     * Get classificacao classificacao.
     *
     * @return the classificacao
     */
    public Classificacao getClassificacao(){
        return classificacao;
    }


    /**
     * Set anuncio.
     *
     * @param anun the anun
     */
    public void setAnuncio(Anuncio anun){
        this.anun=anun;
    }

    /**
     * Set freelancer.
     *
     * @param fl the fl
     */
    public void setFreelancer(Freelancer fl){
        this.freelancer=fl;
    }

    /**
     * Set classificacao.
     *
     * @param classificacao the classificacao
     */
    public void setClassificacao(Classificacao classificacao){
        this.classificacao=classificacao;
    }

    /**
     * Get valor pretendido double.
     *
     * @return the double
     */
    public double getValorPretendido(){
        return VALORPRETENDIDO;
    }

    /**
     * Get nr dias int.
     *
     * @return the int
     */
    public int getNRDias(){
        return nrDias;
    }


    /**
     * Valida candidatura boolean.
     *
     * @param anun the anun
     * @return the boolean
     */
    public boolean validaCandidatura(Anuncio anun) {
        return ((DATACANDIDATURA.compareTo(anun.getDTInicioCandidatura()) >= 0) && (DATACANDIDATURA.compareTo(anun.getDTFimCandidatura()) <= 0));
    }
    
    
    @Override
    public String toString(){
        return String.format("Data de Candidatura: %s\nValor pretendido: %s\n"
                + "Número de dias para realização: %s\nTexto de apresentação: %s\n"
                + "Texto de motivação: %s\nFreelancer: %s",
                DATACANDIDATURA,VALORPRETENDIDO,nrDias,txtApresentacao,txtMotivacao,freelancer.getNome());
    }

    
}