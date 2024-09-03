package com.mycompany.pprog_1dg_1190384_1190679_tp2;

public class Endereco {
    
    /**
     * O nome da rua do anunciante.
     */
    private String nome_rua;
    
    /**
     * O código Postal do anunciante.
     */
    private String codigo_postal ;
    
    /**
     * localidade do anunciante
     */
    private String localidade;
    
   
    /**
     * O nome da rua do anunciante por omissão.
     */
    private static final String NOME_RUA_OMISSAO="Desconhecido";
    
    /**
     * O código Postal do anunciante por omissão.
     */
    private static final String CODIGO_POSTAL_OMISSAO= "Desconhecido";
    
    /**
     * localidade do anunciante por omissão.
     */
    private static final String LOCALIDADE_OMISSAO= "Desconhecida";
    
    /**
     * Constrói uma instância de Endereço com nome da rua , código Postal e localidade.  
     */
    public Endereco(){
        this.nome_rua=NOME_RUA_OMISSAO;
        this.codigo_postal=CODIGO_POSTAL_OMISSAO;
        this.localidade=LOCALIDADE_OMISSAO;   
    }
    
    /**
     * Constrói uma instância de Endereço recebendo uma instância de Endereço já existente.. 
     *
     * @param outroEndereco o endereço já existente..
     */
    
    public Endereco(Endereco outroEndereco){
        this.nome_rua=outroEndereco.nome_rua;
        this.codigo_postal=outroEndereco.codigo_postal;
        this.localidade=outroEndereco.localidade;
    }
    
    /**
     * Constrói uma instância de Endereço recebendo o nome da rua do Anunciante,código postal e localidade . 
     *
     * @param nome_rua o nome da rua do anunciante.
     * @param codigo_postal  o código postal do anunciante.
     * @param localidade a localidade do anunciante.
     */
    
    public Endereco(String nome_rua, String codigo_postal, String localidade){
        this.nome_rua=nome_rua;
        this.codigo_postal=codigo_postal;
        this.localidade=localidade;
      }

    
    /**
     * Devolve o nome da rua do anunciante.
     * 
     * @return nome da rua do anunciante.
     */
    public String getNomeRua(){
        return nome_rua;
    }
    
    /**
     * Devolve o código postal do anunciante.
     * 
     * @return código postal do anunciante.
     */
    public String getCodigoPostal(){
        return codigo_postal;
    }
    
    /**
     * Devolve a localidade do anunciante.
     * 
     * @return localidade do anunciante.
     */
    
    public String getLocalidade(){
        return localidade;
    }
    
   
     /**
     * Modifica o nome da rua do anunciante.
     * 
     * @param nome_rua o novo nome do anunciante.
     */      
    public void setNomeRua(String nome_rua){
        this.nome_rua=nome_rua;
    }
     /**
     * Modifica o código postal do anunciante.
     * 
     * @param codigo_postal o novo código postal do anunciante.
     */  
    public void setCodigoPostal(String codigo_postal){
        this.codigo_postal=codigo_postal;
    }
    
     /**
     * Modifica a localidade do anunciante.
     * 
     * @param localidade a nova localidade do anunciante.
     */ 
    public void setLocalidade(String localidade){
        this.localidade=localidade;
    }
    
    
    /**
     * Devolve a descrição textual do endereço.
     *
     * @return caraterísticas do endereço.
     */

    @Override
    public String toString() {
        return String.format(
                "Nome da rua=>%s    Código Postal=>%s    Localidade=>%s",
                nome_rua, codigo_postal,localidade);
    }
    
    
}

    
    
    
