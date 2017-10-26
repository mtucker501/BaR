Public class Flight {
	String airDepart; //airport that passengers are departing from
	String airArrival; //airport that passengers are flying to
	int numSeats; //number of seats available on airplane
	int planeNumber; //plane identification number
	String airline; //name of plane’s airline
 	int gate; //flight gate


	//constructors
	flight (String _airDepart, String _airArrival, int _numSeats, int _planeNumber, String _airline, int _gate,) {
		airDepart =  _airDepart; //airport that passengers are departing from
		airArrival =  _airArrival;
		numSeats =  _numSeats; 
		planeNumber = _planeNumber; 
		airline = _airline; 
		gate =  _gate; 
	}
  string departSearch;
  string arrivalSearch;
  string departureDate;
  string arrivalDate;
  int numOfAdults;
  int numOfChildren; 
  string returnDate;
  string multiCity1;
  string multiCity2;
  string multiCity3;
  //One way
  Public String flightSearch(string dep, string arr, string depD, int numAd, int numCh){
    departSearch = dep;
    arrivalSearch = arr;
    departureDate = depD;
    arrivalDate = arrD;
    numOfAdults = numAd;
    numOfChildren = numCh;
  }
  //Round-Trip
  Public String flightSearch(string dep, string arr, string depD, string retD, int numAd, int numCh){
    departSearch = dep;
    arrivalSearch = arr;
    departureDate = depD;
    returnDate = retD;
    numOfAdults = numAd;
    numOfChildren = numCh;
  }
  //Multi-City
  string flight1Date;
  string flight2Date;
  string flight3Date
  Public String flightSearch(string city1, string city2, string city3, string firstDate, string secondDate, string thirdDate, int numAd, int numCh){
    multiCity1 = city1;
    multiCity2 = city2;
    multiCity3 = city3;
    flight1Date = firstDate;
    flight2Date = secondDate;
    flight3Date = thirdDate;
    numOfAdults = numAd;
    numOfChildren = numCh;
  }

	//getters
	Public String getAirDepart(){
		return _airDepart;
	}
	Public String getAirArrivalt(){
		return _airArrival;
	}
	Public int getNumseats(){
		return _numSeats;
	}
	Public int getPlaneNumber(){
		return  _planeNumber;
	}
	Public String getAirliner(){ 
		return  _airline;
	}
	Public int getGate(){
		return   _gate;
	}
	
	//Setters
	Public void setAirDepart(){  
		airDepart =  _airDepart; 
	}
	Public void setAirArrivalt(){ 
		airArrival =  _airArrival;
	}
	Public void setNumseats(){ 
		numSeats =  _numSeats; 
 	}
	Public void setPlaneNumber(){
		planeNumber = _planeNumber; 
	}
	Public void setAirliner(){ 
		airline = _airline; 
	}
	Public void setGate(){ 
		gate =  _gate; 
	}
}
