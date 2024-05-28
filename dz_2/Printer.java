import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;//
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }

            }
            logIteration(arr);
        }
    }

    private static void logIteration(int[] arr) {
        try {
            if (log == null) {
                log = new File("log.txt");
                if (!log.exists()) {
                    log.createNewFile();
                }
                fileWriter = new FileWriter(log, true);
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = dateFormat.format(new Date());
            fileWriter.write(currentTime + " " + Arrays.toString(arr) + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[] { 9, 4, 8, 3, 1 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}