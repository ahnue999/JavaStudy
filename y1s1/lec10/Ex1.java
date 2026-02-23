public class Ex1 {
	public static void main(String[] args) {
		firstYear st = new firstYear(86, 100, 60, 70, 100);
		secondYear st2 = new secondYear(86, 90, 90, 50, 90);
		thirdYear st3 = new thirdYear(86, 80, 100, 40, 100);
		fourthYear st4 = new fourthYear(86, 60, 80, 60, 100);

		System.out.println("First year");
		System.out.println("ID: " + st.getId());
		System.out.println("Total: " + st.total());
		System.out.println("percenetage: " + st.calcAvg());
		System.out.println("current year record: " + st.getYearTotal());

		System.out.println("Fourth year");
		System.out.println("ID: " + st4.getId());
		System.out.println("Total: " + st4.total());
		System.out.println("percenetage: " + st4.calcAvg());

		System.out.println("All years records:");
		System.out.println("fourth year record: " + st4.getYearTotal());

		System.out.println("overall total: " + st4.getOverallTotal());
		System.out.println("overall percentage: " + st4.getOverallPercentage());
	}

	public static class student {
		float id;
		float[] record = new float[4];
		float[] results;
		float yearTotal;
		protected static float[][] recordSheet = new float[100][2];


		public float getId() {
			return id;
		}

		public void setId(float s) {
			id = s;
		}
		
		public void setResults(float[] results) {
			this.results = results;
		}

		public float[] getRecord() {
			return record;
		}

		public void setRecord(int year)
		{
			record[year] = calcAvg();
			recordSheet[(int) id][1] += record[year];
		}


		public student(float id)
		{
			setId(id);
		}

		public float total()
		{
			float total = 0;
			for (float result : this.results)
				total += result;

			return total;
		}

		public float calcAvg()
		{
			return (total() / this.results.length);
		}

	}

	public static class firstYear extends student
	{
		public firstYear(float id, float... results)
		{
			super(id);
			setResults(results);
			setRecord(0);
		}

		public float getYearTotal()
		{
			return (record[0]);
		}

	}
	public static class secondYear extends student
	{
		public secondYear(float id, float... results)
		{
			super(id);
			setResults(results);
			setRecord(1);
		}
		public float getYearTotal()
		{
			return (record[1]);
		}

	}
	public static class thirdYear extends student {
		public thirdYear(float id, float... results) {
			super(id);
			setResults(results);
			setRecord(2);
		}
		public float getYearTotal() {
			return (record[2]);
		}

	}
	public static class fourthYear extends student {
		public fourthYear(float id, float... results)
		{ super(id);
			setResults(results);
			setRecord(3);
		}

		public float getYearTotal() {
			return (record[3]);
		}

		public float getOverallTotal() {
			return recordSheet[(int) id][1];
		}

		public float getOverallPercentage() {
			return (getOverallTotal() / record.length);
		}
	}
}
