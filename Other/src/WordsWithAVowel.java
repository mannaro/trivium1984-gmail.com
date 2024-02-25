import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Найти в файле и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class WordsWithAVowel {

  public static final String VOLWES = "аоуеиыэяюё";

  public static void main(String[] args) throws IOException {
    Path path = Path.of("resources", "test.txt");
    try (Scanner scanner = new Scanner(path)) {
      while (scanner.hasNext()) {
        String word = scanner.next();
        char firstSymbol = word.charAt(0);
        if (VOLWES.indexOf(firstSymbol) != -1) {
          System.out.println(word);
        }
      }
    }
  }
}
