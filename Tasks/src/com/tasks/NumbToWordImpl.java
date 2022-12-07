package com.tasks;

public class NumbToWordImpl implements NumbToWord {

	public NumbToWordImpl() {
	}

	public String NumberToWord(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("Invalid!! Enter more than 0");

		}

		if (n == 0) {
			return "Zero";
		}

		int f = n % 10; // unit place i.e first place
		int temp1 = n % 100;
		int s = temp1 / 10;// 2nd place
		int temp2 = n % 1000;
		int t = temp2 / 100;// 3rd place
		int fp = n / 1000;// 4th place
		System.out.println(fp + " " + t + " " + s + " " + f);

		String[] oneToNine = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", " ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] twentyToHun = { " ", " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety", };
		String[] hunThou = { "hundred","thousand"};
		
		if (n< 20) {
			return oneToNine[n];
		}
     if(n<100) {
    return	 twentyToHun[s]+" "+ oneToNine[f];
}
     if(n<=999) {
    	 return oneToNine[t]+" "+hunThou[0]+" and "+twentyToHun[s]+" "+oneToNine[f]; 			 
     }
     if(n<=9999) {
    	 return oneToNine[fp]+" "+hunThou[1]+" and "+oneToNine[t]+" "+hunThou[0]+" "+twentyToHun[s]+" "+oneToNine[f];
     }

		return " "; 
	}
	

}
