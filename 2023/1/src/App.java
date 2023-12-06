import java.util.List;

/*  
 *  @author  KBrightCoder
 *  @
 */
public class App {
    public static void main(String[] args) throws Exception {

        FileReaderToList fileReader = new FileReaderToList("data.txt");
        List<String> lines = fileReader.readLines();
        DigitSearchAndSum digitSearchAndSum = new DigitSearchAndSum(lines);
        digitSearchAndSum.calculates();
        System.out.println(digitSearchAndSum.getSumResult());
    }
}
