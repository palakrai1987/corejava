
public class threadexampledemo extends Thread
{
	public void run()
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println(i+Thread.currentThread().getName());
			try
			{
			Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadexampledemo t1 = new threadexampledemo();
		t1.setName("mythread1");
		t1.setPriority(1);
		t1.start();
		threadexampledemo t2 = new threadexampledemo();
		t2.setName("mythread2");
		t2.setPriority(8);
		t2.start();
		

	}

}
