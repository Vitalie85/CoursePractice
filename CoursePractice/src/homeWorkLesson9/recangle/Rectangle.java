package homeWorkLesson9.recangle;

public  class Rectangle {
    int length;
    int width;
    int area;

    public void setDim(int length, int width) {
        area = length * width;
    }
    public String getArea() {
        return "Area of rectangle with width  "+width+" and length " +length+ " is " + area;
    }
}
