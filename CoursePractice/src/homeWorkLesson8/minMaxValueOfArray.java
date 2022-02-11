package homeWorkLesson8;

/*Write a Java program to find the maximum and minimum value of an array.*/

public class minMaxValueOfArray {
    public static void main(String[] args) {
        int maxVal = 0;
        int minVal = 0;
        int[] arrayOne = new int []{1,4,7,20,-1,30};
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[0] <= arrayOne[i]) {
                maxVal = arrayOne[i];
            }
            if(arrayOne[0] >= arrayOne[i]){
                minVal = arrayOne[i];
            }
        }
        System.out.println("Maximum value is: "+maxVal+'\n'+ "Minimum value is: "+minVal);
    }
}


