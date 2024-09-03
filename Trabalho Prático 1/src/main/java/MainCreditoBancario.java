
public class MainCreditoBancario {

    public static void main(String[] args) {

        // a)
        CreditoHabitacao ch1 = new CreditoHabitacao("João", "Trolha", 120000, 240, 1);
        CreditoHabitacao ch2 = new CreditoHabitacao("Maria", "Engenheira Informática", 64000, 160, 1);
        CreditoAutomovel ca1 = new CreditoAutomovel("Beatriz", "Professora", 105000, 210);
        CreditoAutomovel ca2 = new CreditoAutomovel("Tomás", "Dentista", 76000, 190);
        CreditoEducacao ce1 = new CreditoEducacao("Fábio", "Cozinheiro", 144000, 24, 7);
        CreditoEducacao ce2 = new CreditoEducacao("Elsa", "Eletricista", 18000, 60,24);

        // b) 
        CreditoBancario[] cb = new CreditoBancario[10];

        cb[0] = ch1;
        cb[1] = ch2;
        cb[2] = ca1;
        cb[3] = ca2;
        cb[4] = ce1;
        cb[5] = ce2;

        // c) i)
        for (int i = 0; i <= 5; i++) {
                System.out.println(cb[i].getNome() + " " + cb[i].calcularMontanteAReceberPorCadaCredito());
        }
        
        // c) ii)
        for (int j = 0; j <= 5; j++) {
                System.out.println(cb[j].getNome() + " " + cb[j].calcularMontanteTotalJuros());
        }

        
        // d)
        System.out.println("O número de instâncias de créditos à habitação é "+CreditoHabitacao.numeroCreditosHabitacao()
                +"./nO número de instâncias de créditos ao consumo é "+CreditoConsumo.numeroCreditosConsumo());
        
        // e)
        for(int k=0; k<=5;k++){
            System.out.println("Nome: "+cb[k].getNome()
                    +"--->Montante que a instituição recebe com o empréstimo: "+cb[k].calcularMontanteAReceberPorCadaCredito()
            +"--->Montante dos juros que a instituição recebe com o empréstimo: "+cb[k].calcularMontanteTotalJuros());
        }
        
    }
}
