import java.util.*;
public class MoveZeroElementsToRight{
    public static void main(String args[]){
        List<Integer>numbers=List.of(1,0,-3,0,5,-2,0,8,0,-4)
        Stream.concat(numbers.stream().filter(n->n!=0),numbers.stream().filter(n->n==0)).collect(collecters.toList()); 
    }
}