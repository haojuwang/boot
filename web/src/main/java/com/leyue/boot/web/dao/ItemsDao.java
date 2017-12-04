package com.leyue.boot.web.dao;

import com.leyue.boot.web.pojo.Items;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lihao on 17/12/4.
 */
public interface ItemsDao extends JpaRepository<Items,Integer> {

    List<Items> findByName(String s);

    List<Items> findByName(String s, Pageable pageable);
}
