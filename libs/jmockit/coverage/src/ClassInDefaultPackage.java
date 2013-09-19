public class ClassInDefaultPackage
{
   public static final int CONSTANT = 123;
   
   public enum NestedEnum
   {
      First,
      Second()
      {
         @Override
         public String toString() { return "2nd"; }
      };

      static
      {
         System.out.println("test");
      }
   }

   public boolean doSomething(NestedEnum value)
   {
      switch (value) {
         case First:
            return true;

         case Second:
            break;
      }

      return value.ordinal() == CONSTANT;
   }
}