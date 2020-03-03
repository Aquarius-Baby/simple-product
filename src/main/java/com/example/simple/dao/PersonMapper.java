package com.example.simple.dao;

import com.example.simple.entity.Person;
import org.apache.ibatis.annotations.*;


@Mapper
public interface PersonMapper {
    @Select("select * from person where id = #{id}")
    Person getPersonById(int id);

    @Insert("INSERT INTO  person  (name, age, sex, address) VALUES (#{name},#{age},#{sex},#{address})")
    int addPerson(Person person);

    @Update("UPDATE person set name = #{name}, age= #{age}, sex = #{sex}, address = #{address} where id = #{id}")
    int update(Person person);
}
