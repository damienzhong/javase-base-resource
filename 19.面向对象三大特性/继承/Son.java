// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExtendsDemo6.java

import java.io.PrintStream;

class Son extends Father
{

	public Son()
	{
		System.out.println("Son的无参构造方法");
	}

	public Son(int i)
	{
		System.out.println("Son的有参构造方法");
	}
}
