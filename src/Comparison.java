/**
 * P 87 project#1: Comparison.java
 */
public class Comparison {

   public static void main(String[] args) {

   for (int i=0; i<=10; i++){
      int n = i*10;
      int y1 = 100 * n + 10;
      int y2 = 5 * n * n + 2;
      System.out.println("n = " +n);
      System.out.println("y1 = " +y1 + ", y2 = " +y2);
      if (y1 > y2)
         System.out.println("y1 > y2");
      else System.out.println("y2 > y1");
      System.out.println("");
   }
   }
}
// The result didn't surprise me. y1 growth rate is linear; y2 growth rate is quadratic. As n becomes larger, y2 grows faster than y1. Therefore, when n goes up, sooner or later y2 becomes larger than y1.