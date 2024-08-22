package builder;

public class CarConcretoBuilder implements CarBuilder {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String engine;

    @Override
    public CarBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public CarBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public CarBuilder setAno(int ano) {
        this.ano = ano;
        return this;
    }

    @Override
    public CarBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Car build() {
        return new Car(marca, modelo, ano, cor, engine);
    }
}
