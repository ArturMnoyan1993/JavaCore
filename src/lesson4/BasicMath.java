package lesson4;

public class BasicMath {
    public static void main(String[] args) {
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println();

        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println(da);
        System.out.println(db);
        System.out.println(dc);
        System.out.println(dd);
        System.out.println(de);

        System.out.println();

        int aa = 1, ab = 2, ac = 3;
        aa += 5;
        ab *= 4;
        ac += aa * ab;
        ac %= 6;
        System.out.println(aa);
        System.out.println(ab);
        System.out.println(ac);

        System.out.println();

        int x = 1, y = 2, z, f;
        z = ++x;
        f = y++;
        System.out.println(z);
        System.out.println(f);
    }
}
