import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Solution3 {

    private static final Scanner scan = new Scanner(System.in);
    private static final int INDEX_FILE_NAME = 6;
    private static final int INDEX_STATUS = 8;

    private static final String RESPONSE_SUCCESS = "200";

    public static void main(String[] args) {
        String filename;
        filename = scan.nextLine();
        File file = new File("/Users/user/Desktop/workspace/project1/Algorithm/src/" + filename);
        File outputFile = new File("/Users/user/Desktop/workspace/project1/Algorithm/src/" + "gifs_" + filename);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            BufferedReader br = new BufferedReader(fileReader);

            String input = "";
            ArrayList<String> result = new ArrayList<String>();

            while ((input = br.readLine()) != null) {
                String[] log = input.split(" ");

                if (!log[INDEX_STATUS].equals(RESPONSE_SUCCESS)) {
                    continue;
                }

                if (log[INDEX_FILE_NAME].contains(".gif")) {
                    continue;
                }

                String[] splitFileName = log[INDEX_FILE_NAME].split("/");
                String resultFileName = splitFileName[splitFileName.length - 1];

                if (result.indexOf(resultFileName) <= -1) {
                    result.add(resultFileName);
                }
            }

            for (String s : result) {
                bw.write(s);
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}