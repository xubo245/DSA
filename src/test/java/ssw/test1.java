package ssw;

/**
 * Created by xubo on 2016/11/26.
 */
public class test1 {
    public static void main(String[] args) {
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);

        int lookup = 0;
        int[] lookupa = new int[10];
        for (int i = 0; i < 10; i++) {

            lookupa[i] = lookup++;
            System.out.println( lookupa[i] +":"+lookup);
        }

        System.out.println(lookup);
    }
}
