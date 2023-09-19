package com.acciojob.firstapiproject;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class APIClass {

    HashMap<Integer,UserInfo> userInfoDb = new HashMap<>();


    @PostMapping("/addUser")
    public String addUserToDb(@RequestParam("userId")Integer userId,
                              @RequestParam("emailId")String emailId,
                              @RequestParam("name")String name,
                              @RequestParam("age")Integer age){


        System.out.println("We have the values of userId"+userId+" and emailId"+emailId+" and name is "+name+" and age is "+age);


        //Actually you have created an object with the params
        UserInfo obj = new UserInfo(name,age,emailId,userId);
        userInfoDb.put(userId,obj);

        return "User has been added to the database successfully";

    }

    @GetMapping("/getUserByUserId")
    public UserInfo getUserInfoByUserId(@RequestParam("userId")Integer userId){

        UserInfo responseObj = userInfoDb.get(userId);

        return responseObj;
    }

    @GetMapping("/findAllUsers")
    public List<UserInfo> findAllUsers(){

        //This can be a shortcut way
        //return userInfoDb.values().stream().toList();

        List<UserInfo> ansList = new ArrayList<>();

        for(UserInfo obj:userInfoDb.values()){
            ansList.add(obj);
        }
        return ansList;

    }


    @GetMapping("/findOnlyNames")
    List<String> getNamesOfRegisteredPeople() {

        List<String> ansList = new ArrayList<>();

        for(UserInfo obj : userInfoDb.values()){
            ansList.add(obj.getName());
        }
        return ansList;



    }



    @GetMapping("/sayHello")
    public String sayHello(){

        return "Hello Everybody !!! you are doing amazing work !! Keep the spirits high";

    }

    @GetMapping("/howzTheJosh")
    public String joshResponse(){


        //Any processing can be done and anything you want to do :

        return "The josh is very High Sir !!!";

    }





}
