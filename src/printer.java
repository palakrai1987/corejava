class printer {
synchronized void print(int n)
	{
		for(int i =1;i <=10;i++)
		{
			System.out.println(n*i);
		}
	}
}
class printthread1 extends Thread
{
	printer p;
	printthread1(printer p)
	{
		this.p = p;
	}
   public void run()
   {
	   p.print(5);
   }
}
class printthread2 extends Thread
{
	printer t;
	printthread2(printer t)
	{
		this.t = t;
	}
   public void run()
   {
	   t.print(100);
   }
}
class printthread3 extends Thread
{
	printer x;
	printthread3(printer x)
	{
		this.x = x;
	}

    public void run()
    {
    	x.print(200);
    }
}







