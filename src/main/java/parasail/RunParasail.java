package parasail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RunParasail {

    public static int open;
    public static int gap;
    public static Matrix matrix;
    public static Profile profileSW = null;

    public static ArrayList<Sequence> parse_file(String filename) {
        ArrayList<Sequence> sequences = new ArrayList<Sequence>();
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                String[] str = line.split(",");
                sequences.add(new Sequence(str[0], str[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sequences;
    }

    public static int run(String query, String ref) {
        Result result = Aligner.sw(query, ref, 12, 2, Matrix.blosum50);
        return result.getScore();
    }

    public static int runSW(String query, String ref, int open, int gap, Matrix matrix) {
        Result result = Aligner.sw_striped_sat(query, ref, open, gap, matrix);
//        Aligner.sw_striped_profile_sat()
        return result.getScore();
    }

    public static int runSW_striped_sat(String query, String ref, int open, int gap, Matrix matrix) {
//        Result result = Aligner.sw_striped_sat(query, ref, open, gap, matrix);
        Result result = Aligner.sw_stats_striped_sat(query, ref, open, gap, matrix);
//        Aligner.sw_striped_profile_sat()
//        printResult(result);
        return result.getScore();
    }

    public static void printResult(Result result) {
        System.out.println();
        System.out.println("**************");
        System.out.println("CMemOwn :" + result.CMemOwn);
        System.out.println("getEndQuery :" + result.getEndQuery());
        System.out.println("getEndRef:" + result.getEndRef());
        System.out.println("getLength:" + result.getLength());
        System.out.println("getMatches :" + result.getMatches());
        System.out.println("getSaturated :" + result.getSaturated());
        System.out.println("getScore :" + result.getScore());
        System.out.println("getSimilar:" + result.getSimilar());
        System.out.println("getCPtr:" + Result.getCPtr(result));
        System.out.println(" :" + result);
        System.out.println("**************");
    }

    public static Result runSW_striped_profile_sat(Profile profile, String ref, int open, int gap) {
        //        Result result = Aligner.sw_striped_profile_sat(query, ref, open, gap, matrix);
//        Profile profile = Profile.create_8(query, Matrix.blosum45);
        Result result = Aligner.sw_striped_profile_sat(profileSW, ref, open, gap);
        return result;
    }

    public static Profile createProfile(String query, String matrix) throws Exception {
//        Matrix matrix1 = Matrix.lookup(matrix);
        Matrix matrix1 = null;
        if (matrix.equalsIgnoreCase("BLOSUM50")) {
            matrix1 = Matrix.blosum50;
        } else if (matrix.equalsIgnoreCase("BLOSUM60")) {
            matrix1 = Matrix.blosum60;
        } else if (matrix.equalsIgnoreCase("BLOSUM62")) {
            matrix1 = Matrix.blosum62;
        } else {
            throw new Exception("scoreMatrix error:" + matrix);
        }
        profileSW = Aligner.profile_create_sat(query, matrix1);
        return profileSW;
    }

//    def createProfile(query: String, matrix: Matrix): Profile = {
//        new Profile(JNIparasail.profile_create_sat(query, Matrix.getCPtr(matrix)), true)
//    }

    public static Result runNW(String query, String ref, int open, int gap, Matrix matrix) {
        Result result = Aligner.nw(query, ref, open, gap, matrix);
        return result;
    }

    public static Result runSG(String query, String ref, int open, int gap, Matrix matrix) {
        Result result = Aligner.sg(query, ref, open, gap, matrix);
        return result;
    }

    public static Result runSW2(String query, String ref, int open, int gap, Matrix matrix) {
        Result result = Aligner.sw(query, ref, open, gap, matrix);
        return result;
    }

    public static class Sequence {
        private String name;
        private String data;

        public Sequence(String name, String data) {
            this.name = name;
            this.data = data;
        }

        public String getName() {
            return name;
        }

        public String getData() {
            return data;
        }
    }

}

