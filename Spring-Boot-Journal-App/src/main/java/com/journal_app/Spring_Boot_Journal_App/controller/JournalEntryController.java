//package com.journal_app.Spring_Boot_Journal_App.controller;
//
//import com.journal_app.Spring_Boot_Journal_App.entity.JournalEntry;
//import org.apache.catalina.mapper.Mapper;
//import org.springframework.web.bind.annotation.*;
//
//import java.awt.image.ImageProducer;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//class JournalEntryController {
//
//
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    List<JournalEntry> getAll() {
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry journalEntry1 ){
//        journalEntries.put(journalEntry1.getId(), journalEntry1);
//        return true;
//    }
//
//
//    @GetMapping("/id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("/id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updateVariableById(@PathVariable Long id, @RequestBody JournalEntry journalEntry1){
//        return journalEntries.put(id, journalEntry1);
//    }
//
//}
