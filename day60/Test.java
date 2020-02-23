package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {


        List<String> list = Files.readAllLines(Paths.get("src/day60/hero.txt"));

        System.out.println(list);

        String x= "Abs";
        x=x+"bca";
        System.out.println(x);



    }
}
