/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author Jagadheesan Balu
 */
public class IteratorExample {

	public static void main(String args[]){
//		List<String> myList1 = new ArrayList<String>();
//                List<String> myList2 = new ArrayList<String>();
//		
//		myList1.add("1");
//		myList1.add("2");
//		myList1.add("3");
//		myList1.add("4");
//		myList1.add("5");
//                
//                myList2.add("1");
//		myList2.add("2");
//		myList2.add("7");
//		myList2.add("4");
//		myList2.add("8");
//		
//		Iterator<String> it = myList1.iterator();
//		while(it.hasNext()){
//			String value = it.next();
//			System.out.println("List1 Value:"+value);
//                        Iterator<String> it2 = myList2.iterator();
//                        while(it2.hasNext()) {
//                            String value2 = it2.next();
//                            if(value.equals(value2)) {
//                                System.out.println("Same"+value+","+value2);
//                                it.remove();
//                                it2.remove();
//                                break;
//                            }
//                        }
//		
//		}
//                
//                System.out.println(myList1);
//                System.out.println(myList2);
            
//             double d1 = 11;
//      double d2 = 11.4;
//      int retval = Double.compare(d1, d2);
//      int sum=0;
//      
//      for(int i=0;i<5;i++){
//            sum += 2;
//          
//      }
//            System.out.println("count"+sum);
//      if(retval > 0) {
//         System.out.println("d1 is greater than d2");
//      } else if(retval < 0) {
//        System.out.println("d1 is less than d2");
//      } else {
//         System.out.println("d1 is equal to d2");
//      }
//        }
            String string = "[{\"mode\":\"V\",\"backPage\":\"\",\"retrievedFromSession\":false,\"showHistory\":\"false\",\"lastModified\":\"\",\"productType\":\"1\",\"efslSplit\":\"7\",\"mrSplit\":\"8\"}]";
            List<String> list = new ArrayList<String>(Arrays.asList(string.split(" , ")));
            
            System.out.println(list);
        }
}
