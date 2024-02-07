import java.util.Arrays;

public class Sprint1 {
    public static void main(String[] args) {
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }

//        long start = System.currentTimeMillis();
//        int counter = 0;
//        while (System.currentTimeMillis() - start < 1000) {
//            System.out.println(counter++);
//        }

//        int a = 1;
//        do {
//            System.out.println("Hello World");
//        } while(a++ < 3);

        int num = 1000;
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int[] temp = new int[a.length + 1];
        System.arraycopy(a, 0, temp, 0, a.length);
        a = temp;
        System.out.println(Arrays.toString(a));

        for (int value : a) {
            System.out.println(value);
        }

    }

}
