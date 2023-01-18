package com.example.hello;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public Map<String, Object> findByEmployee(String id) {
    // SELECT文
    String Query = "SELECT * FROM employee WHERE id = ?";

    // 検索の実行
    Map<String, Object> employee = jdbcTemplate.queryForMap(Query, id);

    return employee;
  }
}
