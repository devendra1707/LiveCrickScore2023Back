package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;

public interface CricketService {

    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();



}
