package roomateApp.person;

public class person {

	private String firstName;
	private String lastName;
	private String nickName;
	
	/**
	 * Create a user when all names are known
	 * 
	 * @param firstName - Person's first name
	 * @param lastName - Person's last name
	 * @param nickName - Person's alias
	 */
	public person(String firstName, String lastName, String nickName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
	}
	/**
	 * Create a user when only nickname is known
	 * 
	 * @param nickName - Person's alias
	 */
	public person(String nickName){
		this.nickName = nickName;
	}
	
	/**
	 * Set a person's first name
	 * 
	 * @param firstName - Name that will set/replace person's first name
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	/**
	 * Gets a person's first name
	 * 
	 * @return String - Person's first name
	 */
	public String getFirstName(){
		return firstName;
	}
	
	/**
	 * Set a person's last name
	 * 
	 * @param lastName String - Person's last name
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	/**
	 * Gets a person's last name
	 * 
	 * @return String - Person's last name
	 */
	public String getLastName(){
		return lastName;
	}
	
	/**
	 * Set a person's alias
	 * 
	 * @param nickName - Person's alias
	 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	/**
	 * Gets a person's alias
	 * 
	 * @return String - Person's alias
	 */
	public String getNickName(){
		return nickName;
	}
}
