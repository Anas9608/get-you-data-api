package com.kraken.getudata.helper;

import com.kraken.getudata.entity.Show;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class csvHelper {
    //check if file is of excel type or not
    @Autowired
    public static boolean multipartfileCheck(MultipartFile file){
        return file.getContentType().equals("text/csv") || file.getContentType().equals("application/vnd.ms-excel");
    }
    @Autowired
    public static List<Show> convertCsvToListOfShows(InputStream is)
    {

        try{
            List<Show> list = new ArrayList<>();
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            CSVParser csvParser = new CSVParser(fileReader,
                    CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for(CSVRecord record : csvRecords) {
                Show show = new Show();
                show.setShowId(record.get(0));
                show.set_type(record.get(1));
                show.set_title(record.get(2));
                show.set_director(record.get(3));
                show.set_cast(record.get(4));
                show.setCountry(record.get(5));
                show.setDateAdded(record.get(6));
                show.setReleaseYear(Double.parseDouble(record.get(7)));
                show.set_rating(record.get(8));
                show.set_duration(record.get(9));
                show.setListedIn(record.get(10));
                show.set_description(record.get(11));

                list.add(show);
                }

            return list;


            } catch (IOException ex) {
            throw new RuntimeException("fail to parse CSV file: " + ex.getMessage());
        }

        }

    }







