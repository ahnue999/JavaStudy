public class Q2
{
	public static void main(String[] args)
	{
		Time time = new Time();

		System.out.println(time);

		time.tick();
		System.out.println(time);
		time.IncrementMinutes();
		System.out.println(time);
		time.IncrementHours();
		System.out.println(time);
		time.setSeconds(59);
		System.out.println(time);
		time.tick();
		System.out.println(time);
	}
	public static class Time
	{
		private int hours;
		private int minutes;
		private int seconds;

		public Time()
		{
			hours = 0;
			minutes = 0;
			seconds = 0;
		}
		public Time(int h, int m, int s)
		{
			setHours(h);
			setMinutes(m);
			setSeconds(s);
		}

		public void setHours(int h)
		{
			if (h >= 0 && h < 24)
				hours = h;
			else
				hours = 0;
		}

		public void setMinutes(int m)
		{
			if (m >= 0 && m < 60)
				minutes = m;
			else
				minutes = 0;
		}

		public void setSeconds(int s)
		{
			if (s >= 0 && s < 60)
				seconds = s;
			else
				seconds = 0;
		}

		public int getHours()
		{
			return (hours);
		}
		public int getMinutes()
		{
			return (minutes);
		}
		public int getSeconds()
		{
			return (seconds);
		}

		public void tick()
		{
			if (seconds == 59)
			{
				IncrementMinutes();
				setSeconds(0);
			}
			else
				setSeconds(++seconds);
		}
		public void IncrementMinutes()
		{
			if (minutes == 59)
			{
				IncrementHours();
				setMinutes(0);
			}
			else
				setMinutes(++minutes);
		}
		public void IncrementHours()
		{
			if (hours == 23)
			{
				setHours(0);
			}
			else
				setHours(++hours);
		}

		@Override
		public String toString()
		{
			return (String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds()));
		}
	}
}
