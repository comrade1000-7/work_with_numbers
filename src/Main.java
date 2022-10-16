import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        StreamMain streamMain = new StreamMain(intList);
        List<Integer> result = new ArrayList<>();
        for (int number :
                intList) {
            if (number % 2 == 0 && number > 0) {
                result.add(number);
            }
        }
        Collections.sort(result);
        System.out.println(result);
        streamMain.filterByStream(intList);
    }
}