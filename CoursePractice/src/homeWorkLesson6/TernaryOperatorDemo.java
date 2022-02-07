package homeWorkLesson6;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int colorCode = 101;
        String color = null;
        color = (colorCode == 100 ? "Yellow" : colorCode == 101 ? "Green" : colorCode == 102 ? "Red" : "iNVALID");
        System.out.println("Color ---&gt;"+color);
    }
}



