/**
 * 
 */
package roomateApp.bill;

import roomateApp.biller.biller;

/**
 * @author marke_000
 *
 */
public class bill {
	
	private biller source;
	private float amount;
	
	public bill(biller source, float amount){
			this.source = source;
			this.amount = amount;
	}
}
