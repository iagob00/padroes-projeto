package facade;

public class Facade {
    private ReprodutorDvd dvd;
    private Projetor projetor;
    private Amplificador amp;
    private Iluminacao luzes;

    // Construtor da Facade que recebe os componentes
    public Facade(ReprodutorDvd dvd, Projetor projetor, Amplificador amp, Iluminacao luzes) {
        this.dvd = dvd;
        this.projetor = projetor;
        this.amp = amp;
        this.luzes = luzes;
    }

    // Método simplificado para assistir a um filme
    public void assistirFilme(String filme) {
        System.out.println("Prepare-se para assistir a um filme...");

        luzes.escurecer(10);
        projetor.ligar();
        projetor.modoTelaLarga();
        amp.ligar();
        amp.ajustarVolume(5);
        dvd.ligar();
        dvd.reproduzir(filme);
    }

    // Método simplificado para finalizar o filme
    public void finalizarFilme() {
        System.out.println("Desligando o home theater...");

        dvd.desligar();
        amp.desligar();
        projetor.desligar();
        luzes.ligar();
    }
}
