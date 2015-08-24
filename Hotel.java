/*
  the Hotel is an ArrayList of Reservations
  it allows a person to request a room and cancel their reservation
  also we can add more rooms
*/

import java.util.ArrayList;

public class Hotel {
    //instance variable, ArrayList tracks current reservations
  private ArrayList rooms;

    //constructors, can specify how many rooms to start with
    //default is 5 rooms
  public Hotel() {
    rooms = new ArrayList();
    rooms.ensureCapacity(5);
      for (int i = 0; i < 5; i++)
        rooms.add(null);
  }
  public Hotel(int numRooms) {
    rooms = new ArrayList();
    rooms.ensureCapacity(numRooms);
      for(int i = 0; i < numRooms; i++)
        rooms.add(null);
  }
  //adds more rooms to the hotel, returns true on success
  public boolean buildRooms(int num) {
  //make sure the parameter is valid
    if (num<=0)
      return false;
  //increase the capacity of the Vector
    rooms.ensureCapacity(rooms.size() + num);
    for(int i = 0; i < num; i++)
      rooms.add(null);
  //report succes
    return true;
  }
  //reserves and returns an available room
  //or returns -1 if the hotel is full
  public int reserveRoom(String person){

  }
  //reserves a particular room for this person
  //returns false on failure (eg. room is already reserved)
  public boolean reserveRoom(String person, int roomNum){

  }
  //cancels all reservations by this person
  public void cancelReservations(String person){

  }
  //prints out all the current reservations to the screen
  //also should display the total number of reservations and vacancies
  public void printReservations(){

  }
}