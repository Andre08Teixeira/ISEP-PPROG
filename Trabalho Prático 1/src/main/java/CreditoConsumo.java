/**
 *CreditoConsumo permite a construção de uma hierarquia de classes e
 * por sua vez é subclasse de CreditoBancario.
 *
 */
public abstract class CreditoConsumo extends CreditoBancario {

    /**
     * inicialização de um contador a 0 para contar o número de créditos.
     */
    private static int contadorinstancias = 0;
    
    /**
     *os juros
     */
    private double juros;
    
    /**
     * Juros por omissão
     */
    private static final double JUROS_OMISSAO = 0;

    /**
     * Constrói uma instância de CreditoConsumo atribuindo o nome por omissão,
     * a profissão por omissão,o montante do empréstimo por omissão,
     * o prazo de financiamento por omissão e os juros por omissão.
     */
    public CreditoConsumo() {
        super();
        this.juros = JUROS_OMISSAO;
        contadorinstancias++;
    }

    /**
     * Constrói uma instância de CreditoConsumo recebendo o nome, a profissão,  
     * o montante, o prazo de financiamento e os juros.
     *
     * @param nome o nome do cliente.
     * @param profissao a profissão do cliente.
     * @param montante o montante do empréstimo.
     * @param prazo o prazo de financiamento em meses.
     * @param juros os juros.
     */
    public CreditoConsumo(String nome, String profissao, double montante, int prazo, double juros) {
        super(nome, profissao, montante, prazo);
        this.juros = juros;
        contadorinstancias++;
    }

    /**
     * Devolve os juros.
     *
     * @return Juros.
     */
    public double getJuros() {
        return juros;
    }

    /**
     * Devolve o número de créditos.
     *
     * @return número de créditos.
     */
    public static int numeroCreditosConsumo() {
        return contadorinstancias;
    }

    
    /**
     * Devolve a descrição textual do Crédito Consumo.
     *
     * @return caraterísticas do Crédito Consumo.
     */
    @Override
    public String toString() {
        return String.format("Nome: %s"
                + "%nProfissao: %s"
                + "%nMontante do empréstimo: %.2f"
                + "%nPrazo do financiamento: %d"
                + "%nJuros: %f",
                super.getNome(), super.getProfissao(), super.getMontante(), super.getPrazo(), juros);
    }

    
    @Override
    public abstract double calcularMontanteAReceberPorCadaCredito();
    
    @Override
    public abstract double calcularMontanteTotalJuros();
    
    /**
     * Devolve o juro.
     *
     * @param montanteFalta montante em falta do empréstimo.
     * @return juro.
     */
    public double calcularJuro(double montanteFalta) {
        return (montanteFalta * ((juros/12) / 100));
    }

}
