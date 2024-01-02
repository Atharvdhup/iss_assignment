package basicsofjava;

public class Kitten {
 
	   int  kittenAge;
	   public Kitten(String name) {
		      // This constructor has one parameter, <i>name</i>.
		      System.out.println("Passed Name is :" + name );
		   }
	   public void setAge( int age ) {
		      kittenAge = age;
		   }
	   public int getAge( ) {
		      System.out.println("kitten's age is :" + kittenAge );
		      return kittenAge;
		   }
	public static void main(String[] args) {
		
		// Following statement would create an object myKitten
		Kitten myKitten = new Kitten( "tom" );
		
		
		 /* Call class method to set kitten's age */
		myKitten.setAge( 2 );

	      /* Call another class method to get kitten's age */
		myKitten.getAge( );

	      
	      System.out.println("Variable Value :" + myKitten.kittenAge );
	}

}
