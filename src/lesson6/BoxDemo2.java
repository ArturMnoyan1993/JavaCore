package lesson6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(5,10, 7);

        mybox1.depth = 10;
        mybox1.height = 20;
        mybox1.width = 15;

        mybox2.width = 5;
        mybox2.height = 10;
        mybox2.depth = 7;

        mybox1.volume();
        mybox2.volume();
    }
}
