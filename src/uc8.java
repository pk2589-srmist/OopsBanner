import java.util.*;

public class uc8 {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            " *** "
        });
        patternMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    "
        });
        patternMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    public static void printBanner(String word) {
        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null && row < pattern.length) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}