import java.util.Scanner;

public class Time
{
	public static void main(String[] args)
	{

		// create and initialize a Time1 object
		Time1 time = new Time1(); // invokes Time1 constructor
		System.out.print( "The initial universal time is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "The initial standard time is: " );
		System.out.println( time.toString() );
		System.out.println(); // output a blank line
							  // change time and output updated time
		time.setTime( 13, 27, 6 );
		System.out.print( "Universal time after setTime is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time after setTime is: " );
		System.out.println( time.toString() );
		System.out.println(); // output a blank line
							  // attempt to set time with invalid values
		try
		{
			time.setTime( 99, 99, 99 ); // all values out of range
		} // end try
		catch ( IllegalArgumentException e )
		{
			System.out.printf( "Exception: %s\n\n", e.getMessage() );
		} // end catch
		// display time after attempt to set invalid values
		System.out.println( "After attempting invalid settings:" );
		System.out.print( "Universal time: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time: " );
		System.out.println( time.toString() );
	}

	public static class Time1
	{
		private int hour;
		private int minute;
		private int second;

		public void setTime(int h, int m, int s)
		{
			if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60 ))
			{
				this.hour = h;
				this.minute = m;
				this.second = s;
			}
			else 
				throw new IllegalArgumentException("hour, minute and/or second was out of range");
		}

		public String toUniversalString()
		{
			return (String.format("%02d:%02d:%02d", hour, minute, second));
		}

		public String toString()
		{
			return String.format("%02d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12),
					minute, second, (hour >= 12 ? "PM" : "AM"));
		}
	}
}
