package builder;

public class CarDiretor {
    private final CarBuilder builder;

    // O Diretor recebe um Builder
    public CarDiretor(CarBuilder builder) {
        this.builder = builder;
    }

    // Método para construir um Carro padrão
    public Car constructBasicCar() {
        return builder.setMarca("Toyota")
                .setModelo("Corolla")
                .setAno(2024)
                .setCor("White")
                .setEngine("Petrol")
                .build();
    }

    // Método para construir um Carro customizado
    public Car constructLuxuryCar() {
        return builder.setMarca("BMW")
                .setModelo("Series 5")
                .setAno(2024)
                .setCor("Black")
                .setEngine("Hybrid")
                .build();
    }
}
