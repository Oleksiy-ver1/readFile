import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountEntry {
    public void parsFile(String PATH, String SAMPLE) throws IOException {
        Path file1 = Path.of(PATH);
        int counter = 0;
        int countOfEntry = 0;
        int countAll = 0;
        int entry = 0;
        int i = 0;
        if (Validation.validationFile(PATH)) {
            List<String> list = Files.readAllLines(file1);

            for (String words : list) { /*сравниваем строки на содержание*/
                System.out.printf("%d строка, из %d элементов, первое вхождение %d: мест для поиска %d \n", counter,
                        words.length(), words.indexOf(SAMPLE, 0), words.length() - words.indexOf(SAMPLE, 0));
                counter++;
                countOfEntry = 0;
                if (words.indexOf(SAMPLE, 0) > -1) {
                    entry = words.indexOf(SAMPLE, 0);

                    while (words.length() - words.indexOf(SAMPLE, entry) + 1 > SAMPLE.length()) {
                        System.out.println("Условие начала цыкла " + (words.length() - words.indexOf(SAMPLE, entry)));

                        if (words.indexOf(SAMPLE, entry) > 0) {
                            countOfEntry++;
                        }
                        System.out.printf("вход %d: позиция %d: счетчик %d \n", entry, words.indexOf(SAMPLE, entry), countOfEntry);
                        entry = words.indexOf(SAMPLE, entry + 1);
                        if (entry < 0) {
                            break;
                        }
                    }
                }
                countAll = countAll + countOfEntry;

                System.out.printf("колличество вхождений с строку %d \n", countOfEntry);
                System.out.println();
            }
            System.out.println("count all " + countAll);
        }
    }
}
