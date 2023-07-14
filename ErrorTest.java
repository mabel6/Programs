import java.io.*;
class PayOutOfBounds extends Exception
  {
public void showError()
    {
System.out.println("Invalid Pay");
    }
  }
class ErrorTest
  {
public static void main(String args[]) throws Exception
    {
InputStringReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int m=0;
try
  {
System.out.println("nter Pay:");
m= Integer.parseInt(br.readLine());
if(m>10000)
throw new PayOutOfBounds();
System.out.println("Your Pay:" +m);
  }
catch(PayOutOfBounds e)
  {
e.showError();
  }
    }
  }
