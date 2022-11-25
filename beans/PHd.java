package com.inhr.beans;

public class PHd extends Marks
{
	private String spsub;
	private int spmarks;
	
	public PHd()
	{
		spsub=null;
		spmarks=0;
	}
	public PHd(int id,String nm,String addr,int m1, int m2, int m3,String spsub, int spmarks)
	{
		super(id, nm, addr, m1, m2, m3);
		this.spsub=spsub;
		this.spmarks=spmarks;
	}
	
	public int CalculatePer()
	{
		return (getM1()+getM2()+getM3()+spmarks)/4;
	}
	public String toString()
	{
		return super.toString()+"SpSub:"+this.spsub +"SpMarks:"+this.spmarks;
	}
}
