 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Collections;

 // agar import java.util.*; ye saari file include kr dega jisse time compleexity badh jati h.
 public class arraylist {
         // inka size define nhi hota array ka defined hota h or memkory location non-continous.
         // There are various process in this.
         public static void main(String[] args) {
             ArrayList<Integer> list = new ArrayList<Integer>();
             //ArrayList<String> list2 = new ArrayList<String>();
             // Add elements.
             list.add(0);
             list.add(2);
             list.add(3);
             System.out.println(list);

             // get elements.
             int element = list.get(0);
             System.out.println(element);
             // add element in between.
             list.add(1,1);
             System.out.println(list);

             // set element.
             list.set(0,5);
             System.out.println(list);
             // delete element.
             list.remove(3);
             System.out.println(list);
             // size .
            int size = list.size();
             System.out.println(size);
             // loops.
             for(int i=0;i<list.size();i++){
                 System.out.print(list.get(i));
             }
             System.out.println();
             // sorting
             Collections.sort(list);
             System.out.println(list);
         }
     }
