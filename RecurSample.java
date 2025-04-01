public class RecurSample
{
   public static void samp1(int x)
   {
      if(x == 1)
         System.out.println (x);
      else
      {
         System.out.println(x);
         samp1(x-1);
      }
   }
   
   public static void samp2(int x)
   {
      if(x == 1)
         System.out.println (x);
      else
      {
         samp2(x-1);
         System.out.println(x);
      }      
   }
   
   public static int samp3(int x)
   {
      if(x == 0)
         return 0;
      else
         return x + samp3(x-1);
   }
}

   