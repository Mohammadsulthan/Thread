package dd;

import java.util.Date;

public class Thre3 
{
	public static void main(String[] args) 
	{
		System.out.println(new Date());
		System.out.println("before start a class");
		System.out.println("i told a kala getting a token:.....");
		
				Thread n=new Thread(new Runnable(
						){
					vaccinationcenter bb;
					public void run() 
					{
						System.out.println("kala stading on the queue:");
						try
						{
							bb.getvacci();
						}
						catch(Exception m)
						{
							System.out.println(m);
						}
						
					}
				},"kala");
				n.start();
				System.out.println("class start 7-9 "+new Date());
	}
	static class vaccinationcenter
	{
		static void getvacci()throws Exception
		{
			Thread hh=Thread.currentThread();
			String name=hh.getName();
			Thread.sleep(5000);
			System.out.println(name+" token getting:");
		}
	}
}
