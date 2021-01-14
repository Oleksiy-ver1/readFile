import java.io.IOException;
import java.util.Scanner;

public class OperatingMode {
    public static void choiceMode(String PATH1, String SAMPLE, String PATH2, String FINDSTRING, String REPLACEMENTSTRING) throws IOException {
        Scanner sc = new Scanner(System.in);/*используем класс Scanner*/
        System.out.println("Выбирите режим:");
        System.out.println("1.\tСчитать количество вхождений строки в текстовом файле.");
        System.out.println("2.\tДелать замену строки на другую в указанном файле.");
        System.out.println("Введите \"1\" или \"2\" :");

        if (sc.hasNextInt()) { /*смотрим в будущее*/
            int number = sc.nextInt();/*считывает из консоли и использует как Int*/
            if (number == 1) {
                CountEntry countEntry = new CountEntry();
                countEntry.parsFile(PATH1, SAMPLE);
            }
            if (number == 2) {
                ChengeString chengeString = new ChengeString();
                chengeString.parsFile(PATH2, FINDSTRING, REPLACEMENTSTRING);
            }
            if (number != 1 && number != 2) {
                System.out.println("Не верный ввод.");
                choiceMode(PATH1, SAMPLE, PATH2, FINDSTRING, REPLACEMENTSTRING);
            }


        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

    }
}
