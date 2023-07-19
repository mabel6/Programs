package student.Fulltime.BCA;
public class Studentinfo
{
int age;
char gender;
String name;
public Studentinfo(String a,int e,char f)
{
name=a;
age=e;
gender=f;
}
public void display()
{
System.out.println("STUDENT PERSONAL DETAILS");
System.out.println("Name of the student is:" +name);
System.out.println("Age=" +age);
System.out.println("Student is" +gender);
}
}
