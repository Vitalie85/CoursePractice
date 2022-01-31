package HelloJavaWorld.packageOne;

public class One {
    String methodName = "Method name is: showMessage().";

    public static void main(String[] args) {
        One one = new One();
        one.showMessage();

        one.setName("Class name is: One");

    }

    public void showMessage() {
        System.out.println(methodName);
    }

    public void setName(String className) {
        System.out.println(className);
    }

}
