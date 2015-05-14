package com.kingshuk.java.j5;

public class Enumerators {

	public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    
    public enum Day{										// Enum declaration is accepted.
    	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
    }
    
    void printAppointment(int day) {
        System.out.println(" Please come on " + day);
    }
    
    void printAppointment(Enum day) {
        System.out.println(" Please come on " + day);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            new Enumerators().printAppointment(WEDNESDAY);
	            System.out.println("Enum implementation");
	            new Enumerators().printAppointment(Day.WEDNESDAY);
    }

}
