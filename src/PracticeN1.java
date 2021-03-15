import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Practice1
 * @class PracticeN1
 * @since 15.03.2021 - 19.03
 */
public class PracticeN1 {


    public static void main(String[] args) throws IOException {


        String text = new String(Files.readAllBytes(Paths.get("G:/harry.txt")));

        String[] words = text.split(" ");

        String longest = "";

        for (String word : words) {

            if (longest.length() < word.length()) {
                longest = word;
            }

        }

        System.out.println("The longest word:" + longest);

        //The longest word:
        //"Thirteen-and-a-half

        String[] lines = text.split("\\n");

        int counterHarry = 0;


        for (int i = 0; i < lines.length; i++) {

            if (lines[i].contains("Harry")) {
                counterHarry++;
            }

        }

        System.out.println("Number of lines with Harry: " + counterHarry);
        //Number of lines with Harry: 1084

        text = text.replaceAll("[^A-Za-z ']", "");


        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

        for (int i = 0; i < 10; i++) {
            System.out.println(distincts[i]);
// First 10 distinct words
        }
//        Harry
//        Potter
//        and
//        the
//        Sorcerer's
//        Stone
//        CHAPTER
//        ONE
//        THE


        String wordWithC = "";

        for (int i = 0; i < distincts.length; i++) {

            if (words[i].startsWith("c") || words[i].startsWith("C")) {
                wordWithC = wordWithC + words[i] + " ";

            }
        }





        for (int i = 0; i < distincts.length; i++) {

            if (words[i].startsWith("C")) {
                wordWithC = wordWithC + words[i] + " ";

            }
        }

        String[] wordWithCARR = wordWithC.split(" ");

        System.out.println("Number of distinct words that start with C: " + wordWithCARR.length);

        //"Number of words that start with C: 350

        int[] hasArrDis = new int[distincts.length];
        for (int i = 0; i < distincts.length; i++) {
            hasArrDis[i] = distincts[i].hashCode();
        }

        Arrays.sort(hasArrDis);

        int hashCountDistinct = 0;

        for (int i = 0; i < hasArrDis.length - 1; i++) {
            if (hasArrDis[i] == hasArrDis[i + 1]) {
                hashCountDistinct++;
                System.out.println();
            }
        }
        System.out.println("Number of equal hashes in distinct words: " + hashCountDistinct);

        //Number of equal hashes in distinct words: 1

    }
}



