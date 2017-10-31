package org.accenture.fac;
/*
 * Class that computes the factorial of an integer(long) number
 */

public class Factorial {

	public long compute(long value) {
		long result;
		if(value<0) {
			throw new RuntimeException("The value is negative "+value);
		}
		else if ((value == 0) || (value == 1)) {
			result= 1;
		} else {
			result= value * compute(value - 1);
		}
		return result;
		//comprobar que  no haya overflow
	}

}
