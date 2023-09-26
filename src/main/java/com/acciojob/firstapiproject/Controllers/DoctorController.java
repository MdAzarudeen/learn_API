package com.acciojob.firstapiproject.Controllers;

import com.acciojob.firstapiproject.ServiceLayers.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor") //just acting like a prefix
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    //This talks about doctor API's
}
