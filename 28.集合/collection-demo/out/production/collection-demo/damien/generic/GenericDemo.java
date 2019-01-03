// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GenericDemo.java

package damien.generic;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo
{

	public GenericDemo()
	{
	}

	public static void main(String args[])
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("¥Ù√»÷”");
		arrayList.add("DM≥±»À…Á«¯");
		arrayList.add("ª∂”≠π‚¡Ÿ");
		arrayList.add(Integer.valueOf(10));
		String s;
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext(); System.out.println(s))
			s = (String)iterator.next();

	}
}
