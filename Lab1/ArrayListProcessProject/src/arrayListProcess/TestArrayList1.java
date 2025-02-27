package arrayListProcess;

import java.util.ArrayList;
import java.util.List;

//Using ArrayList from Java Collection Framework Library
public class TestArrayList1 {

    public static void main(String[] args) {

        //List with Generic data type
        List<String> nameList = new ArrayList<>();
        String[] names = {"Ann", "Bob", "Carol"};

        int index;
        for(index = 0; index < names.length; index++) {
            nameList.add(names[index]);
        }

        //Print all elements of ArrayList nameList
        for (index = 0; index < nameList.size(); index++) {
            System.out.println(nameList.get(index));
        }


    }
}
