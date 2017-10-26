Public class searchEngine{
  String departSearch;
  String arrivalSearch;
  String departureDate;
  String arrivalDate;
  int numOfAdults;
  int numOfChildren; 
  String returnDate;
  String multiCity1;
  String multiCity2;
  String multiCity3;
  String flight1Date;
  String flight2Date;
  String flight3Date;
  //One way
  Public String flightSearch(String dep, String arr, String depD, int numAd, int numCh){
    departSearch = dep;
    arrivalSearch = arr;
    departureDate = depD;
    arrivalDate = arrD;
    numOfAdults = numAd;
    numOfChildren = numCh;
  }
  //Round-Trip
  //Scratch the code below, create new params & call the one way flight search multiple times.
  Public String flightSearch(String dep, String arr, String depD, String retD, int numAd, int numCh){
    /*
    departSearch = dep;
    arrivalSearch = arr;
    departureDate = depD;
    returnDate = retD;
    numOfAdults = numAd;
    numOfChildren = numCh;
    flightSearch()
    */
  }
  //Multi-City
  //Scratch the code below, create new params & call the one way flight search multiple times.
  Public String flightSearch(String city1, String city2, String city3, String firstDate, String secondDate, String thirdDate, int numAd, int numCh){
    /*
    multiCity1 = city1;
    multiCity2 = city2;
    multiCity3 = city3;
    flight1Date = firstDate;
    flight2Date = secondDate;
    flight3Date = thirdDate;
    numOfAdults = numAd;
    numOfChildren = numCh;
    */
  }

}
