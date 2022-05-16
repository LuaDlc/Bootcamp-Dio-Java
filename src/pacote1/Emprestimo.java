package pacote1;

public class Emprestimo {
    
    public static int getDuasParcelas() {
        return 2;
    }
    
    public static int getTresparcelas() {
        return 3;
    }

    public static double getTaxaDuasparcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcela) {

        if(parcela == 2) {
           
            double valorFinal = valor + (valor * getTaxaDuasparcelas());
            System.out.println("Valor final do emprestimo para duas parcelas: R$ " + valorFinal);
        } else if(parcela == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do emprestimo para tres parcelas: R$ " + valorFinal);

        } else {
            System.out.println("Quantidade de parcelas não aceita!");

        }
    }

    
}
