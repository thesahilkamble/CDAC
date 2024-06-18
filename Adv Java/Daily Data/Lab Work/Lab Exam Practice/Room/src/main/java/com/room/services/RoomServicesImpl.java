package com.room.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.entities.Reservation;
import com.room.entities.Room;
import com.room.repository.Repository;

@Service
@Transactional
public class RoomServicesImpl implements RoomServices {

	@Autowired
	private Repository repository;

	@Override
	public List<Room> getAllRooms() {
		return repository.findAll();
	}

	@Override
	public Room getRoomById(Long id) {
		// if(repository.existsById(id))
		return repository.findById(id).orElseThrow();
//()-> new APIResponse("Not Found"));
	}

	@Override
	public String deleteReservationById(Long id) {
		String flag = "Reservation Not Found";

		if (repository.existsById(id)) {
			repository.deleteById(id);
			flag = "Deleted Sucssefully";
			return flag;
		}
		return flag;
	}

	@Override
	public Reservation addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Reservation addReservation(Reservation reservation) {
//		return repository.save(reservation);
//		
//	}
	

}
