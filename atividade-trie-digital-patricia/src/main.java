public class main {
    public static void main(String[] args) {
        Tree arv = new Tree();

        // inserção de palavras
        arv.inserir("galo");
        arv.inserir("gel");
        arv.inserir("sola");
        arv.inserir("solado");
        arv.inserir("diamante");
        arv.inserir("solo");
        arv.inserir("gato");
        arv.inserir("gatao");
        arv.inserir("bola");
        arv.inserir("cachorro");
        arv.inserir("cachorra");
        arv.inserir("cachorrao");
        arv.inserir("zebra");
        arv.inserir("zaptos");
        arv.inserir("zap");
        arv.inserir("elefante");
        arv.inserir("baleia");
        arv.inserir("baleia azul");
        arv.inserir("solar");
        arv.inserir("amarelo");
        arv.inserir("ceu");
        arv.inserir("celular");
        arv.inserir("dinheiro");
        arv.inserir("vassoura");
        arv.inserir("computador");




        //mostra todas as informações
        arv.mostrarInformacoes();
        System.out.println("\n--------------------------------------------------------------\n");

        //devolve a palavra
        System.out.println(arv.procuraPalavra("vassoura").getPalavra());
        System.out.println(arv.procuraPalavra("dinheiro").getPalavra());
        System.out.println(arv.procuraPalavra("baleia azul").getPalavra());
        System.out.println(arv.procuraPalavra("baleia").getPalavra());
        System.out.println(arv.procuraPalavra("diamante").getPalavra());

        System.out.println("\n--------------------------------------------------------------\n");

        //exibe todas as palavras
        arv.exbirPalavras();
    }
}
