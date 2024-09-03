
package com.mycompany.pprog_1dg_1190384_1190679_tp2;


public class Telemovel implements Vendavel{
      
    /**
     * Designação do telemóvel.
     */
    private String designacao;
    
    /**
     * O valor de venda pretendido.
     */
    private double valor_de_venda; 
    
    
    /**
     * A designação do telemóvel por omissão.
     */
    private static final String DESIGNACAO_OMISSAO="Desconhecida";
    
    /**
     * Valor de venda do telemóvel por omissão.
     */
    private static final double VALOR_DE_VENDA_OMISSAO=0;
    
    
    /**
     * Constrói uma instância do telemóvel com designação e valor de venda pretendido.
     */
    public Telemovel(){
        this.designacao=DESIGNACAO_OMISSAO;
        this.valor_de_venda=VALOR_DE_VENDA_OMISSAO;
     }
    
    /**
     * Constrói uma instância do telemóvel recebendo a designação do telemóvel e o valor de venda pretendido.
     *
     * @param designacao designação do telemóvel.
     * @param valor_de_venda valor de venda pretendido .
     */
    
    public Telemovel (String designacao,double valor_de_venda){
        this.designacao=designacao;
        this.valor_de_venda=valor_de_venda;
    }
    
    /**
     * Devolve a designação do telemóvel.
     * 
     * @return designação do telemóvel.
     */
    public String getDesignacao(){
        return designacao;
    }
   
    
    /**
     * Devolve o valor de venda pretendido.
     * 
     * @return valor de venda pretendido.
     */
    
    public double getValorDeVenda(){
        return valor_de_venda;
    }
    
    
     /**
     * Modifica a designação do telemóvel.
     * 
     * @param designacao a nova designação do telemóvel.
     */      
    public void setDesignacao(String designacao){
        this.designacao=designacao;
    }
     
     /**
     * Modifica o valor de venda pretendido.
     * 
     * @param valor_de_venda o novo valor de venda pretendido.
     */ 
    public void setValorDeVenda(double valor_de_venda){
        this.valor_de_venda=valor_de_venda;
    }
   
    
   /**
     * Devolve a descrição textual do telemóvel.
     *
     * @return caraterísticas do telemóvel.
     */
    
    @Override
    public String toString() {
        return String.format(
                "Telemóvel:%n Design~ção=%s%n Valor de venda pretendido=%s",
                designacao,valor_de_venda);
    }
    
    /**
     * Devolve do nome do objeto instanciado.
     *
     * @return do nome do objeto instanciado.
     */
    
    public String getClasse(){
        return "telemóvel";
    }
    
    /**
     * Devolve o preço do telemóvel para vender.
     *
     * @return preço do telemóvel para vender.
     */
    
    @Override
    public double precoVendavel() {
        return valor_de_venda*(1+TAXA_VENDAVEL);
    }
    
    
}

    
    

    
