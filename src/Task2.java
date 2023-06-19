import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
  Logger logger = Logger.getLogger(Task2.class.getName());

  public static void bubbleSort(int[] sortArr) throws IOException {

    FileHandler fh = new FileHandler("log.txt");

    for (int i = 0; i < sortArr.length - 1; i++) {
      for (int j = 0; j < sortArr.length - i - 1; j++) {
        if (sortArr[j + 1] < sortArr[j]) {
          int swap = sortArr[j];
          sortArr[j] = sortArr[j + 1];
          sortArr[j + 1] = swap;
          Logger logger = Logger.getLogger(Task2.class.getName());
          SimpleFormatter sFormat = new SimpleFormatter();
          fh.setFormatter(sFormat);
          logger.setLevel(Level.INFO);
          logger.info("Itteration when sorting");
          logger.addHandler(fh);

        }
      }
    }
  }

}
