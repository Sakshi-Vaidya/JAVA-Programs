interface Pet
{
 void test();
}
 class Dog implements Pet
{
 public void test()
 { 
  System.out.println("Interface Method is Implemented");
 }
public static void main(String args[])
 {
  Dog p=new Dog();
  p.test();
 }
}
