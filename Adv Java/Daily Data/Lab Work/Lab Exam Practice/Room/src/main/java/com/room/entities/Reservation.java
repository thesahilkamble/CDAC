package com.room.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long reservationId;
	public String guestName;
	public LocalDateTime checkInDate;
	public LocalDateTime checkOutDate;
	public int roomId;
	public double totalPrice;
	
}
