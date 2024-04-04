
public class testsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer ob = new printer(); // common shared resouce
		printthread1 t1 = new printthread1(ob);
		printthread2 t2 = new printthread2(ob);
		printthread3 t3 = new printthread3(ob);
	
		t1.start();
		t2.start();
		t3.start();

	}

}
