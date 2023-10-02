package pl.javastart.task;

public class Computer {

    String producer;
    String model;
    int year;
    double price;

    public Computer() {
    }

    void printInfo() {

        System.out.println("Producent: " + producer + ", Model: " + model + ", Rok produkcji: " + year + ", Cena: " + price + "zł");
    }
}
