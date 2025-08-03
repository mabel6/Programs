import java.util.Calendar;
public class CalDemo {
  public static void main(String args[]) {
    Calendar calendar=Calendar.getInstance();
    String[] month=new String[] {"January","Februar","March","April","May","June","July","August","September","October","November","December"};
    System.out.println("Current Month = " + month[calendar.get(Calendar.MONTH)]);
  }
}
