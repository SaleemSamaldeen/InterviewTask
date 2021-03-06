package Utils;

import configs.ConfigHolder;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;


public class TestDataReader extends ConfigHolder {
    public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public static FileInputStream file;

    public static void getTestData(String testDataName) throws Exception {
        try {
            File myFile = new File(testDataPath + testDataName + ".xlsx");
            file = new FileInputStream(myFile);
            workbook = new XSSFWorkbook(file);
            worksheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            throw new Exception("Error in reading test data sheet");
        }
    }

    public static int getRowCount() throws Exception {
        try {
            return worksheet.getPhysicalNumberOfRows();
        } catch (Exception e) {
            throw new Exception("Error in reading test data sheet");
        }
    }

    public static int getColumnCount() throws Exception {
        try {
            XSSFRow row = worksheet.getRow(0);
            return row.getLastCellNum();
        } catch (Exception e) {
            throw new Exception("Error in reading test data sheet");
        }
    }

    public static String getCellData(int rowNum, int colNum) {
        return worksheet.getRow(rowNum).getCell(colNum).getStringCellValue();
    }

    @DataProvider(name = "GenericDataProvider")
    public static Object[][] getExcelData(Method m, ITestContext testContext) throws Exception {
        //ArrayList<String> test_groups = new ArrayList(Arrays.asList(((Test)m.getAnnotation(Test.class)).groups()));
        //intTestData(test_groups.get(0));
        String testSheet = ((Test) m.getAnnotation(Test.class)).testName();
        getTestData(testSheet);
        int rowCount = getRowCount();
        int colCount = getColumnCount();
        Object data[][] = new Object[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = getCellData(i, j);
                data[i - 1][j] = cellData;
            }
        }
        return data;
    }
}
