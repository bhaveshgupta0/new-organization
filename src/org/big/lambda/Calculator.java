package org.big.lambda;

@FunctionalInterface
public interface Calculator<T> {
	
	public T compute(T num1,T num2);

}
