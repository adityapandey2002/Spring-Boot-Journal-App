package com.journal_app.Spring_Boot_Journal_App.repostitory;

import com.journal_app.Spring_Boot_Journal_App.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {


    }


