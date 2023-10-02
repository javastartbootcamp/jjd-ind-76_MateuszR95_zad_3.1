package pl.javastart.task;

public class Computer {

    String producer;
    String model;
    int year;
    double price;

    public Computer() {
    }

    public Computer(String producer, String model, int year, double price) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void printInfo() {

        System.out.println("Producent: " + producer + ", Model: " + model + ", Rok produkcji: " + year + ", Cena: " + price + "zł");
    }
}
