public class Test
{
  public static void main(String[] args)
  {
    Employee mikkel = new Employee("Mikkel");

    System.out.println(mikkel.getRole());

    mikkel.copy().setRole("Whatever");

    System.out.println(mikkel);
  }
}
