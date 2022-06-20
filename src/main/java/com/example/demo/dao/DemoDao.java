package com.example.demo.dao;

import com.example.demo.domain.Demo;
import com.example.demo.entity.DemoEntity;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class DemoDao {

    private DemoRepository demoRepository;
    private DemoMapper demoMapper;

    public Demo find(String id){
        try{
            Optional<DemoEntity> entity = demoRepository.findById(id);
            return demoMapper.toDomain(entity.get());
        } catch(Exception e){
            System.out.println("Excepcion en base de datos");
            return null;
        }
    }

    public Void insert(Demo demo){
        try{
            DemoEntity demoEntity = demoMapper.toEntity(demo);
            demoRepository.saveAndFlush(demoEntity);
            return null;
        } catch(Exception e){
            System.out.println("Excepcion en base de datos");
        }
        return null;
    }

}
