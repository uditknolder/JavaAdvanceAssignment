
/*The code above is not written correctly because non-static
 reference cannot be referenced from a static context ,
  static inner classes can only access static members of the any outer class.
 */


class A
{
    static String s = "AAA";

    static void methodA()
    {
        System.out.println(s);
    }

    static class B
    {
        void methodB()
        {
            methodA();
        }
    }
}
