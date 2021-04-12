package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;

@RestController
public class BuildingController {
    @RequestMapping(method = RequestMethod.GET, value = "/building-all")
    public ArrayList<Building> buildingAll() {
        return DemoApplication.buildings;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/building-add")
    public @ResponseBody String buildingAdd(Building building)throws ParseException {
        DemoApplication.buildings.add(building);
        return "added";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/building-delete")
    public @ResponseBody String buildingDelete(Building building) {
        for (Building building1:DemoApplication.buildings){
            if (building.getCreationDate().equals(building1.getCreationDate()) && building.getType()==building1.getType()){
                DemoApplication.buildings.remove(building);
                break;
            }
        }
        return "deleted";
    }
}
