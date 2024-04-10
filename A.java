public class A {
    public static void main(String[] args) {
        B obj =new C();
        obj.show();
    }
  
    }

class B {
    public void show(){
        System.out.println("in A show");
}

}
class C extends B{


}
