package com.mycompany.pprog_1dg_1190384_1190679_tp2;

import java.util.ArrayList;
import java.util.List;


public class Anunciante{
    
/**
     * O nome do anunciante.
     */
    private String nome;
    
    /**
     * O endereço do anunciante.
     */
    private Endereco endereco;
    
    
    /**
     * A lista do que tem para vender
     */
    private List<Vendavel> lista_vender;
    
    /**
     * A lista do que tem para alugar.
     */
    private List<Alugavel> lista_alugar; 
    
    
    private static final int LIMITE_ALUGAVEL=3;
    
    
    private static final int LIMITE_VENDAVEL=2;
    
    
    
    /**
     * O nome do anunciante por omissão.
     */
    private static final String NOME_OMISSAO="Desconhecido";
    
    /**
     * Constrói uma instância do anunciante com nome,endereco, lista do que tem para vender e a lista do que tem para alugar.  
     */
    public Anunciante(){
        this.nome=NOME_OMISSAO;
        this.endereco=new Endereco();
        this.lista_alugar=new ArrayList<>();
        this.lista_vender=new ArrayList<>();
    }
    
    /**
     * Constrói uma instância do anunciante recebendo o nome do Anunciante,endereco do anunciante, lista do que tem para vender e lista do que tem para alugar. 
     *
     * @param nome o nome do anunciante.
     * @param endereco a morada do anunciante.
     */
    
    public Anunciante(String nome, Endereco endereco){
        this.nome=nome;
        this.endereco=new Endereco(endereco);
        this.lista_alugar=new ArrayList<>();
        this.lista_vender=new ArrayList<>();
    }
    
    public Anunciante(String nome, Endereco endereco,List<Vendavel> lista_vender, List<Alugavel> lista_alugar){
        if((lista_vender.size()<=LIMITE_VENDAVEL)&&(lista_alugar.size()<=LIMITE_ALUGAVEL)){
        this.nome=nome;
        this.endereco=new Endereco(endereco);
        this.lista_alugar=lista_alugar;
        this.lista_vender=lista_vender;
        }
        }
    
    
    /**
     * Devolve o nome do anunciante.
     * 
     * @return nome do anunciante.
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Devolve a morada do anunciante.
     * 
     * @return endereco do anunciante.
     */
    public Endereco getEndereco(){
        return endereco;
    }
    
    /**
     * Devolve a lista do que tem para vender.
     * 
     * @return lista do que tem para vender.
     */
    
    public List<Vendavel> getListaParaVender(){
        return lista_vender;
    }
    
    /**
     * Devolve a lista do que tem para alugar.
     * 
     * @return lista do que tem para alugar.
     */
    
    public List<Alugavel> getListaParaAlugar(){
        return lista_alugar;
    }
    
     /**
     * Modifica o nome do anunciante.
     * 
     * @param nome o novo nome do anunciante.
     */      
    public void setNome(String nome){
        this.nome=nome;
    }
     /**
     * Modifica o endereco do anunciante.
     * 
     * @param endereco o novo endereco do anunciante.
     */  
    public void setEndereco(Endereco endereco){
        this.endereco=new Endereco(endereco);
    }
    
     /**
     * Adiciona alugável à lista de alugáveis.
     *
     * @param alugavel um objeto para alugar.
     */
     public void addAlugavel(Alugavel alugavel){
         if(lista_alugar.size()<LIMITE_ALUGAVEL){
         lista_alugar.add(alugavel);
         }
     }
     
     /**
     * Adiciona vendável à lista de vendáveis.
     *
     * @param vendavel um objeto para alugar.
     */
     public void addVendavel(Vendavel vendavel){
         if(lista_vender.size()<LIMITE_VENDAVEL){
         lista_vender.add(vendavel);
         }
     }
     
     /**
     * Devolve a descrição textual do anunciante.
     *
     * @return caraterísticas do anunciante.
     */
     @Override
    public String toString() {
        return String.format("Anunciante:%n Nome=>%s%n Endereço=>%s%n lista do que tem para vender=>%s%n lista do que tem para alugar %s",
                nome, endereco,lista_vender,lista_alugar);
    }
     
      /**
     * Devolve a quantia total de vendáveis.
     *
     * @return quantia total de vendáveis.
     */
     public double quantiaTotalVendaveis(){
         double total=0;
         for(int i=0; i<lista_vender.size();i++){
             total+=lista_vender.get(i).precoVendavel();
         }
         return total;
     }
     

     /**
     * Devolve o alugável mais caro.
     *
     * @return alugável mais caro.
     */
    public Alugavel alugavelMaisCaro(){
         Alugavel alugavel=lista_alugar.get(0);
         double maximo=lista_alugar.get(0).precoAlugavel();
         for(int i=1; i<lista_alugar.size();i++){
             if(lista_alugar.get(i).precoAlugavel()>maximo){
                 maximo=lista_alugar.get(i).precoAlugavel();
                 alugavel=lista_alugar.get(i);
             }
         }
         return alugavel;
     }
    
    
}
