package com.room.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long roomId;
	@Column
	public int roomNumber;
	@Column
	public String type;
	@Column
	public double price;
	@Column
	public boolean availabilty;
}
