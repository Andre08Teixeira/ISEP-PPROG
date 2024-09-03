package model;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Lista competencias.
 */
public class ListaCompetencias {
    
    private List<CompetenciaTecnica> listaCompetencias;

    /**
     * Instantiates a new Lista competencias.
     */
    public ListaCompetencias(){
        listaCompetencias= new ArrayList<>();
    }


    /**
     * Get lista competencias list.
     *
     * @return the list
     */
    public List<CompetenciaTecnica> getListaCompetencias(){
        return listaCompetencias;
    }

    /**
     * Add competencia.
     *
     * @param comp the comp
     */
    public void addCompetencia(CompetenciaTecnica comp) {
            if (validaCompetencia(comp)) {
                listaCompetencias.add(comp);
        }
    }

    /**
     * Valida competencia boolean.
     *
     * @param comp the comp
     * @return the boolean
     */
    public boolean validaCompetencia(CompetenciaTecnica comp) {
        return !listaCompetencias.contains(comp);
    }
     
     @Override
    public String toString() {
        List<CompetenciaTecnica> lc = new ArrayList<>(listaCompetencias);
        StringBuilder s = new StringBuilder();
        for (CompetenciaTecnica comp : lc) {
            s.append(comp);
            s.append("\n");
        }
        
        return s.toString().trim();
    }
}
