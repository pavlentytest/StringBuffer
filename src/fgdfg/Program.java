package fgdfg;

public class Program {
    public static void main(String[] args) {
    	
    	String a1 = new String("Hello");
    	String a2 = new String("Hello");
    	//System.out.println(a1==a2); // false
    	//System.out.println(a1.equals(a2)); // true
    	
    	String a3 = "School";
    	String a4 = "School";
    	//System.out.println(a3==a4); 
    	
    	// immutable - неизменяемая
    	String a = new String("adgadfgadfg");
    	System.out.println(a.hashCode());
    	a += "AAAAAAAA";
    	System.out.println(a.hashCode());
    	a += "BBBBBBBB";
    	System.out.println(a.hashCode());
    	System.out.println("-----------------------------");  
    	
    	StringBuffer str = new StringBuffer("dfgadfgadfg");
    	System.out.println(str.hashCode());
    	str.append("adfgadfg");
    	System.out.println(str.hashCode());
    	str.append("dddddd");
    	System.out.println(str.hashCode());
    	
    	
    	//System.out.println(a);
    	
    	
    	
    	
    	
    	
    	
    }
}

