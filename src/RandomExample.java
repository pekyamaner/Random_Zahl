import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Zufallszahl zwischen 0 und 99
        int randomInt = random.nextInt(100); // Gibt eine Zahl von 0 bis 99 zurück
        System.out.println("Zufallszahl (0 bis 99): " + randomInt);

        // Zufallszahl zwischen 50 und 100 (einschließlich)
        int randomIntInRange = 50 + random.nextInt(51); // Gibt eine Zahl von 50 bis 100 zurück
        System.out.println("Zufallszahl (50 bis 100): " + randomIntInRange);

        // Zufallszahl als Fließkommazahl (0.0 bis 1.0)
        double randomDouble = random.nextDouble(); // Gibt eine Zahl zwischen 0.0 und 1.0 zurück
        System.out.println("Zufallszahl (0.0 bis 1.0): " + randomDouble);
    }
}
