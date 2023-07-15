public class OverloadingTest1
{
void addition(int a, int b)
{
int sum=a+b;
System.out.println("Sum of two numbers is" +sum);
}
   void addition(double a,double b)
{
double sum=a+b;
System.out.println("Sun of two numbers is" +sum);
}
public static void main(String ards[])
{
OverloadingTest1 ovl=new OverloadingTest1();
ovl.addition(5,10)
ovl.addition(1.5,8.5);
}
}
