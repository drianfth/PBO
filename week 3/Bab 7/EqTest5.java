public class EqTest5
{
    public static void main(String args[])
    {
        String s = new String("Java");
        String s2 = new String("java");

        if(s.equalsIgnoreCase(s2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }

    }

}