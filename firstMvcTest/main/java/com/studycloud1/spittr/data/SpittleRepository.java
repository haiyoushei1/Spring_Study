package com.studycloud1.spittr.data;

import com.studycloud1.spittr.dao.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
