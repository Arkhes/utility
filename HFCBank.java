package com.app.mod.feature;

public class HFCBank {
	static String location = "vadapalani";
	static int branchCode = 101;
	static long pinCode = 600028;
	static String IFSC = "HSC894";
	public static void main(String[] args) {
		// varaible name
		System.out.println(location);
		System.out.println(branchCode);
		System.out.println(pinCode);
		System.out.println(IFSC);
//className.variableName
		System.out.println(HFCBank.location);
		System.out.println(HFCBank.branchCode);
		System.out.println(HFCBank.pinCode);
		System.out.println(HFCBank.IFSC);
//different 
		System.out.println(BankRepo.desc);
	}

}
