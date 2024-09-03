/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class ProcessoSeriacaoTest {
    
    public ProcessoSeriacaoTest() {
    }



     /**
     * Test of mediaNiveis method, of class ProcessoSeriacao.
     */
    @Test
    public void testMediaNiveis() {
        System.out.println("mediaNiveis");
        Tarefa tf = new Tarefa("Referencia","Designacao","DESCINF","DESCTECNICA",2,10);
        ListaCompetencias lc = new ListaCompetencias();
        CompetenciaTecnica ct1=new CompetenciaTecnica("Codigo1","descra1","DESCDET1");
        CompetenciaTecnica ct2=new CompetenciaTecnica("Codigo2","descra2","DESCDET2");
        GrauProficiencia gp1= new GrauProficiencia(2,"DESIGNACAO1");
        GrauProficiencia gp2= new GrauProficiencia(4,"DESIGNACAO2");
        ct1.setGrauProficiencia(gp1);
        ct2.setGrauProficiencia(gp2);
        lc.addCompetencia(ct1);
        lc.addCompetencia(ct2);
        tf.setListaCompetencias(lc);
        Freelancer freelancer = new Freelancer("Roberto","NIF",910123456,"email");
        ReconhecimentoCT rct1 = new ReconhecimentoCT(ct1);
        ReconhecimentoCT rct2 = new ReconhecimentoCT(ct2);
        ListaReconhecimentos lr1 = new ListaReconhecimentos();
        lr1.addReconhecimento(rct1);
        lr1.addReconhecimento(rct2);
        freelancer.setListaReconhecimentos(lr1);
        TipoRegimento1 instance = new TipoRegimento1();
        double expResult = 3;
        double result = instance.mediaNiveis(tf, freelancer);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of desvioPadrao method, of class ProcessoSeriacao.
     */
    @Test
    public void testDesvioPadrao() {
        System.out.println("desvioPadrao");
        Tarefa tf = new Tarefa("Referencia","Designacao","DESCINF","DESCTECNICA",2,10);
        ListaCompetencias lc = new ListaCompetencias();
        CompetenciaTecnica ct1=new CompetenciaTecnica("Codigo1","descra1","DESCDET1");
        CompetenciaTecnica ct2=new CompetenciaTecnica("Codigo2","descra2","DESCDET2");
        GrauProficiencia gp1= new GrauProficiencia(2,"DESIGNACAO1");
        GrauProficiencia gp2= new GrauProficiencia(4,"DESIGNACAO2");
        ct1.setGrauProficiencia(gp1);
        ct2.setGrauProficiencia(gp2);
        lc.addCompetencia(ct1);
        lc.addCompetencia(ct2);
        tf.setListaCompetencias(lc);
        Freelancer freelancer = new Freelancer("Roberto","NIF",910123456,"email");
        ReconhecimentoCT rct1 = new ReconhecimentoCT(ct1);
        ReconhecimentoCT rct2 = new ReconhecimentoCT(ct2);
        ListaReconhecimentos lr1 = new ListaReconhecimentos();
        lr1.addReconhecimento(rct1);
        lr1.addReconhecimento(rct2);
        freelancer.setListaReconhecimentos(lr1);
        TipoRegimento1 instance = new TipoRegimento1();
        double expResult = 1;
        double result = instance.desvioPadrao(tf, freelancer);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of seriarEClassificacoes method, of class ProcessoSeriacao.
     */
    @Test
    public void testSeriarEClassificacoes() {
        System.out.println("seriarEClassificacoes");
        Tarefa tf = new Tarefa("Referencia","Designacao","DESCINF","DESCTECNICA",2,10);
        ListaCompetencias lc = new ListaCompetencias();
        CompetenciaTecnica ct1=new CompetenciaTecnica("Codigo1","descra1","DESCDET1");
        CompetenciaTecnica ct2=new CompetenciaTecnica("Codigo2","descra2","DESCDET2");
        GrauProficiencia gp1= new GrauProficiencia(2,"DESIGNACAO1");
        GrauProficiencia gp2= new GrauProficiencia(4,"DESIGNACAO2");
        ct1.setGrauProficiencia(gp1);
        ct2.setGrauProficiencia(gp2);
        lc.addCompetencia(ct1);
        lc.addCompetencia(ct2);
        tf.setListaCompetencias(lc);
        Freelancer freelancer1 = new Freelancer("Roberto","NIF",910123456,"email");
        ListaCompetencias lc1 = new ListaCompetencias();
        CompetenciaTecnica ct3=new CompetenciaTecnica("Codigo1","descra1","DESCDET1");
        CompetenciaTecnica ct4=new CompetenciaTecnica("Codigo2","descra2","DESCDET2");
        GrauProficiencia gp3= new GrauProficiencia(2,"DESIGNACAO1");
        GrauProficiencia gp4= new GrauProficiencia(2,"DESIGNACAO2");
        ct3.setGrauProficiencia(gp3);
        ct4.setGrauProficiencia(gp4);
        lc1.addCompetencia(ct3);
        lc1.addCompetencia(ct4);

        Freelancer freelancer2 = new Freelancer("António","NIF",910343456,"email");
        ReconhecimentoCT rct1 = new ReconhecimentoCT(ct1);
        ReconhecimentoCT rct2 = new ReconhecimentoCT(ct2);
        ListaReconhecimentos lr1 = new ListaReconhecimentos();
        lr1.addReconhecimento(rct1);
        lr1.addReconhecimento(rct2);
        freelancer1.setListaReconhecimentos(lr1);
        ReconhecimentoCT rct3 = new ReconhecimentoCT(ct3);
        ReconhecimentoCT rct4 = new ReconhecimentoCT(ct4);
        ListaReconhecimentos lr2 = new ListaReconhecimentos();
        lr2.addReconhecimento(rct3);
        lr2.addReconhecimento(rct4);
        freelancer2.setListaReconhecimentos(lr2);
        Date data = new Date(2020,05,24);
        Candidatura c1 = new Candidatura(data,23,24,"txtA","txtM");
        Candidatura c2 = new Candidatura(data,23,24,"txtA","txtM");
        c1.setFreelancer(freelancer1);
        c2.setFreelancer(freelancer2);
        List<Candidatura> lcand = new ArrayList<>();
        lcand.add(c1);
        lcand.add(c2);
        List<Candidatura> lcand1 = new ArrayList<>();
        lcand1.add(c2);
        lcand1.add(c1);
        TipoRegimento1 instance = new TipoRegimento1();
         Date data1 = new Date(2020,05,20);
         Date data2 = new Date(2020,06,24);
         Date data3 = new Date(2020,05,21);
         Date data4 = new Date(2020,06,24);
         Date data5 = new Date(2020,06,26);
         Date data6 = new Date(2020,07,20);
         
         Anuncio anun = new Anuncio(data1,data2,data3,data4,data5,data6);
         c1.setAnuncio(anun);
         c2.setAnuncio(anun);
         anun.setTarefa(tf);
         
        List<Candidatura> lista1 = lcand;
        List<Candidatura> lista2 = instance.seriarEClassificacoes(lcand1);
        ListaCandidaturas expResult = new ListaCandidaturas();
        ListaCandidaturas result = new ListaCandidaturas();
        expResult.setListaCandidaturas(lista1);
        result.setListaCandidaturas(lista2);
        assertEquals(expResult, result);
         
         
         
        
       
     
        
        
       
        // TODO review the generated test code and remove the default call to fail.

    }

  
    
}
