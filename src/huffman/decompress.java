package huffman;

import java.util.HashMap;

public class decompress {
	private String x ;
	private String y ; 
	private String D ;
	 HashMap<  Character  , String > savee = new HashMap < Character  ,String >() ;
	public decompress(String x , String y , String q)
	{
		this.x  = x ;
		this.D = q  ;
		this.y = y  ;
		String d = "0" ;
		for( int i = x.length() - 1 ; i >= 0 ; i -- )
		{
			if(i == 1)
			{
				savee.put(  x.charAt(i) , d+"0"   ) ;
				savee.put(x.charAt(i-1) , d+"1"   ) ;
				break ;	
			}
			if(d.charAt( d.length() - 1 ) == '0' )
			{
				savee.put(x.charAt(i),d+"1"     ) ;
				d = d + "0" ;
			}
			else
			{
				savee.put(x.charAt(i),d+"0") ;
				d = d + "1" ;
			}
		}
		d = "1" ;
		for( int i = y.length() - 1 ; i >= 0 ; i -- )
		{
			if(i == 1)
			{
				savee.put(y.charAt(i),d+"0"   )   ;
				savee.put(y.charAt(i-1),d+"1"   ) ;
				break ;	
			}
			if( d.charAt( d.length() - 1 ) == '0' )
			{
				savee.put(y.charAt(i),d+"1"   ) ;
				d = d + "0" ;
			}
			else
			{
				savee.put(y.charAt(i),d+"0"   ) ;
				d = d + "1" ;
			}
		}
		System.out.println("the compressed text is ") ;
		for(int i = 0 ; i < this.D.length() ; i ++ )
		{
			
			System.out.print(savee.get(D.charAt(i)));
		}
	}
}