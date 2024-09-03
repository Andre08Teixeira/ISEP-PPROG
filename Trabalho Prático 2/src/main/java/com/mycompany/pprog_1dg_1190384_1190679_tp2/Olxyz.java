package com.mycompany.pprog_1dg_1190384_1190679_tp2;

import java.util.ArrayList;
import java.util.List;

public class Olxyz {

    public static void main(String[] args) {

        //b) 1)
        Anunciante anunciantes[] = new Anunciante[5];

        //b) 2)
        List<Vendavel> vend1 = new ArrayList<>();
        List<Alugavel> alug1 = new ArrayList<>();

        Endereco endanunciante1 = new Endereco("Rua José Santos", "3200-200", "Lisboa");
        Telemovel t1 = new Telemovel("Huawei p20", 500);
        Endereco endapart1 = new Endereco("Rua Almeida dos Santos", "4520-316", "Santa Maria da Feira");
        Apartamento apart1 = new Apartamento(endapart1, 32000, 2600);
        Automovel carro1 = new Automovel("Peugeout", "208", 0, 2500);
        vend1.add(t1);
        alug1.add(carro1);
        alug1.add(apart1);
        Anunciante a1 = new Anunciante("Rodrigo", endanunciante1, vend1, alug1);
        anunciantes[0] = a1;

        //b) 3)
        List<Vendavel> vend2 = new ArrayList<>();
        List<Alugavel> alug2 = new ArrayList<>();

        Endereco endanunciante2 = new Endereco("Rua Monte Alegre", "3500-238", "Porto");
        Automovel carro2 = new Automovel("Nissan", "Micra", 30000, 0);
        Telemovel t2 = new Telemovel("Samsung A6", 700);
        Endereco endapart2 = new Endereco("Rua das Corgas", "4300-200", "Aveiro");
        Apartamento apart2 = new Apartamento(endapart2, 45000, 3500);
        vend2.add(t2);
        vend2.add(carro2);
        alug2.add(apart2);
        Anunciante a2 = new Anunciante("Paulo", endanunciante2, vend2, alug2);
        anunciantes[1] = a2;
        

        //b) 4)
        List<Vendavel> vend3 = new ArrayList<>();
        List<Alugavel> alug3 = new ArrayList<>();

        Endereco endanunciante3 = new Endereco("Rua Bragantino", "4032-239", "Porto");
        Endereco endapart31 = new Endereco("Rua dos Santos", "4380-233", "Faro");
        Endereco endapart32 = new Endereco("Rua Visconde", "3484-484", "Mansores");
        Apartamento apart31 = new Apartamento(endapart31, 20000, 1000);
        Apartamento apart32 = new Apartamento(endapart32, 50000, 4000);
        alug3.add(apart31);
        alug3.add(apart32);
        Anunciante a3 = new Anunciante("Sofia", endanunciante3, vend3, alug3);
        anunciantes[2] = a3;

        //b) 5)
        int nralugaveis = 0;
        for (Anunciante an : anunciantes) {
            if (an instanceof Anunciante) {
                nralugaveis += an.getListaParaAlugar().size();
            }
        }

        System.out.println("Há, neste momento," + nralugaveis + " artigos disponíveis para aluguer na plataforma Olxyz");
        System.out.println("\n\n");
        
        //b) 6)
        for (Anunciante an : anunciantes) {
            if ((an instanceof Anunciante)&&(!an.getListaParaVender().isEmpty())) {
                System.out.println("\nNome: " + an.getNome() + "\nEndereço: " + an.getEndereco()
                        + "\nSomatório das suas possíveis vendas: " + an.quantiaTotalVendaveis());
            }
        }
        System.out.println("\n\n");

        //b) 7)
        for (Anunciante an : anunciantes) {
            if ((an instanceof Anunciante)&&(!an.getListaParaAlugar().isEmpty())) {
                System.out.println("\nO alugável do anunciante com o nome " + an.getNome()
                        + "\nque pode gerar maior lucro à Olxyz é um " + an.alugavelMaisCaro().getClasse()
                        + "\ncom o valor de " + an.alugavelMaisCaro().precoAlugavel());
            }
        }
        System.out.println("\n\n");

    }

}
