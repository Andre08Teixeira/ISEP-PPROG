package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.*;


/**
 * The type Bootstrap.
 */
public class Bootstrap {
    private static Scanner sc;

    /**
     * Load.
     *
     * @param la the la
     */
    public static void load(ListaAnuncios la){
        try {
            
            File anunfile=new File("Anuncio.txt");
            File freelancerfile=new File("Freelancer.txt");
            File tarefafile=new File("Tarefa.txt");
            File ctfile=new File("CT.txt");
            
            
            List<Anuncio> anunlist= new ArrayList<>();
            la.setListaAnuncios(anunlist);
            List<Candidatura> candidlist=new ArrayList<>();
            List<CompetenciaTecnica> ctlist=new ArrayList<>();
            List<Freelancer> freelancerlist=new ArrayList<>();
            List<Tarefa> tarlist=new ArrayList<>();
            
            loadTarefa(tarefafile,tarlist);
            loadAnuncio(anunfile,anunlist,candidlist);
            loadCT(ctfile,ctlist);
            loadFreelancer(freelancerfile,freelancerlist,ctlist);
            alinharCandidaturas(freelancerlist,candidlist);
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
    }
    }   
    
    private static void loadTarefa(File file, List<Tarefa> tarefas) throws FileNotFoundException{
        sc = new Scanner(file);
        String[] array;
        String linha;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            array = linha.split(";");
            if(array[0].equals("tarefa")){
                Tarefa tarefa=new Tarefa(array[1],array[2],array[3],array[3],Integer.parseInt(array[4]),Integer.parseInt(array[5]));
                tarefas.add(tarefa);
            }else if(array[0].equals("ct")){
                CompetenciaTecnica ct=new CompetenciaTecnica(array[1],array[2],array[3]);
                ct.setGrauProficiencia(new GrauProficiencia(Integer.parseInt(array[4]),array[5]));
                tarefas.get(tarefas.size()-1).getListaCompetencias().addCompetencia(ct);
            }
        }
        sc.close();
    }
    
    private static void loadAnuncio(File file, List<Anuncio> anuncios,List<Candidatura> candids) throws FileNotFoundException{
        sc = new Scanner(file);
        String[] array;
        String[] array1;
        String linha;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            array = linha.split(";");
            if(array[0].equals("anuncio")){
                array1 = array[1].split("/");
                Date date1= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                array1 = array[2].split("/");
                Date date2= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                array1 = array[3].split("/");
                Date date3= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                array1 = array[4].split("/");
                Date date4= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                array1 = array[5].split("/");
                Date date5= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                array1 = array[6].split("/");
                Date date6= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                Anuncio anun=new Anuncio(date1,date2,date3,date4,date5,date6);
                anuncios.add(anun);
            }else if(array[0].equals("candid")){
                array1 = array[1].split("/");
                Date date= new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                Candidatura candid=new Candidatura(date,Double.parseDouble(array[2]),Integer.parseInt(array[3]),array[4],array[5]);
                candid.setAnuncio(anuncios.get(anuncios.size()-1));
                anuncios.get(anuncios.size()-1).getListaCandidaturas().addCandidatura(candid, anuncios.get(anuncios.size()-1));
            }
        }
        sc.close();
    }
    
    
    private static void loadCT(File file, List<CompetenciaTecnica> competencias) throws FileNotFoundException{
        sc = new Scanner(file);
        String[] array;
        String linha;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            array = linha.split(";");
                CompetenciaTecnica ct=new CompetenciaTecnica(array[0],array[1],array[2]);
                ct.setGrauProficiencia(new GrauProficiencia(Integer.parseInt(array[3]),array[4]));
                competencias.add(ct);
        }
        sc.close();
    }
    
    private static void loadFreelancer(File file, List<Freelancer> freelancers,List<CompetenciaTecnica>ctlist) throws FileNotFoundException{
        sc = new Scanner(file);
        String[] array;
        String linha;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            array = linha.split(";");
                Freelancer fl=new Freelancer(array[0],array[1],Integer.parseInt(array[2]),array[3]);
                for(CompetenciaTecnica ct : ctlist){
                    fl.getListaReconhecimentos().addReconhecimento(new ReconhecimentoCT(ct));
                }
        }
        sc.close();
    }    
        
    
    
    
    private static void alinharCandidaturas(List<Freelancer> freelancers, List<Candidatura> candid) throws FileNotFoundException{
        for(int x=0; x<freelancers.size(); x++){
            candid.get(x).setFreelancer(freelancers.get(x));
        }
    }
    

   
    
}
