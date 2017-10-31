package org.accenture.fac;

public class Factorial {

	public long compute(long value) {
		if((value==0)||(value==1)){
			return 1;
		}else if(value==2) {
			return 2;
		}else if(value==3) {
			return 6;
		}else {
			return value*compute(value-1);			
		}
	}
	
}
