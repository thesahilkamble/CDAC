package com.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.entities.Room;

public interface Repository extends JpaRepository<Room, Long> {

}
