package com.inhr.beans;

public class MSc extends Marks
{
	
	
	
	public MSc(int id,String name,String addr,int m1, int m2, int m3)
	{
		super(id, name, addr, m1, m2, m3);
		
	}
	public int CalculatePer()
	{
		return (getM1()+getM2()+getM3())/3;
	}
	public String toString()
	{
		return super.toString()+"Percentage:-"+CalculatePer();
	}
}
