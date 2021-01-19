package com.deng.o2o.dao;

import com.deng.o2o.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AreaDao {
    List<Area> queryArea();
}
