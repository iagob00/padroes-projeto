package facade;

public class Main {
    public static void main(String[] args) {
        // Criando os componentes individuais
        ReprodutorDvd dvd = new ReprodutorDvd();
        Projetor projetor = new Projetor();
        Amplificador amp = new Amplificador();
        Iluminacao luzes = new Iluminacao();

        // Criando a Facade para o Home Theater
        Facade homeTheater = new Facade(dvd, projetor, amp, luzes);

        // Usando a Facade para assistir a um filme
        homeTheater.assistirFilme("Matrix");

        // Usando a Facade para finalizar o filme
        homeTheater.finalizarFilme();
    }
}
