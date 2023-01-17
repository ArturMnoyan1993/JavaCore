package lesson6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(8, 16, 12);
        double vol;

        vol = mybox1.vol();
        System.out.println(vol);
        vol = mybox2.vol();
        System.out.println(vol);
    }
}
