// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InnerClassDemo4.java

import java.io.PrintStream;

class Outer
{

	private int num;

	Outer()
	{
		num = 10;
	}

	public void method()
	{
		class 1Inner
		{

			final Outer this$0;

			public void show()
			{
				System.out.println(num);
				System.out.println(20);
			}

			1Inner()
			{
				this$0 = Outer.this;
				super();
			}
		}

		1Inner 1inner = new 1Inner();
		1inner.show();
	}

}
