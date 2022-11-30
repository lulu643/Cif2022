package edu.nyu.cif2022.class5.options.v4;

/**
 * A stream of simulated prices.
 * 
 * @author eran
 *
 */
public interface PriceSupplier {
	
	/**
	 * Returns randomized stock price.
	 * 
	 * @return randomized stock price 
	 */
	double price();

}
