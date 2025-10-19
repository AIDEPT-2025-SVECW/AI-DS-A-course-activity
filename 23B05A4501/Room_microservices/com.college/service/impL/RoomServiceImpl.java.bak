package com.college.service.impl;

import com.college.entity.RoomEntity;
import com.college.repository.RoomRepository;
import com.college.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repository;

    @Override
    public RoomEntity createRoom(RoomEntity room) {
        return repository.save(room);
    }

    @Override
    public List<RoomEntity> getAllRooms() {
        return repository.findAll();
    }

    @Override
    public RoomEntity getRoomById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Room not found with ID: " + id));
    }

    @Override
    public RoomEntity updateRoom(Long id, RoomEntity room) {
        RoomEntity existing = getRoomById(id);
        existing.setDept(room.getDept());
        existing.setCapacity(room.getCapacity());
        existing.setBuildingName(room.getBuildingName());
        existing.setBlock(room.getBlock());
        return repository.save(existing);
    }

    @Override
    public void deleteRoom(Long id) {
        repository.deleteById(id);
    }
}
