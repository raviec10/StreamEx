import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        // Both the above methods will give same result
        System.out.println(list);

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        for(int n : list){
            System.out.println(n);
        }

        list.forEach(n -> System.out.println(n));

        //Thrice above methods will give same results. Last one is method defined wih ArrayList that is forEach()
        // The -> symbol is called as Lambda Expression

        list.stream()
                .sorted()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        //If we want to print sorted even numbers we can use above method but forEach doesn't work with reduce

        int add = list.stream()
                .sorted()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0,(a,b)->a+b);

        System.out.println(add);

        //So to achieve below implementation we just assign add to the methods earlier and print with separate print
        // method. Though we don't require sorted() here to achieve below implementation

        int sum =0;
        for(int n : list){
            if(n%2==0){
                n = n*2;
                sum = sum + n;
            }
        }
        System.out.println(sum);
    }
}