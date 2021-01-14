import java.io.IOException;
public class Application {
    public static void main(String[] args) throws IOException {
        final String PATH1 = new String("e:\\IT\\Java\\readFile\\lab\\read_file.txt");
        final String SAMPLE = "hello";
        final String PATH2 = new String("e:\\IT\\Java\\readFile\\lab\\replacement_string.txt");
        final String FINDSTRING = "asdfg";
        final String REPLACEMENTSTRING = "!!!!!!!!!!!";
        OperatingMode.choiceMode(PATH1, SAMPLE, PATH2, FINDSTRING, REPLACEMENTSTRING);/*запускаем выбор режимов*/
    }
}
