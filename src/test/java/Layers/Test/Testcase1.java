package Layers.Test;

import Layers.BaseTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testcase1 extends BaseTest {

    public static void listAndSet() throws IOException {

        //File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(s, new File("tutorialpoint.png"));
        List<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add(" ");
        al.add("d");
        al.add("c");
        al.add(" ");
        Set<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add(" ");
        hs.add("d");
        hs.add("c");
        hs.add(" ");
        System.out.println("List output: " + al);
        System.out.println("Set output: " + hs);
    }

    static public void main(String[] params) throws IOException {
        listAndSet();
        System.out.println(Thread.currentThread().getId());
    }


}
