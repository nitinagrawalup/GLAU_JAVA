package fundamentals;

public class Program_7 {

	public static void main(String[] args) {
		
		
		byte    var1= Byte.MIN_VALUE;
		short   var2= Short.MIN_VALUE;
		int     var3= Integer.MIN_VALUE;
		float   var4= Float.MIN_VALUE;
		double  var5= Double.MIN_VALUE;
		long    var6= Long.MIN_VALUE;
		boolean var7= false;
		char 	var8= Character.MIN_VALUE;
		
		System.out.println(" byte : "+ var1 );
		System.out.println(" short : "+ var2 );
		System.out.println(" int : "+ var3);
		System.out.println(" float : "+ var4 );
		System.out.println(" double : "+ var5);
		System.out.println(" long : "+ var6);
		System.out.println(" boolean : "+ var7 );
		System.out.println(" char : "+ var8);
		System.out.println(" above char value is type casted into (int) : "+ (int)var8);
		
	}

}

/*

WAP to declare variables of all 8 primitive type, initialize and print
them on output screen.

*/

/* 
  					Notes:

byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
*/