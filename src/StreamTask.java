import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrayl = new ArrayList<>();
        arrayl.addAll(Arrays.asList(4,-6,3,8,0,4,3));
        System.out.println(appendPosSum(arrayl));

    }
    static List<Integer> appendPosSum (ArrayList<Integer> arr){
        List<Integer> nums = arr.stream().filter(t->t>0).collect(Collectors.toList());
        nums.add(nums.stream().reduce(0 ,(x,y)->(x+y)));
        return nums;



   }
}
