package Utils;

import com.opencsv.bean.MappingStrategy;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.testng.Assert;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CSVUtils {

    public static void writeToCSVFile(String path, List list, boolean withQuotes, MappingStrategy mappingStrategy) {
        Path dir = Paths.get(path).getParent();
        String fileName = path.substring(path.lastIndexOf("//"));
        if (Files.notExists(dir)) {
            System.out.println("Target file will be created");
            try {
                Files.createFile(Files.createDirectories(dir)).toFile();
            } catch (Exception e) {
                Assert.fail("Failed to create file in specified path: " + path);
            }
        }
        writeListToCSVFile(path, list, true, null);
    }

    public static void writeListToCSVFile(String path, List list, boolean withQuotes, MappingStrategy mappingStrategy) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            StatefulBeanToCsvBuilder sbc = new StatefulBeanToCsvBuilder(writer);
            if (mappingStrategy != null) {
                sbc.withMappingStrategy(mappingStrategy);
            }
            sbc.withSeparator(';');
            sbc.withApplyQuotesToAll(withQuotes);
            sbc.build().write(list);
        } catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }
    }


}
