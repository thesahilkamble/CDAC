package com.room.services;

import java.util.List;

import com.room.entities.Reservation;
import com.room.entities.Room;

public interface RoomServices {
	
	List<Room> getAllRooms();
	Room getRoomById(Long id);
	String deleteReservationById(Long id);
	Reservation addReservation(Reservation reservation);

}
