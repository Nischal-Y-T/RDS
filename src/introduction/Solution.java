package introduction;

public class Solution {
	
	 static int getSum(int n)
	 {
	     int sum = 0;
	     while (n !=0)
	     {
	         sum = sum + n%10;
	         n = n/10;
	     }
	     return sum;
	 }
	 static void smallestNumber(int N)
	 {
	     int i = 1;
	     while (i != 0)
	     {
	         if (getSum(i) == N)
	         {
	             System.out.print(i);
	             break;
	         }
	         i++;
	         }
	 }

	     int solution(int N1) {
        int N1 = 10;
        smallestNumber(N);
    }

}

}
