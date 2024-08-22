package memento;

import java.util.ArrayList;
import java.util.List;

class Historico {
    private final List<Memento> mementos = new ArrayList<>();

    // Adiciona um Memento ao histórico
    public void adicionarMemento(Memento memento) {
        mementos.add(memento);
    }

    // Retorna o Memento salvo mais recentemente
    public Memento getUltimoMemento() {
        if (!mementos.isEmpty()) {
            return mementos.get(mementos.size() - 1);
        }
        return null;
    }
}

