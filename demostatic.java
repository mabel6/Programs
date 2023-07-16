class Staticvar
  {
    public static int a,b;
    public void display()
    {
      System.out.println("A value ="+a+" B value="+b);
    }
  }
class Demo
  {
    public static void main(String args[])
    {
      Staticvar sv=new Staticvar();
      sv.a=10;
      sv.b=20;
      sv.display();
      Staticvar svl=new Staticvar();
      sv.display();
    }
  }
