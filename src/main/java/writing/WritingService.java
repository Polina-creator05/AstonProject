package writing;

import java.io.IOException;
import java.util.List;

public class WritingService {
    private static final int MAX_ATTEMPTS = 3;


    public void writeToLogFile(String filePath, List<String> data) {
        int attempts = 0;
        boolean success = false;

        while (attempts < MAX_ATTEMPTS && !success) {
            try {
                FileUtils.writeToFile(filePath, data);
                success = true;
            } catch (IOException e) {
                attempts++;
                System.out.println("Ошибка записи в файл: " + e.getMessage());
                if (attempts == MAX_ATTEMPTS) {
                    System.out.println("Превышено количество попыток записи. Логирование прекращено.");
                }
            }
        }
    }
}

