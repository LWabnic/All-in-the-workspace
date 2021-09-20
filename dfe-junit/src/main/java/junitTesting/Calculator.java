package junitTesting;

public class Calculator {
public int add(int a,int b){
	return a+b;
}
public int subtract(int a,int b){
	return a-b;
}
public int conditionalCalc(int a,int b,boolean flag){
	if(flag) {
		return a+b;
	}
	else {
		return a-b;
	}
}
}
