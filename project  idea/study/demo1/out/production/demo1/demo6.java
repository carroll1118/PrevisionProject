// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   demo6.java

import java.io.PrintStream;

public class demo6
{

	public demo6()
	{
	}

	public static void main(String args[])
	{
		String str = "world";
		String s = str;
		byte byte0 = -1;
		switch (s.hashCode())
		{
		case 99162322: 
			if (s.equals("hello"))
				byte0 = 0;
			break;

		case 113318802: 
			if (s.equals("world"))
				byte0 = 1;
			break;
		}
		switch (byte0)
		{
		case 0: // '\0'
			System.out.println("hello");
			break;

		case 1: // '\001'
			System.out.println("world");
			break;
		}
	}
}
