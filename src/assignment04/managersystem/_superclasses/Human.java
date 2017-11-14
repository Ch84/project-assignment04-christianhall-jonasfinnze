package assignment04.managersystem._superclasses;

/**
 * This is the super class Human which I use the constructors and methods
 * below to be able to call on what type of person the account belongs
 * to.
 * 
 * @author: Christian Hall
 * @version: 1.0.
 * @since: 2017-11-08
 *
 */

public class Human {
	
	/**
	 * This is the variables called name and age to be able to set the
	 * name and age later in the program.
	 * 
	 * {@code Code is: public String name and public int age}
	 */
	public String name = " ";
	public int age = 0;
	
	/**
	 * This constructor is using the parameters name and age to be
	 * able to set the name and age of the person.
	 * 
	 * @param name
	 * @param age
	 * @param Human
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * This returns the name of the actual person.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * This constructor is using the parameter name to be able to
	 * set just the name of the actual person.
	 * 
	 * @param setName
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This returns the age of the actual person.
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * This constructor is using the parameter age to be able to
	 * set just the age of the actual person.
	 * 
	 * @param setAge
	 */
	public void setAge(int age) {
		this.age = age;
	}

		
}


