package memento;

class EditorTexto {
    private String texto;

    public void escrever(String novoTexto) {
        texto = novoTexto;
    }

    public String getTexto() {
        return texto;
    }

    // Salva o estado atual em um Memento
    public Memento salvar() {
        return new Memento(texto);
    }

    // Restaura o estado a partir de um Memento
    public void restaurar(Memento memento) {
        texto = memento.getEstado();
    }
}
