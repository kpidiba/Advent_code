import java.util.Arrays;
import java.util.List;

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
        System.out.println("id: "+id);
        if (gameIsValid(text)) {
            System.out.println("---VALID ID: ----"+id);
            result += id;
        }
        id++;
    }

    boolean gameIsValid(String value) {
        List<String> datas = List.of(value.replaceAll("Game \\d+: ", ""));
        // System.out.println(Arrays.toString(datas.toArray()));
        return datas.stream().allMatch(this::checkCounts);
    }

    public boolean checkCounts(String substring) {
        // Initialize counts for each color


        // Split the substring into individual color-count pairs
        String[] colorCounts = substring.split("; ");
        // String[] colorsCounts = List.of(colorCounts.)

        // Iterate over each color-count pair
        for (String pair : colorCounts) {
            String[] parts = pair.split(", ");
            for (String a : parts) {
                String[] splits = a.split(" ");
                int count = Integer.parseInt(splits[0]);
                String color = splits[1];
                // Update counts based on the color
                if(count >  Color.valueOf(color.toUpperCase()).getLimit())
                    return false;
                
            }
        }

        return true;
    }

}
