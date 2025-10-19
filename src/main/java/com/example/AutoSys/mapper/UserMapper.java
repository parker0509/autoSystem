package com.example.AutoSys.mapper;

import com.example.AutoSys.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    User findByAll();

    void insert(User user);

    void delete(Long id);

    void update(User user);

    User findById(Long id);
}
