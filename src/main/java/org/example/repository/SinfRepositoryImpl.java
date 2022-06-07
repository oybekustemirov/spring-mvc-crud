package org.example.repository;

import org.example.entity.Sinf;
import org.example.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class SinfRepositoryImpl implements SinfRepository{
    JdbcTemplate jdbcTemplate;
    public SinfRepositoryImpl(DriverManagerDataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int create(Sinf sinf) {
        try {
            return jdbcTemplate.update("insert into sinf (name) values (?)", sinf.getName());
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<Sinf> read() {
        return jdbcTemplate.query("select * from sinf", BeanPropertyRowMapper.newInstance(Sinf.class));
    }

    @Override
    public Sinf findSinfById(int sinfId) {
        return jdbcTemplate.queryForObject("SELECT * FROM sinf WHERE id=?", BeanPropertyRowMapper.newInstance(Sinf.class), sinfId);
    }

    @Override
    public int update(Sinf sinf) {
        return jdbcTemplate.update("UPDATE sinf SET name=? WHERE id=?", sinf.getName());
    }

    @Override
    public int delete(int sinfId) {
        return jdbcTemplate.update("DELETE FROM sinf WHERE id=?", sinfId);
    }
}
