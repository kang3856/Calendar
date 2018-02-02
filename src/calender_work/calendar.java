package calender_work;


public class calendar {
	public static void week(int lange, int start) {
		
		String [] day_of_week = {"일","월","화","수","목","금","토"};
		
		String [][] mycal = new String[5][7] ;
		
		int j=0;
		int q =1;
		
		for(int x = 0; x < day_of_week.length; x++)
		{
			System.out.printf("%5s",day_of_week[x]);
		}
			System.out.println();
			for(int i=0; q <= lange; i++)
			{
				if(start > i)
				{
					mycal[j][i] = " ";
					System.out.printf("%3s",mycal[j][i]);		
				}
				else 
				{
					mycal[j][(i % 7)] = "" + q;
					System.out.printf("%3s",mycal[j][(i % 7)]);
					q++;
					if((i % 7) == 6)
					{
						j++;
						System.out.println();
					}
				}
			}
			System.out.println();
		}

}
