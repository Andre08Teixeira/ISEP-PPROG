package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Lista reconhecimentos.
 */
public class ListaReconhecimentos {
    
    private List<ReconhecimentoCT> lr;

    /**
     * Instantiates a new Lista reconhecimentos.
     */
    public  ListaReconhecimentos(){
        lr=new ArrayList<>();
    }

    /**
     * Get lista reconhecimentos list.
     *
     * @return the list
     */
    public List<ReconhecimentoCT> getListaReconhecimentos(){
        return lr;
    }

    /**
     * Add reconhecimento.
     *
     * @param rct the rct
     */
    public void addReconhecimento(ReconhecimentoCT rct) {
            if (validaReconhecimento(rct)) {
                lr.add(rct);
            }
    }


    /**
     * Valida reconhecimento boolean.
     *
     * @param rct the rct
     * @return the boolean
     */
    public boolean validaReconhecimento(ReconhecimentoCT rct) {
        return !lr.contains(rct);
    }
    
    @Override
    public String toString() {
        List<ReconhecimentoCT> listar = new ArrayList<>(lr);
        StringBuilder s = new StringBuilder();
        for (ReconhecimentoCT r : listar) {
            s.append(r);
            s.append("\n");
        }
        
        return s.toString().trim();
    }
    
}
