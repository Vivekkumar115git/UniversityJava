package com.inhr.beans;

public class Student 
{
	private int id;
	private String name;
	private String addr;
	
	public Student()
	{
		id=0;
		name=null;
		addr=null;
	}
	public Student(int id, String name, String addr)
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddr() 
	{
		return addr;
	}
	public void setAddr(String addr) 
	{
		this.addr = addr;
	}
	public String toString() {
		return "Student [id=" + this.id + ",name="+this.name+ ", addr=" +this.addr+ "]";
	}
}
