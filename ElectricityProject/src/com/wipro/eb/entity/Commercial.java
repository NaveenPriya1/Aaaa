package com.wipro.eb.entity;

public class Commercial extends Connection {
	public Commercial(int currentReading, int previousReading,float slabs[]) {
		super(currentReading, previousReading, slabs);
	}

	public float computeBill() {
		float amount = 0;
		int consumed=previousReading-currentReading;
		if(consumed<=50) {
			amount=consumed*slabs[0];
			
		}
		else if(consumed>50 && consumed <=100) {
			amount=50*slabs[0]+(consumed-50)*slabs[1];
			
		}
		
		else {
			amount=50*slabs[0]+50*slabs[1]+(consumed-100)*slabs[2];
		}
		
		if (amount>=1000) {
			amount+=amount*0.09;
		}
		else if (amount>=5000) {
			amount+=amount*0.06;
		}
		else {
			amount+=amount*0.02;
		}
		return amount;
		
	}


}
