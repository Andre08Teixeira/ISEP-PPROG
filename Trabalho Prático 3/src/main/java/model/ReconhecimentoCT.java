package model;


/**
 * The type Reconhecimento ct.
 */
public class ReconhecimentoCT {
    
   
    /**
     * Competencia tecnica associada ao seu reconhecimento.
     */
    private final CompetenciaTecnica CT;

    /**
     * Criacao do objeto ReconhecimentoCT.
     *
     * @param ct the ct
     */
    public ReconhecimentoCT(CompetenciaTecnica ct) {
        this.CT=ct;
    }


    /**
     * Gets competencia tecnica.
     *
     * @return the competencia tecnica
     */
    public CompetenciaTecnica getCompetenciaTecnica() {
        return CT;
    }

    

    
    
}
