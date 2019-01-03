// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ArgsDemo.java

package damien.news_02;

import java.io.PrintStream;

public class ArgsDemo
{

	public ArgsDemo()
	{
	}

	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println(sum(new int[] {
			a, b
		}));
		System.out.println(sum(new int[] {
			a, b, c
		}));
		System.out.println(sum(new int[] {
			a, b, c, d
		}));
	}

	public static transient int sum(int a[])
	{
		System.out.println((new StringBuilder()).append("a:").append(a).toString());
		return 0;
	}
}
