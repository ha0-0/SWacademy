package com.java.inheritance;

public class FireEngine extends Car{

	private int accelate = super.getAccelate();
	private int water=1000;
	
	public int shower() {
		this.water = this.water-10;
		return this.water;
	}
	
	public void inputWater(int water) {
		this.water = this.water + water;
	}

	public int getWater() {
		return water;
	}

	@Override
	public void speedUp() {
		this.accelate = this.accelate+3;
		//super.speedUp();
	}
	
	@Override
	public int getAccelate() {
		return this.accelate;
	}

}
