import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Validation {
    public static boolean validationFile(String PATH) throws IOException {
        Path file1 = Path.of(PATH);
        if (Files.exists(file1)) {
            List<String> list = Files.readAllLines(file1);
            if (list.size() > 0) {
                return true;
            } else {
                System.out.println("файл пустой");
                return false;
            }
        } else {
            System.out.printf("файла %s не существует", PATH);
            return false;
        }
    }
}

