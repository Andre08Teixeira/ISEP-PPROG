/**
 * Esta classe permite a construção de uma hierarquia de classes. 
 * Especifica membros comuns a todas as classes da hierarquia.
 *
*/
public abstract class CreditoBancario {
    /**
     * O nome do cliente.
     */
    private String nome;
    
    /**
     * A profissão do cliente.
     */
    private String profissao;
    
    /**
     * O montante do empréstimo
     */
    private double montante;
    
    /**
     * Prazo de financiamento em meses.
     */
    private int prazo; 
    
    
    /**
     * O nome do cliente por omissão.
     */
    private static final String NOME_OMISSAO="Desconhecido";
    
    /**
     * A profissão do cliente por omissão.
     */
    private static final String PROFISSAO_OMISSAO="Desempregado";
    
    /**
     * O montante do empréstimo por omissão.
     */
    private static final double MONTANTE_OMISSAO=0;
    
    /**
     * O prazo de financiamento em meses por omissão.
     */
    private static final int PRAZO_OMISSAO=0;
    
    /**
     * Constrói uma instância do CreditoBancario com nome,profissão, montante e prazo de financiamento por omissão.  
     */
    public CreditoBancario(){
        this.nome=NOME_OMISSAO;
        this.profissao=PROFISSAO_OMISSAO;
        this.montante=MONTANTE_OMISSAO;
        this.prazo=PRAZO_OMISSAO;
    }
    
    /**
     * Constrói uma instância do CreditoBancario recebendo o nome do cliente,profissão do cliente,montante e prazo de financiamento em meses. 
     *
      * @param nome o nome do cliente.
     * @param profissao a profissão do cliente.
     * @param montante o montante do empréstimo.
     * @param prazo o prazo de financiamento em meses.
     */
    
    public CreditoBancario(String nome, String profissao, double montante, int prazo){
        this.nome=nome;
        this.profissao=profissao;
        this.montante=montante;
        this.prazo=prazo;
    }
    
    /**
     * Devolve o nome do cliente.
     * 
     * @return nome do cliente.
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Devolve a profissão do cliente.
     * 
     * @return profissão do cliente.
     */
    public String getProfissao(){
        return profissao;
    }
    
    /**
     * Devolve o montante do empréstimo.
     * 
     * @return montante do empréstimo.
     */
    
    public double getMontante(){
        return montante;
    }
    
    /**
     * Devolve o prazo de financiamento em meses.
     * 
     * @return prazo de financiamento em meses.
     */
    
    public int getPrazo(){
        return prazo;
    }
    
     /**
     * Modifica o nome do cliente.
     * 
     * @param nome o novo nome do cliente.
     */      
    public void setNome(String nome){
        this.nome=nome;
    }
     /**
     * Modifica a profissão do cliente.
     * 
     * @param profissao a nova profissão do cliente.
     */  
    public void setProfissao(String profissao){
        this.profissao=profissao;
    }
    
     /**
     * Modifica o montante do empréstimo.
     * 
     * @param montante o novo montante emprestado.
     */ 
    public void setMontante(double montante){
        this.montante=montante;
    }
    
     /**
     * Modifica o prazo de financiamento em meses.
     * 
     * @param prazo o novo prazo de financiamento em meses.
     */ 
    public void setPrazo(int prazo){
        this.prazo=prazo;
    }
    
    
    @Override
    public abstract String toString();
    
    public abstract double calcularMontanteAReceberPorCadaCredito();
    
    public abstract double calcularMontanteTotalJuros();
    
    
}
