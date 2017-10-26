
public class Passenger {
	private String prefix;
	private String fName;
	private String mInit;
	private String lName;
	private String email;
	private String suffix;
	
	private int day;
	private int year;
	private int month;
	private int numLuggage;
	
	/*Constructors*/
	Passenger(String prefix, String fName, String mInit, String lName, String suffix) {
		this.prefix = prefix;
		this.fName = fName;
		this.mInit = mInit;
		this.lName = lName;
		this.suffix = suffix;
	}; 
	
	Passenger(String fName, String mInit, String lName) {
		this.fName = fName;
		this.mInit = mInit;
		this.lName = lName;
	}; 
	Passenger(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}; 
	Passenger(String lName) {
		this.lName = lName;
	}; 
	Passenger(){
		
	};
	
	
	/*Setters*/
	//sets prefix for passenger
	public void setPrefix(String prefix){
		this.prefix = prefix;
	};
	
	//sets first name for passenger
	public void setFName (String fName) {
		this.fName = fName;
	}; 
		
	//sets middle initial for passenger
	public void setMInit (String mInit) {
		this.mInit = mInit;
	}
	
	//sets last name for passenger
	public void setLName (String lName) {
		this.lName = lName;
	}; 

	public void setSuffix (String suffix) {
		this.suffix = suffix;
	}
	
	//sets email for passenger
	public void setEmail (String email) {
		this.email = email;
	};
	
	//sets birth date for passenger 
	public void setBirthDate (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	};
	
	public void setBirthDay (int day) {
		this.day = day;
	}
	
	public void setBirthMonth (int month) {
		this.month = month;
	}
	
	public void setBirthYear (int year) {
		this.year = year;
	}
	
	//sets number of luggage per a passenger
	public void setLuggageNum (int numLuggage) {
		this.numLuggage = numLuggage;
	}
	
	
	/*Getters*/
	//gets prefix of passenger
	public String getPrefix () {
		return prefix;
	}; 
	
	//gets first name of passenger
	public String getFName () {
		return fName;
	}; 
	
	//gets middle initial of passenger
	public String getMInit () {
		return mInit;
	}
	
	//gets last name of passenger
	public String getLName () {
		return lName;
	}; 
	
	public String getSuffix () {
		return suffix;
	}
	
	//gets email of passenger
	public String getEmail () {
		return email;
	}; 
	
	//sets birthdate of passenger
	public int[] getBirthDate() {
		int[] BirthDate = new int[]{month, day, year}; //stored in array in mm/dd/yyyy arrangement
		return BirthDate;
	}; 
	
	public int getBirthMonth() {
		return month;
	}
	
	public int getBirthDay() {
		return day;
	}
	
	public int getBirthYear() {
		return year;
	}
	
	public int setLuggageNum() {
		return numLuggage;
	}

	public void setBookingNum() {	//will set booking number for passenger
		
	}

	
}
