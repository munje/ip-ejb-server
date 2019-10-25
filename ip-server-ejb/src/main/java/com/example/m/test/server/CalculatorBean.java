package com.example.m.test.server;

import javax.ejb.Stateless;

@Stateless
public class CalculatorBean implements Calculator {

	@Override
	public int doMagic(int money) {
		return 1;
	}
}