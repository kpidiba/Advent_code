import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        List<String> datas = new FileReaderToList("data.txt").readLines();
        BagGame game = new BagGame(datas);
        game.play();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");

    }
}
