package builder;

public interface CarBuilder {
    CarBuilder setMarca(String marca);
    CarBuilder setModelo(String modelo);
    CarBuilder setAno(int ano);
    CarBuilder setCor(String cor);
    CarBuilder setEngine(String engine);
    Car build();
}
