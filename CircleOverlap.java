import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      // Your work goes here
      if (Math.abs(xcenter1) - Math.abs(xcenter2) <= radius1 + radius2 && Math.abs(ycenter1) - Math.abs(ycenter2) <= radius1 + radius2)
      {
          System.out.println("two circles are not overlap");
        }
      else
      {
          System.out.println("two circle are overlap");
        }
   }
}