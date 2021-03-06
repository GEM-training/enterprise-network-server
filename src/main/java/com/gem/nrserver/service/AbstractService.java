package com.gem.nrserver.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by kimtung on 2/24/16.
 */
public interface AbstractService<TYPE, ID> {
    Long count();
    boolean exists(ID id);
    void create(TYPE dto);
    void update(TYPE dto) throws Exception;
    TYPE findOne(ID id) throws Exception;
    Page<TYPE> findAll(Pageable pageable);
    void delete(ID id);
}
