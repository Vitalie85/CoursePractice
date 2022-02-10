package homeWorkLesson8;

/*Write a Java program to test if an array contains a specific value.*/

public class checkValue {
    public static void main(String[] args) {
        int requestedValue = 20;
        int[] arrayOne = new int []{1,4,7,20,-1,30};
        for (int i = 0; i < arrayOne.length; i++) {
            if(arrayOne[i] == requestedValue){
                System.out.println("Given value is present in array at the index: " + i);
               if(true)break;

            }
        }
    }
}

