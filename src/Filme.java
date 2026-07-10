public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}

