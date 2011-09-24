package TUnit.assertion;

public class Assertion {
    public Boolean egaux( Integer a, Integer b ) {
        return a.equals( b );
    }

    public static void main ( String... args ) {
        Assertion t = new Assertion();

        if( t.egaux( 1, 1 ) )
          System.out.println( "1 egale a 1." );
        else
          System.out.println( "1 n'egale pas a 1." );
    }
}
