package fileProcess;

//Advantage: Data type of columns if not of the same type
//Retrieve input file divide.in and store into array of object
//Inconvenient:

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestFileProcess3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("divide.in"));

        //Create class template Divide to increase extensibility, reusability, etc.
        //including instance methods such as calDiv, callAdd, calSub
        Divide[] arrayInFile = new Divide[4];

        //Complete this storing input file divide.in
        //into array of object arrayInFile
        //Loading data input divide.in into of object arrayInFile
        int index = 0;
        double x, y;

        while (inFile.hasNextLine()) {
            x = inFile.nextDouble();
            y = inFile.nextDouble();

            arrayInFile[index] = new Divide();
            arrayInFile[index].setX(x);
            arrayInFile[index].setY(y);

            index++;
        }

        inFile.close();

        System.out.println("Printing content of array in file ");
        for (index = 0; index < arrayInFile.length; index++) {
            System.out.println(arrayInFile[index] +
                    "\n\tDivision is " + String.format("%.2f", arrayInFile[index].calDiv()) +
                    ", Addition is " + String.format("%.2f", arrayInFile[index].calAdd()) +
                    ", Subtraction is " + String.format("%.2f", arrayInFile[index].calSub()) +
                    ", Product is " + String.format("%.2f", arrayInFile[index].calMul()));
        }
    }
}
