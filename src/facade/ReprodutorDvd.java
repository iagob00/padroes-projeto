package facade;

public class ReprodutorDvd {
    public void ligar() {
        System.out.println("Reprodutor de DVD está LIGADO.");
    }

    public void reproduzir(String filme) {
        System.out.println("Reproduzindo filme: " + filme);
    }

    public void desligar() {
        System.out.println("Reprodutor de DVD está DESLIGADO.");
    }
}
