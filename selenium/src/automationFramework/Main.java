package automationFramework;

//import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ArrayList<String> inputByLine=new ArrayList<String>();
      try {
    	 Scanner sc = new Scanner(System.in);
    	  
    	  int max = sc.nextInt();
    	  for(int i = max ; i >= 0; i --) {
    		  foo(max-1,max);
    	  }
    	  
    	  for(int i=1; i < max ; i++) {
    		  foo(max-1,max);
    	  }
//    	  for(String line2: inputByLine)
//    		  System.out.println(line2);
    	 // isr.close();
      }
      catch(Exception ioe) {
    	  ioe.printStackTrace();
      }
	}
public static void foo(int n, int max) {
	for(int i=0; i< max-n ; i++) {
		System.out.print(" ");
	}
	
	for(int i=1; i<=n  ; i++) {
		System.out.print(i);
	}
	
	for(int i=n-1; i >=1  ; i--) {
		System.out.print(i);
	}
	System.out.println();
}
}
