// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConstructDemo2.java

import java.io.PrintStream;

class Student
{

	private String name;
	private int age;

	public Student(String s)
	{
		System.out.println("这是一个带String类型的构造方法");
		name = s;
	}

	public Student(int i)
	{
		System.out.println("这是一个带int类型的构造方法");
		age = i;
	}

	public Student(String s, int i)
	{
		System.out.println("这是一个带两个参数的构造方法");
		name = s;
		age = i;
	}

	public void show()
	{
		System.out.println((new StringBuilder()).append(name).append("----").append(age).toString());
	}
}
