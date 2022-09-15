import java.lang.Thread;                       //Creating a thread class by extending super thread class
class MyThread extends Thread{
	String message[]={"lalit", "is","a","good","boy"};
	public void run()
	{
		String name=getName();
		for(int i=0; i<message.length; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name + message[i]);
		}
	}
	public static void main(String args[]){       //Creating the object of thread
		MyThread d1=new MyThread();
		MyThread d2=new MyThread();
		d1.setName("d1");
		d2.setName("d2");
		d1.start();
		d2.start();
	}
}