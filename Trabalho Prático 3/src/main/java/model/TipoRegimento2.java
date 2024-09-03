package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The type Tipo regimento 2.
 */
public class TipoRegimento2 extends ProcessoSeriacao implements Comparator<Candidatura>{


    /**
     * Instantiates a new Tipo regimento 2.
     */
    public TipoRegimento2(){
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
         double desvio1 = desvioPadrao(c1.getAnuncio().getTarefa(),c1.getFreelancer());
        double desvio2 = desvioPadrao(c2.getAnuncio().getTarefa(),c2.getFreelancer());
        if (media1 == media2) {
            if(desvio1==desvio2){
            if (c1.getValorPretendido()==c2.getValorPretendido()) {
                return -(c1.getDataCandidatura().compareTo(c1.getDataCandidatura()));
            } else {
                return -((int)(c1.getValorPretendido()-c2.getValorPretendido()));
            }
            }else {
                return -((int)(desvio1-desvio2));
            }
        }
        return (int)(media1-media2);
    }
    
}