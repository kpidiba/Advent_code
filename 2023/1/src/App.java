import java.util.List;

/*  
 *  @author  KBrightCoder
 *  @
 */
public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        FileReaderToList fileReader = new FileReaderToList("data.txt");
        List<String> lines = fileReader.readLines();
        DigitSearchAndSum digitSearchAndSum = new DigitSearchAndSum(lines);
        digitSearchAndSum.calculates();
        System.out.println(digitSearchAndSum.getSumResult());
        long endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime) + " ms");

    }
}
