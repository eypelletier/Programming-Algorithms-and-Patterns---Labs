package arrayListProcess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList2 {

    public static void main(String[] args) throws FileNotFoundException {

        //Read from divide.in and load it into ArrayList
        Scanner inFile = new Scanner(new FileReader("divide.in"));
        List<Divide> inFileArrayList = new ArrayList<>();

        //Complete this by reading from divide.in and load it into ArrayList
        //object inFileArrayList
        while (inFile.hasNextLine()) {
            //inFileArrayList.add(new Divide(inFile.nextDouble(), inFile.nextDouble()));
            Divide divObj = new Divide();
            divObj.setX(inFile.nextDouble());
            divObj.setY(inFile.nextDouble());
            inFileArrayList.add(divObj);

        }

        inFile.close();

        //Read from populated ArrayList object inFileArrayList
        //Print elements of ArrayList object inFileArrayList
        int index;
        for(index = 0; index < inFileArrayList.size(); index++) {
            System.out.println(inFileArrayList.get(index) +
                    "\n\tDivision is " + String.format("%.2f", inFileArrayList.get(index).calDiv()) +
                    ", Addition is " + String.format("%.2f", inFileArrayList.get(index).calAdd()) +
                    ", Subtraction is " + String.format("%.2f", inFileArrayList.get(index).calSub()) +
                    ", Product is " + String.format("%.2f", inFileArrayList.get(index).calMul()));
        }
    }
}
