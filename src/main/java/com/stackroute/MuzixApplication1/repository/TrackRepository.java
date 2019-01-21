package com.stackroute.MuzixApplication1.repository;

import com.stackroute.MuzixApplication1.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer>
{


}
