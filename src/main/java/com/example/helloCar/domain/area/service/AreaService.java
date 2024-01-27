package com.example.helloCar.domain.area.service;

import com.example.helloCar.domain.area.entity.Area;
import com.example.helloCar.domain.area.repository.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AreaService {
    private final AreaRepository areaRepository;

    public void save(Area area){
        this.areaRepository.save(area);
    }
}
