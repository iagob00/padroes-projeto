package memento;

public class Main {
    public static void main(String[] args) {
        // Criando o EditorTexto e o Historico
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        // Escrevendo e salvando o estado
        editor.escrever("Primeira versão do texto.");
        historico.adicionarMemento(editor.salvar());

        // Modificando o texto e salvando novamente
        editor.escrever("Segunda versão do texto.");
        historico.adicionarMemento(editor.salvar());

        // Exibindo o texto atual
        System.out.println("Texto atual: " + editor.getTexto());

        // Restaurando o estado anterior
        editor.restaurar(historico.getUltimoMemento());

        // Exibindo o texto após a restauração
        System.out.println("Texto após restauração: " + editor.getTexto());
    }

}
