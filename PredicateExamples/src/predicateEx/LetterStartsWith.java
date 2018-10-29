package predicateEx;

import java.util.function.Predicate;   
 public class LetterStartsWith   
 {   
	     public static void main(String[] args)    
   {   
	         String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"}; 
        Predicate<String> startsWithK=s -> s.charAt(0)=='K';  
        /* (Integer s) -> 
         * {
         * if(i>10)
         * return true;
         * else
         * return false;
         *  }
         * */
	         System.out.println("The Names starts with K are:");  
	         for(String s: names)   
		         {   				           
	        	 	if(startsWithK.test(s))  
	        	 		{  
		                 System.out.println(s);  
	        	 		}
	        	 	/*if(s.charAt(0)=='K')   this also works same
        	 		{  
	                 System.out.println(s);  
        	 		}*/
		         }
   }
 }
 
	