package builder;

public class Main {
    public static void main(String[] args) {
        // Criando um ConcreteCarBuilder
        CarBuilder builder = new CarConcretoBuilder();

        // Criando um Diretor
        CarDiretor director = new CarDiretor(builder);

        // Construindo carros usando o Diretor
        Car basicCar = director.constructBasicCar();
        Car luxuryCar = director.constructLuxuryCar();

        // Exibindo os carros construídos
        System.out.println(basicCar);
        System.out.println(luxuryCar);
    }
}
