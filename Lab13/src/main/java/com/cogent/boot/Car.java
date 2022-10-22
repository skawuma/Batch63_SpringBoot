package com.cogent.boot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
	public void letsGo()
	{
		System.out.println("Going too fast to DownTown");
	}
}
