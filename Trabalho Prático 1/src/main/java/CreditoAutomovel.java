/**
 *CreditoAutomovel é subclasse de CreditoConsumo.
 */
public class CreditoAutomovel extends CreditoConsumo {
    /**
     * valor do desconto a que o cliente terá direito
     */
    private double descontos;
    /**
     * prazo máximo de financiamento para que o titular tenha direito a um desconto
     */
    private static final int PRAZOLIMITEPARADESCONTO=24;
    
    /**
     * taxa de desconto
     */
    private static final double DESCONTO=1;
    
    /**
     * taxa de juros anual
     */
    private static final double JUROS = 6;

    /**
     * Constrói uma instância de CreditoAutomovel atribuindo o nome por omissão,
     * a profissão por omissão,o montante do empréstimo por omissão,
     * o prazo de financiamento por omissão.
     */
    public CreditoAutomovel() {
        super();
    }

    /**
     * Constrói uma instância de CreditoAutomovel recebendo o nome, a profissão,  
     * o montante, o prazo de financiamento.
     *
     * @param nome o nome do cliente.
     * @param profissao a profissão do cliente.
     * @param montante o montante do empréstimo.
     * @param prazo o prazo de financiamento em meses.
     */
    public CreditoAutomovel(String nome, String profissao, double montante, int prazo) {
        super(nome, profissao, montante, prazo, JUROS);
        if(prazo>PRAZOLIMITEPARADESCONTO){
            descontos=0;
        }else{ 
            descontos=DESCONTO;
        }
    }
    
    /**
     * Devolve o Desconto.
     *
     * @return Desconto.
     */
    public double getDesconto(){
        return descontos;
    }
    
    
    /**
     * Devolve o montante a receber por cada crédito.
     *
     * @return montante a receber por cada crédito.
     */
    @Override
    public double calcularMontanteAReceberPorCadaCredito(){
        double total = 0;
        for (double montanteEmFalta = super.getMontante(); montanteEmFalta >= 0; montanteEmFalta -= (super.getMontante()/ super.getPrazo())) {
            total += (calcularJuro(montanteEmFalta)+(super.getMontante()/ super.getPrazo()))*(descontos/100);
        }
        return Math.round(total);
    }
    
    
     /**
     * Devolve o montante total de juros.
     *
     * @return montante total de juros.
     */
    @Override
    public double calcularMontanteTotalJuros() {
        double jurototal = 0;
        for (double montanteEmFalta = super.getMontante(); montanteEmFalta >= 0; montanteEmFalta -= (super.getMontante()/ super.getPrazo())) {
            jurototal += super.calcularJuro(montanteEmFalta);
        }
        return Math.round(jurototal);
    }

    
    

}
