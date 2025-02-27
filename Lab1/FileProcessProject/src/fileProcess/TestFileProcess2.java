package fileProcess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class TestFileProcess2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("divide.in"));

        double [] x = new double [4];
        double [] y = new double [4];
        int index = 0;

        while (inFile.hasNextLine()) {
            x[index] = inFile.nextDouble();
            y[index] = inFile.nextDouble();
            index++;
        }

        inFile.close();

        for (index = 0; index < x.length; index++) {
            System.out.println("x=" + x[index] + ", y=" + y[index] +
                    ", Division is " +
                    String.format("%.2f", x[index] / y[index]));
        }
    }
}
