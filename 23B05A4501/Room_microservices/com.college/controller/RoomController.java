package com.college.controller;

import com.college.entity.RoomEntity;
import com.college.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService service;

    // Updated for 23B05A4501:  Create Room
    @PostMapping
    public ResponseEntity<RoomEntity> createRoom(@RequestBody RoomEntity room) {
        return ResponseEntity.ok(service.createRoom(room));
    }

    // Updated for 23B05A4501:  Get All Rooms
    @GetMapping
    public ResponseEntity<List<RoomEntity>> getAllRooms() {
        return ResponseEntity.ok(service.getAllRooms());
    }

    // Updated for 23B05A4501:  Get Room by ID
    @GetMapping("/{id}")
    public ResponseEntity<RoomEntity> getRoomById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getRoomById(id));
    }

    // Updated for 23B05A4501:  Update Room
    @PutMapping("/{id}")
    public ResponseEntity<RoomEntity> updateRoom(@PathVariable Long id, @RequestBody RoomEntity room) {
        return ResponseEntity.ok(service.updateRoom(id, room));
    }

    // Updated for 23B05A4501:  Delete Room
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long id) {
        service.deleteRoom(id);
        return ResponseEntity.noContent().build();
    }
}
