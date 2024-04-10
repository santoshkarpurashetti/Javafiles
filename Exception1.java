import java.lang.Exception;

public class Exception1 {
    
    public static void main(String[] args) {
        float i=4;
        float j=0;

        try{
            j=18/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");       
         }
        
        System.out.println(j);
        System.out.println("Bye");
    }
}
