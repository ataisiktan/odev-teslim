
package yeni;

public class Odev1 {

	public static void main(String[] args) {
		int a = 8, b = 15, c = 7, d = 1; 
	    int temp; 

	    if (a > b) { temp = a; a = b; b = temp; }
	    if (a > c) { temp = a; a = c; c = temp; }
	    if (a > d) { temp = a; a = d; d = temp; }
	    if (b > c) { temp = b; b = c; c = temp; }
	    if (b > d) { temp = b; b = d; d = temp; }
	    if (c > d) { temp = c; c = d; d = temp; }

	    System.out.println(a + " " + b);
	    System.out.println(c + " " + d);
	}
}
