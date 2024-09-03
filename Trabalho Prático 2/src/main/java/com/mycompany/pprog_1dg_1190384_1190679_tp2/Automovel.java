
package com.mycompany.pprog_1dg_1190384_1190679_tp2;

public class Automovel implements Vendavel, Alugavel{
    
    /**
     * marca do automóvel.
     */
    private String marca;
    
    /**
     * O modelo do automóvel.
     */
    private String modelo;
    
    /**
     *o valor de venda pretendido.
     */
    private double valor_de_venda;
    
    /**
     * O valor de aluguer pretendido.
     */
    private double valor_de_aluguer; 
    
    
    /**
     * A marca do automóvel por omissão.
     */
    private static final String MARCA_OMISSAO="Desconhecida";
    
    /**
     *O modelo por omissão.
     */
    private static final String MODELO_OMISSAO="Desconhecido";
    
    /**
     * Valor de venda por omissão.
     */
    private static final double VALOR_DE_VENDA_OMISSAO=0;
    
    /**
     * Valor de aluguer por omissão.
     */
    private static final double VALOR_DE_ALUGUER_OMISSAO=0;
    
    /**
     * Constrói uma instância do automóvel com marca,modelo,valor de venda pretendido e valor de aluguer pretendido.
     */
    public Automovel(){
        this.marca=MARCA_OMISSAO;
        this.modelo=MODELO_OMISSAO;
        this.valor_de_venda=VALOR_DE_VENDA_OMISSAO;
        this.valor_de_aluguer=VALOR_DE_ALUGUER_OMISSAO;
        
    }
    
    /**
     * Constrói uma instância do automóvel recebendo a marca do automóvel,modelo do automóvel , valor de venda pretendido e o valor de aluguer pretendido
     *
     * @param marca marca do automóvel.
     * @param modelo modelo do automóvel.
     * @param valor_de_venda valor de venda pretendido .
     * @param valor_de_aluguer valor de aluguer pretendido.
     */
    
    public Automovel (String marca, String modelo, double valor_de_venda, double valor_de_aluguer){
        this.marca=marca;
        this.modelo=modelo;
        this.valor_de_venda=valor_de_venda;
        this.valor_de_aluguer=valor_de_aluguer;
    }
    
    /**
     * Devolve a marca do automóvel.
     * 
     * @return marca do automóvel.
     */
    public String getMarca(){
        return marca;
    }
    
    /**
     * Devolve o modelo do automóvel.
     * 
     * @return modelo do automóvel.
     */
    public String getModelo(){
        return modelo;
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
     * Devolve o valor de aluguer pretendido.
     * 
     * @return valor de aluguer pretendido.
     */
    
    public double getValorDeAluguer(){
        return valor_de_aluguer;
    }
    
     /**
     * Modifica a marca do automóvel
     * 
     * @param marca a nova marca do automóvel.
     */      
    public void setMarca(String marca){
        this.marca=marca;
    }
     /**
     * Modifica o modelo do automóvel.
     * 
     * @param modelo o novo modelo do automóvel.
     */  
    public void setModelo(String modelo){
        this.modelo=modelo;
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
     * Modifica o valor de aluguer pretendido.
     * 
     * @param valor_de_aluguer o novo valor de aluguer pretendido.
     */ 
    public void setValorDeAluguer(double valor_de_aluguer){
    this.valor_de_aluguer=valor_de_aluguer;
    }
    
   /**
     * Devolve a descrição textual do automóvel.
     *
     * @return caraterísticas do automóvel.
     */
    
    @Override
    public String toString() {
        return String.format(
                "Automóvel:%n Marca=%s%n Modelo=%s%n valor de venda pretendido=%s%n valor de aluguer pretendido %s",
                marca,modelo,valor_de_venda,valor_de_aluguer);
    }
    
    
    /**
     * Devolve o preço do automóvel para alugar.
     *
     * @return preço do automóvel para alugar.
     */
    
    @Override
    public double precoAlugavel() {
        return valor_de_aluguer*(1+TAXA_ALUGAVEL);
    }
    
    
    /**
     * Devolve do nome do objeto instanciado.
     *
     * @return do nome do objeto instanciado.
     */
    @Override
    public String getClasse(){
        return "automóvel";
    }
    
    
    /**
     * Devolve o preço do automóvel para vender.
     *
     * @return preço do automóvel para vender.
     */
    
    @Override
    public double precoVendavel() {
        return valor_de_venda*(1+TAXA_VENDAVEL);
    }
    
    
}

    
    
