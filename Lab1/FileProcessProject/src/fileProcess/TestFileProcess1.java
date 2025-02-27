package fileProcess;

import java.util.*;
import java.io.*;


public class TestFileProcess1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("divide.in"));

        double x, y;
        while (inFile.hasNextLine()) {
            x = inFile.nextDouble();
            y = inFile.nextDouble();
            System.out.println("x=" + x + ", y=" + y +
                    ", Division is " + String.format("%.2f", x/y));
        }

        inFile.close();
    }
}
