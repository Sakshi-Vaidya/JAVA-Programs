interface Demo 
{
void display();
}
class Test 1 implements Demo
{
 public void display()
 {
  System.out.println("Display");
  }

class Test 2 extends Test1
{
 public void show()
 {
  System.out.println("show");
  }
public static void main(String args[])
{
 Test1t2=newTest1();
 t2.display();
 t2.show();
}
}
