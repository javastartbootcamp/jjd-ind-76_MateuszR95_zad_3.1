package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Lenovo", "IdeaPad 3", 2021, 2990.9);
        Computer computer2 = new Computer("Dell", "Latitude 3540", 2019, 2879.4);

        computer1.printInfo();
        computer2.printInfo();

    }
}
