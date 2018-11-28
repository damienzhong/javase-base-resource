// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringDemo4.java

package damien.demo02;

import java.io.PrintStream;

public class StringDemo4
{

	public StringDemo4()
	{
	}

	public static void main(String args[])
	{
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == (new StringBuilder()).append(s1).append(s2).toString());
		System.out.println(s3.equals((new StringBuilder()).append(s1).append(s2).toString()));
		System.out.println(s3 == "helloworld");
		System.out.println(s3.equals("helloworld"));
	}
}
