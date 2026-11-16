import java.util.*;
import java.io.*;

public static Map<String, Long> getSalesMap(Reader reader) {
    Map<String, Long> result = new HashMap<>();
    try {
        BufferedReader obj = new BufferedReader(reader);
        String line = obj.readLine();
        while (line != null) {
            int spacePos = line.indexOf(' ');
            String name = line.substring(0, spacePos);
            String sumStr = line.substring(spacePos + 1);
            long sum = Long.parseLong(sumStr);
            result.merge(name, sum, Long::sum);
            line = obj.readLine();
        }
    } catch (IOException | NumberFormatException e) {
        System.out.println("Ошибка ввода ");
        e.printStackTrace();

    }

    return result;
}



void main() {

}