package model;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Lista candidaturas.
 */
public class ListaCandidaturas {
    
    private List<Candidatura> listaCandidaturas;

    /**
     * Instantiates a new Lista candidaturas.
     */
    public ListaCandidaturas(){
        listaCandidaturas= new ArrayList<>();
    }


    /**
     * Get lista candidaturas list.
     *
     * @return the list
     */
    public List<Candidatura> getListaCandidaturas(){
        return listaCandidaturas;
    }
    
    public void setListaCandidaturas(List<Candidatura> lc){
        
     this.listaCandidaturas=lc;   
    } 

    /**
     * Add candidatura.
     *
     * @param candid the candid
     * @param anun   the anun
     */
    public void addCandidatura(Candidatura candid, Anuncio anun) {
        if (candid.validaCandidatura(anun)) {
            if (validaCandidatura(candid)) {
                listaCandidaturas.add(candid);
            }
        }
    }

    /**
     * Valida candidatura boolean.
     *
     * @param candid the candid
     * @return the boolean
     */
    public boolean validaCandidatura(Candidatura candid) {
        return !listaCandidaturas.contains(candid);
    }

    /**
     * Listar candidaturas string.
     *
     * @return the string
     */
    public String listarCandidaturas() {
        List<Candidatura> lc = new ArrayList<>(listaCandidaturas);
        StringBuilder s = new StringBuilder();
        for (Candidatura candid : lc) {
            s.append(candid.getClassificacao());
            s.append("||");
            s.append(candid.getDataCandidatura());
            s.append("||");
            s.append(candid.getFreelancer().getNome());
            s.append("||");
            s.append(candid.getValorPretendido());
            s.append("||");
            s.append(candid.getNRDias());
            s.append("\n");
        }
        
        return s.toString().trim();
    }
    
     @Override
    public String toString() {
        List<Candidatura> lc = new ArrayList<>(listaCandidaturas);
        StringBuilder s = new StringBuilder();
        for (Candidatura candid : lc) {
            s.append(candid);
            s.append("\n");
        }
        
        return s.toString().trim();
    }
}
