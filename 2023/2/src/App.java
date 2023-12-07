import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> datas = new FileReaderToList("data.txt").readLines();
        BagGame game  = new BagGame(datas);
        game.play();
    }
}
