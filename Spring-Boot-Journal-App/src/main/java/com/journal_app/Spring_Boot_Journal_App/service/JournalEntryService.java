package com.journal_app.Spring_Boot_Journal_App.service;

import com.journal_app.Spring_Boot_Journal_App.entity.JournalEntry;
import com.journal_app.Spring_Boot_Journal_App.repostitory.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }

    public JournalEntry deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
        return null;
    }


}
