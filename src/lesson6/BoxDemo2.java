package lesson6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

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
