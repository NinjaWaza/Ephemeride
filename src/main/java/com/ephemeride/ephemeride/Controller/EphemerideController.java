package com.ephemeride.ephemeride.Controller;

import com.ephemeride.ephemeride.DTO.EphemerideDTO;
import com.ephemeride.ephemeride.Repository.EphemerideRepository;
import com.fasterxml.jackson.core.io.JsonEOFException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.time.format.DateTimeFormatter;


@Controller
@RequestMapping(value = "/ephemeride")
public class EphemerideController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity getTodayInformations(){
        LocalDate localDate = LocalDate.now();
        EphemerideDTO ephemerideDTO = new EphemerideDTO();

        ephemerideDTO.setDateJour(localDate.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy")));
        ephemerideDTO.setFeteDuJour("aze");
        ephemerideDTO.setJourAnnee(localDate.getDayOfYear());
        ephemerideDTO.setJoursRestants(365-localDate.getDayOfYear());
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        ephemerideDTO.setNumSemaine(localDate.get(weekFields.weekOfWeekBasedYear()));
        return new ResponseEntity(null,null, HttpStatus.OK);
    }

    public JSONObject getJsonData(String url){
        JSONObject jsons = null;
        try{
            jsons = EphemerideRepository.readJsonFromUrl(url);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return jsons;
    }
}
