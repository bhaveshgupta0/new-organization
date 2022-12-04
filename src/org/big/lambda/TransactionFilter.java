package org.big.lambda;

import java.util.List;

@FunctionalInterface
public interface TransactionFilter {
	public List<Transaction> doFilter( List<Transaction> originalList);
}