package javaPrograms;

import java.util.Random;

import org.testng.annotations.Test;

public class HowToGenerateRandomNumbers {
	
	@Test(enabled=false, description="Math Class Method")
	public void f1() {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
	}
	
	@Test(enabled=true, description="Random Class Method")
	public void f2() {
		
		Random random=new Random();
		
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
	}

}
