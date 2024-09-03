
/**
 *CreditoEducacao é subclasse de CreditoConsumo.
 */
public class CreditoEducacao extends CreditoConsumo {
/**
     * Periodo Carência.
     */
    private int periodocarencia;
    
    /**
     * Periodo de Carência por omissão.
     */
    private static final int PERIODO_CARENCIA_OMISSAO = 0;
    
    /**
     *  taxa de juros anual.
     */
    private static final double JUROS = 2;

    /**
     * Constrói uma instância de CreditoEducacao atribuindo o nome por omissão,
     * a profissão por omissão,o montante do empréstimo por omissão, o prazo de
     * financiamento por omissão.
     */
    public CreditoEducacao() {
        super();
        periodocarencia=PERIODO_CARENCIA_OMISSAO;
    }

    /**
     * Constrói uma instância de CreditoEducacao recebendo o nome, a profissão,
     * o montante, o prazo de financiamento.
     *
     * @param nome o nome do cliente.
     * @param profissao a profissão do cliente.
     * @param montante o montante do empréstimo.
     * @param prazo o prazo do financiamento em meses.
     * @param periodocarencia o período de carência em meses.
     */
    public CreditoEducacao(String nome, String profissao, double montante, int prazo,int periodocarencia) {
        super(nome, profissao, montante, prazo, JUROS);
        this.periodocarencia=periodocarencia;
    }
    
    /**
     * Devolve o Período de Carência.
     *
     * @return PeriodoCarencia.
     */
    public int getPeriodoCarencia(){
        return periodocarencia;
    }
    
    /**
     * Modifica o período de Carência.
     *
     * @param periodocarencia periodo de carência.
     */
    public void setPeriodoCarencia(int periodocarencia){
        this.periodocarencia=periodocarencia;
    }
    
    
    /**
     * Devolve o montante a receber por cada crédito.
     *
     * @return montante a receber por cada crédito.
     */
    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        return Math.round(super.getMontante() + calcularMontanteTotalJuros());
    }

    /**
     * Devolve o montante total de juros.
     *
     * @return montante total de juros.
     */
    @Override
    public double calcularMontanteTotalJuros() {
        double jurototal = 0;
        for (double mesanterior = 0; mesanterior < super.getPrazo(); mesanterior ++ ) {
            if(mesanterior<periodocarencia){
            jurototal += super.calcularJuro(super.getMontante());
            }else{
                jurototal+=super.calcularJuro(super.getMontante()-((super.getMontante()/(super.getPrazo()-periodocarencia))*(mesanterior-periodocarencia)));
            }
        }
        return Math.round(jurototal);
    }

    

}
