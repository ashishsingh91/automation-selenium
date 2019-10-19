package automationFramework;

import java.awt.AWTException;
import java.awt.Robot;

public class Robot1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String msg="run this code and stop before itprints 50";
		System.out.println(msg);
		System.out.println("stop only by clicking on terminate button");
		Robot r =new Robot();
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
          r.mouseMove(i,150);
          Thread.sleep(1000);
		
	
		}

	
		
	}

}
