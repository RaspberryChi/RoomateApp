package roomateApp.biller;

import roomateApp.person.person;

/**
 * Contains the information on the different billers
 * 
 * @author marke_000
 *
 */
public class biller {

	private String name;
	private float frequencyMonths;
	private person owner;
	private String type;
	private float amount;
	
	/**
	 * Create biller when name, frequency, and owner is known
	 * 
	 * @param name Biller's name
	 * @param frequencyMonths Expected bill frequency in months
	 * @param owner Person who owns this biller
	 */
	public biller(String name, float frequencyMonths, person owner){
		this.name = name;
		this.frequencyMonths = frequencyMonths;
		this.owner = owner;
		this.type = "variable";
		this.amount = -1;
	}
	/**
	 * Create biller when name, frequency, owner, and type is known
	 * 
	 * @param name Biller's name
	 * @param frequencyMonths Expected bill frequency in months
	 * @param owner Person who owns this biller
	 */
	public biller(String name, float frequencyMonths, person owner, String type){
		this.name = name;
		this.frequencyMonths = frequencyMonths;
		this.owner = owner;
		setType(type);
		this.amount = -1;
	}
	/**
	 * Create biller when name, frequency, owner, and type is known
	 * 
	 * @param name Biller's name
	 * @param frequencyMonths Expected bill frequency in months
	 * @param owner Person who owns this biller
	 * @param amount Value of fixed biller bill
	 */
	public biller(String name, float frequencyMonths, person owner, String type, float amount){
		this.name = name;
		this.frequencyMonths = frequencyMonths;
		this.owner = owner;
		setType(type);
		
		if(this.type == "fixed"){
			this.amount = amount;
		}else{
			this.amount = -1;
		}
	}
	
	/**
	 * Get biller's name
	 * 
	 * @return String Biller's name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Set biller's name
	 * 
	 * @param name Biller's name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get biller's expected frequency in months
	 * 
	 * @return float Expected biller's frequency in months
	 */
	public float getFrequencyMonths(){
		return frequencyMonths;
	}
	/**
	 * Set biller's expected frequency in months
	 * 
	 * @param frequencyMonths Expected biller's frequency in months
	 */
	public void setFrequencyMonths(float frequencyMonths){
		this.frequencyMonths = frequencyMonths;
	}
	
	/**
	 * Get biller's owner
	 * 
	 * @return person Biller's owner
	 */
	public person getOwner(){
		return owner;
	}
	/**
	 * Set biller's owner
	 * 
	 * @param owner Biller's owner
	 */
	public void setOwner(person owner){
		this.owner = owner;
	}
	
	/**
	 * Get biller type
	 * 
	 * @return string Biller's type
	 */
	public String getType(){
		return type;
	}
	/**
	 * Set biller's type, checks if accepted type
	 * 
	 * @throws RuntimeException if biller is not fixed or variable
	 * @param type String Biller's type
	 */
	public void setType(String type){
		if(type.toLowerCase() != "fixed" && type.toLowerCase() != "variable"){
			throw new RuntimeException("Biller type must be 'fixed' or 'variable'");
		}else{
			this.type = type.toLowerCase();
		}
	}
	
	public float getAmount(){
		return amount;
	}
	
	public void setAmount(float amount){
		if(this.type == "fixed"){
			this.amount = amount;
		}else{
			this.amount = -1;
		}
	}
}
