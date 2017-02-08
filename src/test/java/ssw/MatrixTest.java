package ssw;

import org.junit.Assert;
import parasail.Matrix;
import scala.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * verify the scoreMatrix  SparkSW Vs DSW
 * Created by xubo on 2016/12/6.
 *
 */
public class MatrixTest {
    public static void main(String[] args) {
        int[][] sswMatrix = SSW.scoreMatrix;

        int[][] sparkSWMatrix = new int[26][26];
        String fileName = "file\\input\\subMatrix\\hash50.csv";
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
//            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                String[] str = tempString.split(",");
                for (int i = 0; i < str.length; i++) {
                    sparkSWMatrix[line - 1][i] = Integer.valueOf(str[i]);
                }
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

        System.out.println("ssw");
//        System.out.println(Integer.valueOf('M'-64));
        for (int i = 65; i < 91; i++) {
            System.out.print("line " + (i - 64) + ":");
            for (int j = 65; j < 91; j++) {
                System.out.print(sswMatrix[i][j] + ",");
//                assert(sswMatrix[i][j]==sparkSWMatrix[i-65][j-65]);
//                assert(false);

//                System.out.println();
                try {
                    Assert.assertEquals(sswMatrix[i][j], sparkSWMatrix[i - 65][j - 65]);
                } catch (AssertionError e) {
                    System.out.println();
                    char m = (char) i;
                    char n = (char) j;
                    System.out.println(m + ":" + n);
                    e.printStackTrace();
                    return ;
                }


            }
            System.out.println();
        }

    }
}

/**
 * 不从0，0开始，而是1
 * (13,1) =》(M,A)  1应为1
 * O:Y  0应为-5
 * T:U  expected:<-5> but was:<1>
 * U:A expected:<-5> but was:<-2>
 * U:21行整个都不对
 * Y:25行整行都不对
 */