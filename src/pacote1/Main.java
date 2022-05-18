package pacote1;
public class Main {
    public static void main(String[] args) {
        //calculadora

        System.out.println("Exercicios Calculadora");
        Calculadora.soma(9, 5);
        Calculadora.subtracao(6, 3);
        Calculadora.divisao(9, 3);
        Calculadora.multiplicacao(3, 7);

        //mensagem

        System.out.println("Exercicios Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //emprestimo

        System.out.println("Exercicio de Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresparcelas());
        Emprestimo.calcular(1000, 5);
    }
}
