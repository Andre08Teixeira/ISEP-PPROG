package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The type Tipo regimento 1.
 */
public class TipoRegimento1 extends ProcessoSeriacao implements Comparator<Candidatura>{


    /**
     * Instantiates a new Tipo regimento 1.
     */
    public TipoRegimento1(){
        super();
    }
    
    @Override
    public List<Candidatura> seriar(List<Candidatura> lc){
        List<Candidatura> copia = new ArrayList<>(lc);
        copia.sort(this);
        return copia;
    }
    
    
    @Override
    public int compare(Candidatura c1, Candidatura c2) {
        double media1 = mediaNiveis(c1.getAnuncio().getTarefa(),c1.getFreelancer());
        double media2 = mediaNiveis(c2.getAnuncio().getTarefa(),c2.getFreelancer());
        if (media1 == media2) {
            if (c1.getValorPretendido()==c2.getValorPretendido()) {
                return -(c1.getDataCandidatura().compareTo(c1.getDataCandidatura()));
            } else {
                return -((int)(c1.getValorPretendido()-c2.getValorPretendido()));
            }
        }
        return (int)(media1-media2);
    }

}
