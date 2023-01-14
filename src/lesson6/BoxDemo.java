package lesson6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.depth = 10;
        mybox1.height = 20;
        mybox1.width = 15;

        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println(vol);

        mybox2.depth = 5;
        mybox2.height = 10;
        mybox2.width = 7;

        vol = mybox2.depth * mybox2.width * mybox2.height;
        System.out.println(vol);
    }
}
