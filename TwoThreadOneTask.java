package hitday24;
public class TwoThreadOneTask {
	public static void main(String[] args)
	{
}
	class ShootingTask implements
	Runnable{
		Canon gun;
		public ShootingTask(Canon gun) {
			this.gun=gun;
		}
		@Override  
		public void run() {
			Thread
			t=Thread.currentThread();
			if(t.getName().equals("naina"))
			{
				for(int i=0;i<5;i++) {		
					gun.fill();
				}
				}
			else
				if(t.getName().equals("shabeer")) {
					for(int i=0;i<5;i++) {
						gun.shoot();
					}
					}
				}

	

			ShootingTask obj = new ShootingTask()
					{
					
				public void fill() {
					Thread
					t=Thread.currentThread();
					String name=t.getName();
					System.out.print(name+"fills the gun.....");
				}
				public void shoot() {
					Thread
					t=Thread.currentThread();
					String name=t.getName();
					System.out.println(name+"shoot the gun");
				}
				
		};
		
		obj.fill();
			Canon bofors=new Canon();
			ShootingTask st=new ShootingTask(bofors);
			Thread naina=new Thread(st,"naina");
			Thread shabeer=new Thread(st,"shabeer");
			
	}  
}
	


		
		
		