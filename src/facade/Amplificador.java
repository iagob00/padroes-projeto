package facade;

public class Amplificador {
    public void ligar() {
        System.out.println("Amplificador está LIGADO.");
    }

    public void ajustarVolume(int nivel) {
        System.out.println("Volume do amplificador ajustado para " + nivel);
    }

    public void desligar() {
        System.out.println("Amplificador está DESLIGADO.");
    }
}

