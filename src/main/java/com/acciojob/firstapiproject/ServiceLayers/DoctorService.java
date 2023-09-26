package com.acciojob.firstapiproject.ServiceLayers;


import com.acciojob.firstapiproject.RepositoryLayers.DoctorRepositoryLayer;
import com.acciojob.firstapiproject.RepositoryLayers.PatientRepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    //This is all focused on the doctor layer...



    @Autowired
    private DoctorRepositoryLayer doctorRepositoryLayer;

    @Autowired
    private PatientRepositoryLayer patientRepositoryLayer;

}
