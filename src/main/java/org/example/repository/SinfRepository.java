package org.example.repository;

import org.example.entity.Sinf;

import java.util.List;

public interface SinfRepository {
    public int create(Sinf sinf);

    public List<Sinf> read();

    public Sinf findSinfById(int sinfId);

    public int update(Sinf sinf);

    public int delete(int sinfId);
}
