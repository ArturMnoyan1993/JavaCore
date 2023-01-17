package lesson6;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(8,16, 12);
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 8;
        mybox2.height = 16;
        mybox2.depth = 12;

        vol = mybox1.vol();
        System.out.println(vol);
        vol = mybox2.vol();
        System.out.println(vol);
    }
}