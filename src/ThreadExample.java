class threaddemo1 extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getPriority()+"______"+Thread.currentThread().getName()+"="+i);
			//System.out.print();
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 threaddemo1 t1 = new threaddemo1();
		 threaddemo1 t2 = new threaddemo1();
		 t1.setName("t1");
		 t2.setName("t2");
		 t2.setPriority(10);
		 t1.setPriority(1);
		 t1.start();
		 t2.start();

	}

}
