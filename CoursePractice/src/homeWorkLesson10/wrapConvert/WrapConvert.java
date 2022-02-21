package homeWorkLesson9.homeWorkLesson10.wrapConvert;
/*Create a program to convert the following String values to the appropriate primitive
        data types (by using Wrapper classes):
        "tRue" -> boolean
        "120" -> byte
        "32000" -> short
        "147895632" -> int
        "987654321987654321" -> long
        "4444.5d" -> double
        "2354.56f" -> float*/

public class WrapConvert {
    public static void main(String[] args) {
        Boolean booleanWrap = Boolean.valueOf("tRue");
        Byte byteWrap = Byte.valueOf("120");
        Short shortWrap = Short.valueOf("32000");
        Integer intWrap = Integer.valueOf("147895632");
        Long longWrap = Long.valueOf( "987654321987654321");
        Double doubleWrap = Double.valueOf("4444.5d");
        Float floatWrap = Float.valueOf("2354.56f");


        System.out.println(booleanWrap);
        System.out.println(byteWrap);
        System.out.println(shortWrap);
        System.out.println(intWrap);
        System.out.println(longWrap);
        System.out.println(doubleWrap);
        System.out.println(floatWrap);

    }


}
