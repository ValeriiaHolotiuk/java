public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 3);  // length=5, width=3
        Rectangle rect2 = new Rectangle(7.5, 4); // length=7.5, width=4

        System.out.println("Rectangle 1 - Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
    }
}
