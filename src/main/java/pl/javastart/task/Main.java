package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        computer1.producer = "Lenovo";
        computer1.model = "IdeaPad 3";
        computer1.year = 2021;
        computer1.price = 2990.9;

        computer2.producer = "Dell";
        computer2.model = "Latitude 3540";
        computer2.year = 2019;
        computer2.price = 2879.4;

        computer1.printInfo();
        computer2.printInfo();

    }
}
