package com.journal_app.Spring_Boot_Journal_App.controller;

import com.journal_app.Spring_Boot_Journal_App.entity.JournalEntry;
import com.journal_app.Spring_Boot_Journal_App.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
class JournalEntryControllerV2 {

    @Autowired
    public JournalEntryService journalEntryService;



    @GetMapping
    List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry journalEntry1 ){
        journalEntry1.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(journalEntry1);
        return journalEntry1;
    }


    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId) {
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable ObjectId myId) {
        return journalEntryService.deleteById(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateVariableById(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry){
        JournalEntry old = journalEntryService.findById(id).orElse(null);
        if(old != null){
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() !=null && !newEntry.equals("") ? newEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }


}
