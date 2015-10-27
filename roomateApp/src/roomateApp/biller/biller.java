package roomateApp.biller;

public class biller {

	private String name;
	private float frequencyMonths;
	
	/**
	 * Create biller when name and frequency is known
	 * 
	 * @param name - Biller's name
	 * @param frequencyMonths - The expected bill frequency in months
	 */
	public biller(String name, float frequencyMonths){
		this.name = name;
		this.frequencyMonths = frequencyMonths;
	}
	
	/**
	 * Get biller's name
	 * 
	 * @return String - Biller's name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Set biller's name
	 * 
	 * @param name - Biller's name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get biller's expected frequency in months
	 * 
	 * @return float - Expected biller's frequency in months
	 */
	public float getFrequencyMonths(){
		return frequencyMonths;
	}
	/**
	 * Set biller's expected frequency in months
	 * 
	 * @param frequencyMonths - Expected biller's frequency in months
	 */
	public void setFrequencyMonths(float frequencyMonths){
		this.frequencyMonths = frequencyMonths;
	}
}
