package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * The type Processo seriacao.
 */
public abstract class ProcessoSeriacao {
    
    private final Date DATA_SERIACAO;

    /**
     * Instantiates a new Processo seriacao.
     */
    public ProcessoSeriacao(){
        DATA_SERIACAO = Calendar.getInstance().getTime();
    }

    /**
     * Seriar list.
     *
     * @param lc the lc
     * @return the list
     */
    public abstract List<Candidatura> seriar(List<Candidatura> lc);


    /**
     * Get seriacao string.
     *
     * @return the string
     */
    public String getSeriacao(){
        if(this instanceof TipoRegimento1){
            return "Tipo de Regimento 1";
        }else if(this instanceof TipoRegimento2){
            return "Tipo de Regimento2";
        }
        return "SEM RENDIMENTO DEFINIDO";
    }

    /**
     * Media niveis double.
     *
     * @param tf the tf
     * @param fl the fl
     * @return the double
     */
    public double mediaNiveis(Tarefa tf, Freelancer fl){
        int valortotal=0;
        int competencias=0;
        for(ReconhecimentoCT rc : fl.getListaReconhecimentos().getListaReconhecimentos()){
            for(CompetenciaTecnica ct : (tf.getListaCompetencias().getListaCompetencias())){
                if(ct.equals(rc.getCompetenciaTecnica())){
                    valortotal+=rc.getCompetenciaTecnica().getGrauProficiencia().getValor();
                    competencias++;
                }
            }
        }
        return (valortotal/competencias);
    }

    /**
     * Desvio padrao double.
     *
     * @param tf the tf
     * @param fl the fl
     * @return the double
     */
    public double desvioPadrao(Tarefa tf, Freelancer fl){
       double media=mediaNiveis(tf,fl);
       int valortotal=0;
        int competencias=0;
        for(ReconhecimentoCT rc : fl.getListaReconhecimentos().getListaReconhecimentos()){
            for(CompetenciaTecnica ct : (tf.getListaCompetencias().getListaCompetencias())){
                if(ct.equals(rc.getCompetenciaTecnica())){
                    valortotal+=Math.pow((rc.getCompetenciaTecnica().getGrauProficiencia().getValor()-media),2);
                    competencias++;
                }
            }
        }
        return Math.sqrt(valortotal/competencias);
    }

    /**
     * Seriar e classificacoes.
     *
     * @param lc the lc
     * @return 
     */
    public List<Candidatura> seriarEClassificacoes(List<Candidatura> lc) {
        this.seriar(lc);
        List<Candidatura> copia = new ArrayList<>(lc);
        for (int x = 0; x < copia.size(); x++) {
            copia.get(x).setClassificacao(new Classificacao(x + 1));
        }
        return lc;
    }
    
    
}
