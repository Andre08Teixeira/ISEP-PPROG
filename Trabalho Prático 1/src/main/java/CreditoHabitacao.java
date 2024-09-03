/**
 * Utilização do extends uma vez que CreditoHabitação é 
 * subclasse da superclasse CreditoBancario.
 *
 */
public class CreditoHabitacao extends CreditoBancario{
    /**
     * spread que é acordado com o cliente.
     */
    private double spread;
    
    /**
     * inicialização de um contador a 0 para contar o número de créditos.
     */
    private static int contadorinstancias=0;
    
    /**
     * taxa de juro calculada pela seguinte fórmula.
     */
    private final double taxajuro=(spread/100)+((TAXAEURIBOR/100)/12);
    
    /**
     * spread por omissão.
     */
    private static final double SPREAD_OMISSAO=0;
    
    /**
     * taxa euribor a 12 meses é igual a 0.001, logo a 1 mês é igual a 0.001/12=0.00083333....
     */
    private static final double TAXAEURIBOR=0.1;
    
    /**
     * Constrói uma instância de CreditoHabitacao atribuindo o nome por omissão,
     * a profissão por omissão,o montante por omissão,
     * o prazo de financiamento por omissão e o spread por omissão.
     */
    public CreditoHabitacao(){
        super();
        this.spread=SPREAD_OMISSAO;
        contadorinstancias++;
    }
    
    
    /**
     * Constrói uma instância de CreditoHabitacao recebendo o nome, a profissão,  
     * o montante, o prazo de financiamento e o spread.
     *
     * @param nome o nome do cliente.
     * @param profissao a profissão do cliente.
     * @param montante o montante do empréstimo.
     * @param prazo o prazo de financiamento em meses.
     * @param spread o spread acordado com o cliente.
     */
    public CreditoHabitacao(String nome, String profissao, double montante, int prazo, double spread){
        super(nome, profissao, montante, prazo);
        this.spread=spread;
        contadorinstancias++;
    }
    
    /**
     * Devolve o spread.
     *
     * @return spread.
     */
    public double getSpread(){
        return spread;
    }
    
    /**
     * Devolve a taxa Euribor.
     *
     * @return TaxaEuribor.
     */
    public double getTaxaEuribor(){
        return TAXAEURIBOR;
    }
    
    /**
     * Modifica o spread.
     *
     * @param spread spread acordado com o cliente.
     */
    public void setSpread(double spread){
        this.spread=spread;
    }
    
    /**
     * Devolve o número de créditos.
     *
     * @return número de créditos.
     */
    public static int numeroCreditosHabitacao(){
        return contadorinstancias;
    }
    
    /**
     * Devolve a descrição textual do Crédito Habitação.
     *
     * @return caraterísticas do Crédito Habitação.
     */
    @Override
    public String toString(){
        return String.format("Nome: %s"
                            +"%nProfissao: %s"
                            +"%nMontante do empréstimo: %.2f"
                            +"%nPrazo do financiamento: %d"
                            +"%nSpread: %f"
                            +"%nTaxa Euribor: %f",
                super.getNome(),super.getProfissao(),super.getMontante(),super.getPrazo(),spread,TAXAEURIBOR);
    }
    
    
    
    @Override
    public double calcularMontanteAReceberPorCadaCredito(){
        return(super.getMontante()+calcularMontanteTotalJuros());
    }
    
    
    /**
     * Devolve o montante total de juros.
     *
     * @return montante total de juros.
     */
    @Override
    public double calcularMontanteTotalJuros(){
        double jurototal=0;
        for(double montanteEmFalta=super.getMontante();montanteEmFalta>=0;montanteEmFalta-=(super.getMontante()/super.getPrazo())){
            jurototal+=calcularJuro(montanteEmFalta);
        }
        return Math.round(jurototal);
    }
    
    
    /**
     * Devolve o juro.
     *@param montanteEmFalta montanteEmFalta.
     * @return juro.
     */
    public double calcularJuro(double montanteEmFalta){
        return (montanteEmFalta*((TAXAEURIBOR/100)+((spread/100)/12)));
    }
    
}
