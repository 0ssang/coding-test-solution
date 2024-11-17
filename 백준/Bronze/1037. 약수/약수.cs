using System;
using System.Collections;
class son
{
	static void Main()
	{
		int n= int.Parse(Console.ReadLine());
		
		string[] arr = Console.ReadLine().Split();
		int[] arr2=Array.ConvertAll(arr, s=>int.Parse(s));
		Array.Sort(arr2);
		if (n==1)
		{
			Console.WriteLine(arr2[0]*arr2[0]);
		}	
		else
		{
			Console.WriteLine(arr2[n-1]*arr2[0]);
		}
		
	}
}