package model;

/**
 * The type Competencia tecnica.
 */
public class CompetenciaTecnica {
    
    private final String CODIGO;
    private final String DESCBREVE;
    private final String DESCDET;
    private GrauProficiencia gp;

    /**
     * Instantiates a new Competencia tecnica.
     *
     * @param codigo             the codigo
     * @param descricaoBreve     the descricao breve
     * @param descricaoDetalhada the descricao detalhada
     */
    public CompetenciaTecnica(String codigo, String descricaoBreve, String descricaoDetalhada){
        if (codigo == null|| codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido!");
        }if (descricaoBreve == null|| descricaoBreve.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição breve inválida!");
        }if (descricaoDetalhada == null|| descricaoDetalhada.trim().isEmpty()){
            throw new IllegalArgumentException("Descrição detalhada inválida!");
        }
        this.CODIGO=codigo;
        this.DESCBREVE=descricaoBreve;
        this.DESCDET=descricaoDetalhada;
    }


    /**
     * Get grau proficiencia grau proficiencia.
     *
     * @return the grau proficiencia
     */
    public GrauProficiencia getGrauProficiencia(){
        return gp;
    }

    /**
     * Set grau proficiencia.
     *
     * @param gp the gp
     */
    public void setGrauProficiencia(GrauProficiencia gp){
        this.gp=gp;
    }
    
    
    @Override
    public String toString(){
        return String.format("Competência Técnica\nCódigo: %s\nDescrição breve: %s\n"
                + "Descrição detalhada: %s",
                CODIGO,DESCBREVE,DESCDET);
    }
}
