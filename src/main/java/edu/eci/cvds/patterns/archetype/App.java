package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = (args.length > 0)? args[1] + " " + args[1] : "World";
        System.out.println( name );
    }
}
