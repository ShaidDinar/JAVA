// package HW_3_1;

/**
 * @author shaid_dinar
 *
 */
public class Airplane {
public String name;
public int bithYear;
public double weight;
public char gender;


private Passenger [] passengers;
private String airplaneName;
private int numPassengers;
  

public Airplane() {
passengers = new Passenger[100];
airplaneName = "";
numPassengers = 0;
}
public Airplane(String name) {
passengers = new Passenger[100];
airplaneName = name;
numPassengers = 0;
}
public Airplane(int size) {
if(size<0)size=0;
passengers = new Passenger[size];
airplaneName = "";
numPassengers = 0;
}
public Airplane(String name , int size) {
if(size<0)size=0;
passengers = new Passenger[size];
airplaneName = name;
numPassengers = 0;
}
public void addPassenger(Passenger passenger) {
if(numPassengers == passengers.length)return;
passengers[numPassengers++] = passenger;
}

public String getAirplaneName() {
return airplaneName;
}
public Passenger getPassenger(int index) {
if(index<0 || index>=numPassengers)return null;
return passengers[index];
}
public int getNumPassengers() {                    
return numPassengers;
}
public Passenger getFirstPassenger() {
if(numPassengers ==0)return null;
return passengers[0];
}
public Passenger getLastPassenger() {
if(numPassengers ==0)return null;
return passengers[numPassengers-1];
}
public Passenger[] getPassengers() {
return passengers;
}
public void setAirplaneName(String name) {
airplaneName = name;
}
public void printAllDetails() {
System.out.printf("AirplaneName: %20s\n",airplaneName);
System.out.printf("Number of Passengers: %4d\n",numPassengers);
System.out.printf("AirplaneSize: %4d\n",passengers.length);
for(int i=0;i<passengers.length;i++) {
System.out.printf("Name:%20s | Year of Birth: %4d | Weight:%10.2f | Gender:%c\n"
,passengers[i].name,passengers[i].birthYear,passengers[i].weight,passengers[i].gender);
}
}

public Passenger removePassenger(int index) {
if(index<0 || index>=numPassengers)return null;
Passenger passenger = passengers[index];
numPassengers--;
for(int i=index;i<numPassengers;i++) {
passengers[i] = passengers[i + 1];
}
return passenger;
}
public void removeAllPassengers() {
for(int i=0;i<numPassengers;i++) {
passengers[i] = null;
}
numPassengers = 0;
}

public double getTotalWeightOfAllPassengers() {
    double totalWeight = 0.0;
    for (int i = 0; i < numPassengers; i++) {
        Passenger passenger = passengers[i];
        if (passenger != null) {  // check if passenger reference is not null
            totalWeight += passenger.getWeight();
        }
    }
    return totalWeight;
}
 public double getAverageWeightOfAllPassengers() {
      if (numPassengers == 0) {
          return 0;
      } else {
          return getTotalWeightOfAllPassengers() / numPassengers;
      }
  }
  
  public int getNumberOfPassengersAboveWeight(double weight) {
      int count = 0;
      for (int i = 0; i < numPassengers; i++) {
          if (passengers[i].getWeight() > weight) {
              count++;
          }
      }
      return count;
  }
  
  public int getNumberOfPassengersBelowWeight(double weight) {
      int count = 0;
      for (int i = 0; i < numPassengers; i++) {
          if (passengers[i].getWeight() < weight) {
              count++;
          }
      }
      return count;
  }
  
  public void increaseWeightOfAllPassengers() {
      increaseWeightOfAllPassengers(1.0);
  }
  
  public void increaseWeightOfAllPassengers(double amount) {
      for (int i = 0; i < numPassengers; i++) {
          passengers[i].gainWeight(amount);
      }
  }
} 