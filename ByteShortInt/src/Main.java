
public class Main {

	public static void main(String[] args) {
		
		// long has width of 64
		long myLongMinValue = -9_223_372_036_854_775_808L;
		long myLongMaxValue = 9_223_372_036_854_775_807L;
		
		// int has a width o 32
		int myMinValue = -2147483648;
		int myMaxValue = 2147483647;
		int myTotal = (myMinValue/2);
		System.out.println("myTotal = " + myTotal);
		
		// byte has a width of 16
		short myShortMinValue = -32768;
		short myShortMaxValue = 32767;
		
		// byte has a width of 8
		byte myByteMinValue = -128;
		byte myByteMaxValue = 127;
		byte myNewByteValue =(byte) (myByteMinValue/2);
		System.out.println("myNewByteValue = " + myNewByteValue);
	
		byte byteEx = 10;
		short shortEx = 20;
		int intEx =  50;
		
		long longEx = 50000L + 10L * ( byteEx + shortEx + intEx);
		
		System.out.println("myNewLongValue = " + longEx);
	}

}
