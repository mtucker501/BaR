Public class Flight {
	String airDepart; //airport that passengers are departing from
	String airArrival; //airport that passengers are flying to
	int departTime; //Arrival time
	int arrivalTime; //Departure time
	int numSeats; //number of seats available on airplane
	int planeNumber; //plane identification number
 	int gate; //flight gate
	int flightNumber; //Flight Number

	//Constructors
	Flight (String _airDepart, String _airArrival, int _numSeats, int _planeNumber, int _gate, int _departTime, int _arrivalTime) {
		airDepart =  _airDepart; //airport that passengers are departing from
		airArrival =  _airArrival;
		numSeats =  _numSeats; 
		planeNumber = _planeNumber; 
		flightNumber = _flightNumber;
		gate =  _gate; 
		arrivalTime = _arrivalTime;
		departTime = _departTime;
	}
  
	//getters
	Public String getAirDepart(){
		return _airDepart;
	}
	Public String getAirArrival(){
		return _airArrival;
	}
	Public int getNumseats(){
		return _numSeats;
	}
	Public int getPlaneNumber(){
		return  _planeNumber;
	}
	Public int getFlightNumber(){
		return  _flightNumber;
	}
	}
	Public int getGate(){
		return   _gate;
	}
	Public int getDepartTime(){ 
		return _departTime; 
	}
	Public int getArrivalTime(){ 
		return _arrivalTime;
	}
	
	//Setters
	Public void setAirDepart(){  
		airDepart =  _airDepart; 
	}
	Public void setAirArrival(){ 
		airArrival =  _airArrival;
	}
	Public void setNumseats(){ 
		numSeats =  _numSeats; 
 	}
	Public void setPlaneNumber(){
		planeNumber = _planeNumber; 
	}
	Public void setFlightNumber(){
		flightNumber = _flightNumber; 
	}
	Public void setGate(){ 
		gate =  _gate; 
	}
	Public void setDepartTime(int _departTime){ 
		departTime =  _departTime; 
	}
	Public void setArrivalTime(int _arrivalTime){ 
		arrivalTime =  _arrivalTime; 
	}
}
