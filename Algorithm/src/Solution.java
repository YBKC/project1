import java.util.*;

public class Solution {

    private static final int LIMIT_INPUT_NUMBER = 1000001;

    public static void customSort(List<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>(arr.subList(1, arr.size()));

        int[] frequencyOfNumber = new int[LIMIT_INPUT_NUMBER];
        for (int index = 0; index < result.size(); index++) {
            frequencyOfNumber[result.get(index)]++;
        }

        Collections.sort(result, (Integer number1, Integer number2) -> {
            if (frequencyOfNumber[number1] < frequencyOfNumber[number2]) {
                return -1;
            } else if (frequencyOfNumber[number1] > frequencyOfNumber[number2]) {
                return 1;
            }

            if (number1 < number2) {
                return -1;
            } else if (number1 > number2) {
                return 1;
            }
            return 0;
        });

        System.out.println(result);
    }

    public static void main(String[] args) {
        customSort(Arrays.asList(5, 3, 1, 2, 2, 4));
    }
}
