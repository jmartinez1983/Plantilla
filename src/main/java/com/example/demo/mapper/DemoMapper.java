package com.example.demo.mapper;

import com.example.demo.domain.Demo;
import com.example.demo.entity.DemoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel="spring")
public interface DemoMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    Demo toDomain(DemoEntity demoEntity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    DemoEntity toEntity(Demo demo);
}
