import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BagGame {
    private List<String> datas;
    private int result;
    private static int id = 1;

    public BagGame(List<String> datas) {
        this.datas = datas;
    }

    void play() {
        datas.forEach(this::gameReadLine);
        System.out.println(result);
    }

    void gameReadLine(String text) {
        System.out.println("id: " + id);
        if (gameIsValid(text)) {
            System.out.println("---VALID ID: ----" + id);
            result += id;
        }
        id++;
    }

    boolean gameIsValid(String value) {
        List<String> datas = Arrays.stream(value.replaceAll("Game \\d+: ", "")
                .split("; "))
                .flatMap(pair -> Arrays.stream(pair.split(", ")))
                .collect(Collectors.toList());
        return datas.stream().allMatch(this::checkCounts);
    }

    public boolean checkCounts(String pair) {

        // Iterate over each color-count pair
        List<String> parts = Arrays.stream(pair.split(", "))
                .flatMap(value -> Arrays.stream(value.split(" ")))
                .collect(Collectors.toList());
        int count = Integer.parseInt(parts.get(0));
        String color = parts.get(1);
        // Update counts based on the color
        if (count > Color.valueOf(color.toUpperCase()).getLimit())
            return false;
        return true;

    }

}
