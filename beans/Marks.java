package com.inhr.beans;

abstract public class Marks extends Student
{
	private int m1;
	private int m2;
	private int m3;
	
	public Marks()
	{
		m1=0;
		m2=0;
		m3=0;
	}
	public Marks(int id,String name,String addr,int m1, int m2, int m3)
	{
		super(id,name,addr);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public int getM1() 
	{
		return m1;
	}
	public void setM1(int m1)
	{
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2)
	{
		this.m2 = m2;
	}
	public int getM3() 
	{
		return m3;
	}
	public void setM3(int m3)
	{
		this.m3 = m3;
	}
	abstract public int CalculatePer();
	
	public String toString()
	{
		return super.toString()+"M1:"+this.m1+"M2 :"+this.m2 +"M3 :"+this.m3;
	}
}
