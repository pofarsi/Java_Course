package lecture05.cw5.Wall;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(6, 3);
        System.out.println("width 6 * height 3 --> area= " + wall.getArea());
        wall.setHeight(3);
        wall.setWidth(9);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
