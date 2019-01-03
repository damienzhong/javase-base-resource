// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ObjectToolDemo.java

package damien.generic;

import java.io.PrintStream;

// Referenced classes of package damien.generic:
//			ObjectTool

public class ObjectToolDemo
{

	public ObjectToolDemo()
	{
	}

	public static void main(String args[])
	{
		ObjectTool objectTool = new ObjectTool();
		objectTool.setObject(new Integer(25));
		Object object = objectTool.getObject();
		System.out.println((new StringBuilder()).append("my age is ").append(object).toString());
	}
}
