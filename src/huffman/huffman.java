package huffman;
import java.util.*;
import java.util.Scanner;
public class huffman {

	public static void main(String[] args) {
		String s ;
		Scanner input = new Scanner(System.in) ;
		s = input.nextLine() ;
		compress c1 = new compress(s) ;
		String x = "" ;
		String y = "" ;
		x = c1.s1 ;
		y = c1.s2 ;
		//System.out.println(x);
		//System.out.println(y);
		decompress c2 = new decompress(x,y,s);
		
	}
}
