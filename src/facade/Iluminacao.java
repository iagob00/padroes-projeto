package facade;

public class Iluminacao {
    public void escurecer(int nivel) {
        System.out.println("Luzes do teatro escurecendo para " + nivel + "%.");
    }

    public void ligar() {
        System.out.println("Luzes do teatro estão LIGADAS.");
    }
}

