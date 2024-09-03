package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Lista anuncios.
 *
 * @author Ivo
 */
public class ListaAnuncios {
    
    private List<Anuncio> listaAnuncios;

    /**
     * Instantiates a new Lista Anuncios.
     */
    public ListaAnuncios(){
        listaAnuncios= new ArrayList<>();
    }


    /**
     * Get lista anuncios list.
     *
     * @return the list
     */
    public List<Anuncio> getListaAnuncios(){
        return listaAnuncios;
    }

    /**
     * Set lista anuncios.
     *
     * @param la the la
     */
    public void setListaAnuncios(List<Anuncio> la){
        this.listaAnuncios=la;
    }


    /**
     * Add anuncio.
     *
     * @param anun the anun
     */
    public void addAnuncio(Anuncio anun) {
            if (validaAnuncio(anun)) {
                listaAnuncios.add(anun);
        }
    }

    /**
     * Valida anuncio boolean.
     *
     * @param anun the anun
     * @return the boolean
     */
    public boolean validaAnuncio(Anuncio anun) {
        return !listaAnuncios.contains(anun);
    }


    /**
     * Listar anuncios string.
     *
     * @return the string
     */
    public String listarAnuncios() {
        List<Anuncio> la = new ArrayList<>(listaAnuncios);
        StringBuilder s = new StringBuilder();
        for (Anuncio anun : la) {
            s.append(anun.getTarefa().getReferencia());
            s.append("||");
            s.append(anun.getTarefa().getDesignacao());
            s.append("\n");
        }
        
        return s.toString().trim();
    }
    
    
    @Override
    public String toString() {
        List<Anuncio> la = new ArrayList<>(listaAnuncios);
        StringBuilder s = new StringBuilder();
        for (Anuncio anun : la) {
            s.append(anun);
            s.append("\n");
        }
        
        return s.toString().trim();
    }
    
}
    

