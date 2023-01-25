import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
  public static ArrayList < Integer > maxPerimeterTriangle (ArrayList <
							    Integer > lines)
  {
    Collections.sort (lines, Collections.reverseOrder ());
    for (int i = 0; i < lines.size () - 2; i++)
      {
	if (lines.get (i) < lines.get (i + 1) + lines.get (i + 2))
	  {
	    ArrayList < Integer > triangle = new ArrayList <> ();
	    triangle.add (lines.get (i));
	    triangle.add (lines.get (i + 1));
	    triangle.add (lines.get (i + 2));
	    return triangle;
	  }
      }
    return new ArrayList <> ();
  }
  public static void main (String[]args)
  {
    ArrayList < Integer > lines = new ArrayList <> ();
    Scanner scanner = new Scanner (System.in);
    System.out.println ("Enter the number of sides:");
    int n = scanner.nextInt ();
    System.out.println ("Enter the lengths of the sides:");
    for (int i = 0; i < n; i++)
      {
	lines.add (scanner.nextInt ());
      }
    ArrayList < Integer > triangle = maxPerimeterTriangle (lines);
    if (triangle.size () > 0)
      {
	System.out.
	  println
	  ("The sides of the triangle with the maximum perimeter are: " +
	   triangle);
      }
    else
      {
	System.out.
	  println ("No triangle can be constructed from the given sides.");
      }
    scanner.close ();
  }
}
