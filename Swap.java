public class Swap {
    public static void main(String[] args) {
        int a=4;
        int b=5;
       /*  int temp;

        temp=a;
        a=b;
        b=temp;*/

        a=a+b;
        b=a-b;
        a=a-b;
        
    
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    
}
