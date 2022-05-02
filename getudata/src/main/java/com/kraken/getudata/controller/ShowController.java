package com.kraken.getudata.controller;

import com.kraken.getudata.entity.Show;
import com.kraken.getudata.helper.csvHelper;
import com.kraken.getudata.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class ShowController {
    @Autowired
    private ShowService showService;

    @PostMapping("/shows/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){
        if(csvHelper.multipartfileCheck(file)){
            this.showService.save(file);
            return ResponseEntity.ok(Map.of("message", "file is uploaded and data is saved in db"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel files only.");
    }

    @GetMapping("/shows")
    public List<Show> getAllShows(){
        return this.showService.getAllShows();
    }
}
