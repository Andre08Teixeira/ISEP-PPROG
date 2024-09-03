    package model;

/**
 * The type Grau proficiencia.
 */
public class GrauProficiencia {
    
    private final int VALOR;
    private final String DESIGNACAO;

    /**
     * Instantiates a new Grau proficiencia.
     *
     * @param valor      the valor
     * @param designacao the designacao
     */
    public GrauProficiencia(int valor, String designacao){
        if (valor<=0){
            throw new IllegalArgumentException("Grau de proficiência inválido!");
        }if (designacao == null|| designacao.trim().isEmpty()){
            throw new IllegalArgumentException("Descrição detalhada inválida!");
        }
        this.VALOR=valor;
        this.DESIGNACAO=designacao;
    }

    /**
     * Get valor int.
     *
     * @return the int
     */
    public int getValor(){
        return VALOR;
    }

    /**
     * Valida grau proficiencia boolean.
     *
     * @return the boolean
     */
    public boolean validaGrauProficiencia(){
        return (VALOR>0 && DESIGNACAO.trim().isEmpty());
    }
}
