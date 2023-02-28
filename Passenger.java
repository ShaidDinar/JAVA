// package HW_3_1;

public class Passenger {
	public String name;
	public int birthYear;
	public double weight;
	public char gender;
	public int numCarryOn;
	
	public Passenger() {
		this.name = "" ;
		this.birthYear = 1900;
		this.weight = 0.0;
		this.gender = 'u';
		this.numCarryOn = 0;
		
		Passenger p1 = new Passenger("Tiger", 2008, 123.45, 'f', 1);  
		p1.printDetails();                                            
	}
 public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
	 
	this.name = name;
	this.birthYear = birthYear;
	if(weight < 0)
	   this.weight = 0;
	else
		this.weight = weight;
	setWeight(weight);
	this.gender = gender;
	setGender(gender);
	this.numCarryOn = numCarryOn;
	setNumcarryOn(numCarryOn);
	
	}
	
 public int calculateAge(int currentYear) {
	 if (currentYear < this.birthYear)
		 return -1;
	 return currentYear - this.birthYear;
 }
 
 public void gainWeight() { if(this.weight>0) this.weight += 1; //added today
	 
 }
 public void gainWeight(double weight)       {  if(weight>0) {
	 this.weight += weight; 
	 
 } else {   this.weight = Math.max(this.weight + weight, 0);  } }
 
 
 
 public String getName() {
	 return name;
 }
public int getBirthYear() {
	return birthYear;
}
public double getWeight() { 
	return weight ;
}
public char getGender() {
	return gender ;
}

public int getNumCarryOn() {
	return numCarryOn;
}

public boolean isFemale() {
	return this.gender == 'f' || this.gender == 'F' ;
}

public boolean isMale() {
	return this.gender == 'm'||this.gender == 'M' ;
}
public void loseWeight() {
	if(this.weight>=1)
	this.weight -= 1;
}

public void loseWeight(double weight) {
	if(this.weight >= weight)
		this.weight -= weight;
}
public void setName(String name) { this.name=name; }
public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
public void setWeight(double weight) {
    if (weight < 0) {
        this.weight = -1;
    } else {
        this.weight = weight;
    }
}

public void setGender(char gender) { if (gender != 'f'&& gender != 'F' && gender != 'm'&& gender != 'M')  //changing ||
this.gender = 'u' ;
else  this.gender = gender;
}

public void setNumcarryOn(int numCarryOn) 

{ if (numCarryOn < 0) { this.numCarryOn = 0; } else if (numCarryOn >2) { this.numCarryOn =2 ; } else { this.numCarryOn = numCarryOn; } }              // { this.numCarryOn = numCarryOn ; }

public void printDetails() { 
	System.out.printf("Name: %20s | year of Birth: %4d | Weight: %10.2f| Gender:%c|NumCarryOn: %2d\n",
			
			this.name, this.birthYear, this.weight, this.gender, this.numCarryOn);
}
}