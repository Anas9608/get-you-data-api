package com.kraken.getudata.service;

import com.kraken.getudata.entity.Show;
import com.kraken.getudata.helper.csvHelper;
import com.kraken.getudata.repo.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepo showRepo;

    public void save(MultipartFile file) {
        try {
            List<Show> listOfShows = csvHelper.convertCsvToListOfShows(file.getInputStream());
            this.showRepo.saveAll(listOfShows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Show> getAllShows(){
        return this.showRepo.findAll();
    }
}