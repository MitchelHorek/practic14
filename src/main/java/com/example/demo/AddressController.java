package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;

@RestController
public class AddressController {
    @RequestMapping(method = RequestMethod.GET, value = "/address-all")
    public ArrayList<Address> addressAll() {
        return DemoApplication.addresses;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/address-add")
    public @ResponseBody String addressAdd(@RequestParam String addressText, @RequestParam String zipCode)throws ParseException {
        DemoApplication.addresses.add(new Address(addressText, zipCode));
        return "added";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/address-delete")
    public @ResponseBody String addressDelete(@RequestParam String addressText, @RequestParam String zipCode) {
        for (Address address:DemoApplication.addresses){
            if (address.getAddressText().equals(addressText) && address.getZipCode().equals(zipCode)){
                DemoApplication.addresses.remove(address);
                break;
            }
        }
        return "deleted";
    }
}

