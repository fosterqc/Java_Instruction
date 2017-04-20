package com.chsrobotics.javainstruction;

public class eqi {
	public static float num(float given)
	{
		float output = (given + 4)*(given+4);
		return output;
	}
	public static float den(float given)
	{
		float output=(given-3);
		return output;
	}
	public static float f(float x)
	{
		float output = num(x)/den(x);
		return output;
	}
	public static void Method(float input)
	{
		System.out.println("you wrong stupid, F(x)=:" + f(input));
	}
	public static void main(String args[])
	{
		for (int i=0; i <=10; i++)
		{
			Method(i);
			}
	}
}
