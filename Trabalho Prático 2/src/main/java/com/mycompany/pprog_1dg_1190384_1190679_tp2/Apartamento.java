package com.mycompany.pprog_1dg_1190384_1190679_tp2;


public class Apartamento implements Alugavel{

    
    /**
     * O endereço do anunciante.
     */
    private Endereco endereco;
    
    /**
     * A área do apartamento.
     */
    private double area ;
    
    /**
     * O valor do aluguer pretendido.
     */
    private double valor_de_aluguer;
    
    /**
     *A área do apartamento por omissão.
     */
    private static final double AREA_OMISSAO= 0;
    
    /**
     * O valor do aluguer pretendido por omissão.
     */
    private static final double VALOR_ALUGUER_OMISSAO= 0;
    
    /**
     * Constrói uma instância de Apartamento com endereço do apartamento, área do mesmo e o valor de aluguer pretendido.  
     */
    public Apartamento(){
        this.endereco=new Endereco();
        this.area=AREA_OMISSAO;
        this.valor_de_aluguer=VALOR_ALUGUER_OMISSAO;   
    }
    
    /**
     * Constrói uma instância de Apartamento recebendo o endereço do apartamento, a área do mesmo e o valor de aluguer pretendido. 
     *
     * @param endereco o endereço do apartamento.
     * @param area  a área do apartamento.
     * @param valor_aluguer o valor do aluguer pretendido.
     */
    
    public Apartamento(Endereco endereco, double area, double valor_aluguer){
        this.endereco=new Endereco(endereco);
        this.area=area;
        this.valor_de_aluguer=valor_aluguer;
      }
    
    /**
     * Devolve o endereço do apartamento.
     * 
     * @return endereço do apartamento.
     */
    public Endereco getEndereco(){
        return endereco;
    }
    
    /**
     * Devolve a área do apartamento.
     * 
     * @return área do apartamento.
     */
    public double getArea(){
        return area;
    }
    
    /**
     * Devolve o valor do aluguer pretendido.
     * 
     * @return valor de aluguer pretendido.
     */
    
    public double getValorAluguer(){
        return this.valor_de_aluguer;
    }
    
   
     /**
     * Modifica o endereço do apartamento.
     * 
     * @param endereco o novo endereço do apartamento.
     */      
    public void setEndereco(Endereco endereco){
        this.endereco=new Endereco(endereco);
    }
     /**
     * Modifica a área do apartamento.
     * 
     * @param area a nova área do apartamento
     */  
    public void setArea(double area){
        this.area=area;
    }
    
     /**
     * Modifica o valor do aluguer pretendido.
     * 
     * @param valor_aluguer o novo valor de aluguer pretendido.
     */ 
    public void setValorAluguer(double valor_aluguer){
        this.valor_de_aluguer=valor_aluguer;
    }
    
    
    /**
     * Devolve a descrição textual do apartamento.
     *
     * @return caraterísticas do apartamento.
     */
    @Override
    public String toString() {
        return String.format(
                "Apartamento:%n Endereço=%s%n Área=%s%n Valor do aluguer=%s",
                endereco, area,valor_de_aluguer);
    }
    
     /**
     * Devolve do nome do objeto instanciado.
     *
     * @return do nome do objeto instanciado.
     */
    @Override
    public String getClasse(){
        return "apartamento";
    }

     /**
     * Devolve o preço do apartamento para alugar.
     *
     * @return preço do apartamento para alugar.
     */
    @Override
    public double precoAlugavel() {
        return valor_de_aluguer*(1+TAXA_ALUGAVEL);
    }
    
    
    
}

    
