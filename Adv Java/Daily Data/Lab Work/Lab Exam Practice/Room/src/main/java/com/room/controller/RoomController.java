package com.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.room.entities.Reservation;
import com.room.services.RoomServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	private RoomServices services;
	
	@GetMapping
	public ResponseEntity<?> getAllRooms(){
		return ResponseEntity.status(HttpStatus.OK).body(services.getAllRooms());
	}
	
	@PutMapping
	public ResponseEntity<?> addReservation (@RequestBody Reservation reservation){
		
		return ResponseEntity.status(HttpStatus.OK).body(services.addReservation(reservation));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteReservation (@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(services.deleteReservationById(id));
	}

}
