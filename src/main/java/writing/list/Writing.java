package writing.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Writing<T> {

    WritingService writingService= new WritingService();

    public void writeToFile(T[] array) {

        List<String> list = Arrays.stream(array)
                .map(s -> s.toString())
                .collect(Collectors.toList());
        writingService.writeToLogFile(list);
    }
}



