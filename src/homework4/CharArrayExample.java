package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', ' ', 'a',  'v', 'a', 'l', 'o', ' ', 'v', ' ' , 'e'};
//        char c = 'o';
//        int count = 0;
//        for (char a : chars) {
//            if (a == c) {
//                count++;
//            }
//        }
//        System.out.println("count " + count);


//        if (chars[chars.length - 2] == 'l' && chars[chars.length - 1] == 'y') {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//       ավելի կարճ տարբերակը

//        boolean result = chars[chars.length - 2] == 'l'
//                && chars[chars.length - 1] == 'y';
//        System.out.println(result);

//        System.out.println(chars[chars.length / 2] + " "
//                + chars[chars.length / 2 - 1]);

        for (char a : chars) {
            if (a != ' ') {
                System.out.print(a);
            }
        }
    }
}
