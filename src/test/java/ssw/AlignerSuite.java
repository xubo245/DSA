package ssw;

import org.junit.Test;

/**
 * Created by xubo on 2016/11/26.
 */
public class AlignerSuite {
    public static int[][] blosum50V2() {
        int[][] a = {
                {5, -2, -1, -2, -1, -1, -1, 0, -2, -1, -2, -1, -1, -3, -1, 1, 0, -3, -2, 0, -2, -2, -1, -1, -5},
                {-2, 7, -1, -2, -4, 1, 0, -3, 0, -4, -3, 3, -2, -3, -3, -1, -1, -3, -1, -3, -1, -3, 0, -1, -5},
                {-1, -1, 7, 2, -2, 0, 0, 0, 1, -3, -4, 0, -2, -4, -2, 1, 0, -4, -2, -3, 5, -4, 0, -1, -5},
                {-2, -2, 2, 8, -4, 0, 2, -1, -1, -4, -4, -1, -4, -5, -1, 0, -1, -5, -3, -4, 6, -4, 1, -1, -5},
                {-1, -4, -2, -4, 13, -3, -3, -3, -3, -2, -2, -3, -2, -2, -4, -1, -1, -5, -3, -1, -3, -2, -3, -1, -5},
                {-1, 1, 0, 0, -3, 7, 2, -2, 1, -3, -2, 2, 0, -4, -1, 0, -1, -1, -1, -3, 0, -3, 4, -1, -5},
                {-1, 0, 0, 2, -3, 2, 6, -3, 0, -4, -3, 1, -2, -3, -1, -1, -1, -3, -2, -3, 1, -3, 5, -1, -5},
                {0, -3, 0, -1, -3, -2, -3, 8, -2, -4, -4, -2, -3, -4, -2, 0, -2, -3, -3, -4, -1, -4, -2, -1, -5},
                {-2, 0, 1, -1, -3, 1, 0, -2, 10, -4, -3, 0, -1, -1, -2, -1, -2, -3, 2, -4, 0, -3, 0, -1, -5},
                {-1, -4, -3, -4, -2, -3, -4, -4, -4, 5, 2, -3, 2, 0, -3, -3, -1, -3, -1, 4, -4, 4, -3, -1, -5},
                {-2, -3, -4, -4, -2, -2, -3, -4, -3, 2, 5, -3, 3, 1, -4, -3, -1, -2, -1, 1, -4, 4, -3, -1, -5},
                {-1, 3, 0, -1, -3, 2, 1, -2, 0, -3, -3, 6, -2, -4, -1, 0, -1, -3, -2, -3, 0, -3, 1, -1, -5},
                {-1, -2, -2, -4, -2, 0, -2, -3, -1, 2, 3, -2, 7, 0, -3, -2, -1, -1, 0, 1, -3, 2, -1, -1, -5},
                {-3, -3, -4, -5, -2, -4, -3, -4, -1, 0, 1, -4, 0, 8, -4, -3, -2, 1, 4, -1, -4, 1, -4, -1, -5},
                {-1, -3, -2, -1, -4, -1, -1, -2, -2, -3, -4, -1, -3, -4, 10, -1, -1, -4, -3, -3, -2, -3, -1, -1, -5},
                {1, -1, 1, 0, -1, 0, -1, 0, -1, -3, -3, 0, -2, -3, -1, 5, 2, -4, -2, -2, 0, -3, 0, -1, -5},
                {0, -1, 0, -1, -1, -1, -1, -2, -2, -1, -1, -1, -1, -2, -1, 2, 5, -3, -2, 0, 0, -1, -1, -1, -5},
                {-3, -3, -4, -5, -5, -1, -3, -3, -3, -3, -2, -3, -1, 1, -4, -4, -3, 15, 2, -3, -5, -2, -2, -1, -5},
                {-2, -1, -2, -3, -3, -1, -2, -3, 2, -1, -1, -2, 0, 4, -3, -2, -2, 2, 8, -1, -3, -1, -2, -1, -5},
                {0, -3, -3, -4, -1, -3, -3, -4, -4, 4, 1, -3, 1, -1, -3, -2, 0, -3, -1, 5, -3, 2, -3, -1, -5},
                {-2, -1, 5, 6, -3, 0, 1, -1, 0, -4, -4, 0, -3, -4, -2, 0, 0, -5, -3, -3, 6, -4, 1, -1, -5},
                {-2, -3, -4, -4, -2, -3, -3, -4, -3, 4, 4, -3, 2, 1, -3, -3, -1, -2, -1, 2, -4, 4, -3, -1, -5},
                {-1, 0, 0, 1, -3, 4, 5, -2, 0, -3, -3, 1, -1, -4, -1, 0, -1, -2, -2, -3, 1, -3, 5, -1, -5},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -5},
                {-5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, 1}
        };
        return a;
    }

    private static byte[] flatten(int[] lookup, int[][] matrix) {
        int size = lookup[256];
        byte[] flattened = new byte[size * size];
        for (int i = 0; i < matrix.length; i++) {
            int newi = lookup[i];
            if (newi == -1) continue;
            for (int j = 0; j < matrix[i].length; j++) {
                int newj = lookup[j];
                if (newj == -1) continue;
                int score = matrix[i][j];
                if (score < Byte.MIN_VALUE || score > Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Scoring matrix values must fit into signed 8-bit integer");
                }
                flattened[newi * size + newj] = (byte) score;
            }
        }
        return flattened;
    }

    private static byte[] convertToNumeric(int[] lookup, byte[] sequence, boolean ignoreCase) {
        byte[] numericSeq = new byte[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            int b = sequence[i];
            if (ignoreCase) {
                b = Character.toUpperCase(b);
            }
            if (lookup[b] == -1) {
                lookup[b] = lookup[256]++;
            }
            numericSeq[i] = (byte) lookup[b];
        }
        return numericSeq;
    }

    @Test
    public void test() {
        System.out.println("hello Junit");
    }

    @Test
    public void score() {
        for (int i = 0; i < 32; i++) {
            System.out.println(i + ":" + Math.pow(2, i));
        }

        byte a = 0;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }

    @Test
    public void QPTest() {

        int h = 128;
        int p = 8;
        int segLen = (h + p - 1) / p;
        System.out.println("segLen="+segLen);
        System.out.println("p="+p);
        int index = 0;
        for (int i = 1; i <= segLen; i++) {
            System.out.print(i + ":");
            for (int j = 1; j <= p; j++) {

                index++;
                int x = index / p+1;
                int y = (index-1) % p;
//                System.out.print(index+"|"+(x + y * segLen) + " ");
                System.out.print((x + y * segLen) + " ");
            }
            System.out.println();
        }
        System.out.println( Math.pow(2,8));
        System.out.println( Math.pow(2,15));
    }

    @Test
    public void convertToNumericTest() {
        int[] lookup = new int[257]; // lookup[256] is used as sentinal for number of unique bases/matrix size
        java.util.Arrays.fill(lookup, -1);
        lookup[256] = 0;
        byte[] result = convertToNumeric(lookup, "AGCTAGGBC".getBytes(), true);
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + ":" + result[i]);
        }
        System.out.println("length:" + result.length);
        System.out.println("length/2:" + result.length / 2);
//        for (int i=0;i<lookup.length;i++){
//            System.out.println(i+"="+lookup[i]);
//        }

//        byte[] out=flatten(lookup,blosum50V2());
//
//        for (int i=0;i<out.length;i++){
//            System.out.println("out "+i+"="+out[i]);
//        }
    }

}
