class Binding
{
  public void eat()
  {
    System.out.println("breakfast");
  }
  public void drink()
  {
    System.out.println("coke");

  }
}
class Index1 extends Binding
{
  public void eat()
  {
    System.out.println("Lunch");
  }
  public void drink()
  {
    System.out.println("juice");
  }
  public static void main(String args[])
  {
    Index1 sb = new Index1();
    sb.eat();
    sb.drink();
    Binding b = new Index1();
     b.eat();
     b.drink();
  }
}