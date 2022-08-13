
package bubblesortejemplo;

import java.util.*;

public class BubbleSortAlgo {
   
    public static void main(String[] args) {
       
      Integer a;
      Integer b;
      Integer c;
      Integer d;

      ArrayList<Integer> e = new ArrayList<>();

      e.add(50);
      e.add(2);
      e.add(3);
      e.add(4);
      e.add(5);
      e.add(1);
      e.add(2);

      for (int i = 0; i < e.size(); i++) {

         for (int j = 0; j < e.size() - i - 1; j++) {

            a = e.get(j);
            b = e.get(j + 1);

            c = e.get(j);
            d = e.get(j + 1);

            if (a.compareTo(b) > 0) {

               int temp = d;
               e.set(j + 1, c);
               e.set(j, temp);

            }
         }

      }
      
      for (int i = 0; i < e.size(); i++)
{
     System.out.println(e.get(i));
}
   
   }
}
