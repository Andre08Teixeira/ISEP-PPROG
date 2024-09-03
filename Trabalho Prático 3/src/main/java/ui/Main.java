package ui;

import controller.Bootstrap;
import java.util.Scanner;
import model.*;

/**
 * The type Main.
 */
public class Main {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[]args){
        ListaAnuncios la;
        ListaCandidaturas lc;
        int n, n1;
        la=new ListaAnuncios();
        Bootstrap.load(la);
        Scanner sc=new Scanner(System.in);
        System.out.println(la.listarAnuncios());
        System.out.println("\n\nSelecione uma tarefa digitando o número correspondente à mesma tendo em conta a ordem da lista");
        n=sc.nextInt();
        lc=la.getListaAnuncios().get(n).getListaCandidaturas();
        System.out.println(lc.listarCandidaturas());
        System.out.println("\n\nSelecione uma das seriações possíveis"+
                "\nSeriação1 ou Seriação2");
        do{
            n1=sc.nextInt();
        }while((n1<0)||(n1>2));
        
        if(n1==1){
            TipoRegimento1 tr=new TipoRegimento1();
            tr.seriarEClassificacoes(lc.getListaCandidaturas());
            System.out.println(lc.listarCandidaturas());
        }else if(n1==2){
            TipoRegimento2 tr=new TipoRegimento2();
            tr.seriarEClassificacoes(lc.getListaCandidaturas());
            System.out.println(lc.listarCandidaturas());
        }
    }
}
