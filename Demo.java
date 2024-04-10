import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Demo
 */


public class Demo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,6,7,8);

    //     Stream<Integer> s1=nums.stream();
    //     Stream<Integer> s2=s1.filter(n->n%2==0);
    //     Stream<Integer> s3=s2.map(n-> n*2);
    //    int result= s3.reduce(0,(c,e)->c+e);
    //    System.out.println(result);

       int result1= nums.stream().filter(n->n%2==0).map(n-> n*2).reduce(0,(c,e)->c+e);
       System.out.println(result1);



        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);
        //     }
        // };
        // num.forEach(num);



        // nums.forEach(n -> System.out.println(n));

        // for(int n: nums)
        // {
        //     System.out.println(n);
        // }

        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }


        // System.out.println(nums);
        // int sum=0;

        // for(int n : nums)
        // {
        //     if(n%2==0)
        //     {
        //         n=n*2;
        //         sum=sum+n;
        //     }
       
        // }
        // System.out.println(sum);
        // System.out.println(nums);
        
    }

    
    


}