package homeWorkLesson6;

public class PorridgeTemperature {
    public static void main(String[] args) {
        int maxTemp = 40;
        int minTemp = 30;
        int temperature = 29;
        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
           System.out.println("Porridge is too cold.");
        } else {
            System.out.println("Porridge is just right.");
        }

    }
}
