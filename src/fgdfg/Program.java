package fgdfg;

public class Program {
    public static void main(String[] args) {
    	
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

