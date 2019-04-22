import java.util.*;

 class Test 
 {    public static void main(String[]args)
	 {
	     ArrayList al = new ArrayList();
	     al.add(10);
	     al.add("himani");
	     al.add("durga");
	     al.add("10.5");
	     
	     System.out.println(al);
	     System.out.println(al.size());
	     al.add(1,"golu");
	     System.out.println(al);
	     System.out.println(al.size());
	     
	     al.remove(0);
	     System.out.println(al);
	     al.remove("himani");
	     System.out.println(al);
	     }
	

}
