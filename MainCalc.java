public class MainCalc {
    public static void main(String args [])
    {
        Add obj= new Add();
        int r1= obj.sub(8,5);
        int r2=obj.mul(4,9);
        float r3=obj.div(40,7);
        int r4=obj.add(50, 20);

        System.out.println("Substraction is  "+r1);
        System.out.println("Multiplication is "+r2);
        System.out.println("Division is  "+r3);
        System.out.println("Addition is "+r4);
        

    }
}