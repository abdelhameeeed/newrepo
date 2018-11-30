package huffman;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class compress {
	private String text ;
	private String compressed_stream ;
	ArrayList<Double> prob =new ArrayList<Double> ()    ;
	 HashMap< String, Double > tablee = new HashMap < String , Double>() ;
	int [] freq = new int [1000] ;
	public String s1 = "" ;
	public String s2 = "" ;
	public compress(String f)
	{
	  this.text = f ;
	  for( int i = 0 ; i < this.text .length() ; i ++ )
	  {
		  ++ freq[this.text.charAt(i)] ;
	  }
	  for( int i = 0 ; i < 1000 ; i ++ )
	  {
		  if( freq[i] != 0 )
		  {
			  Double X  = (double) freq[i] / this.text.length() ;
			  char c = (char)i;
			  String G = "" ;
			  G+= c ;
			  tablee.put(G, X) ;
			  prob.add(X)      ;
		  }
	  }
	  solve() ;
	}
	public String find (double F)
	{
	  for(String key : tablee.keySet())
	  {
		  double value = tablee.get(key) ;
		  if(value == F)
		  {
			  tablee .put( key , 0.0 ) ;
			  return key ;
		  }
	  }
	  return " " ;
	}
	public  void  solve()
	{
		if(prob.size() == 2)
		{
			s1 = find(prob.get(0) )  ;
			s2 =  find (prob.get(1)) ;
			return ; 
		}
		Collections.sort(prob);
		double D = prob.get(0) + prob.get(1) ;
		String H = find( prob.get(0) ) + find( prob.get(1) ) ;
		prob.remove(0)   ;
		prob.remove(0)   ;
		tablee.put(H, D) ;
		prob.add(D) ;
		solve() ;
	}
}
