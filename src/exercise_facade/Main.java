package exercise_facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListPrinter listPrinter = new ListPrinter();
        listPrinter.printList((new ListFilter()).filterOdd((new RandomList()).generateList(10,1,100)));
    }
}
