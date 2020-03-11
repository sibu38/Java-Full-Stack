package com.testing;

import java.util.Random;

public class RandomGen {
	
	public int randomGenerator()
	{
		Random random=new Random();
			return random.nextInt(100);
	}

}
