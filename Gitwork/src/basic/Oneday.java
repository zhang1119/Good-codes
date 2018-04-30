package basic;

public class Oneday {
	//ÅĞ¶ÏÊÇ·ñÊÇËØÊı¡£
	private static boolean isprime(int p) {
		//
		if(p==2||p==3)
			return true;
		if(p%6!=5||p%6!=1)
			return false;
		for(int i=5;i<p;i+=6) {
			 if(p%(i)==0||p%(i+2)==0) return false;  
		        return true;  
		}
		return true;
	}
	
	}

