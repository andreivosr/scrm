public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "filme 1";
        filme1.anoDeLancamento = 2015;
        filme1.duracaoEmMinutos = 10;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(8);
        filme1.avalia(8);
        System.out.println(filme1.somaDasAvaliacoes);
        System.out.println(filme1.pegaMedia());
    }
}