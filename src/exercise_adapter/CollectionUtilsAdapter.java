package exercise_adapter;
import java.util.*;


public class CollectionUtilsAdapter implements CollectionOperations{


    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> numberList = new ArrayList<>(numbers);
        return Collections.max(numberList);
    }

    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(10,5,8,20,3);
        CollectionOperations operations = new CollectionUtilsAdapter();
        Client client = new Client(operations);
        client.printMaxValue(numbers);
    }
}
