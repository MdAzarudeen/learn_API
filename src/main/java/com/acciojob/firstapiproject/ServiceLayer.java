package com.acciojob.firstapiproject;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceLayer {

    RepositoryLayer repositoryLayerObj = new RepositoryLayer();


    public String addUser(UserInfo userInfo){

        String result = repositoryLayerObj.addUserToDb(userInfo);
        return result;
    }

    public List<UserInfo> getAllUsers(){

        List<UserInfo> ansList = repositoryLayerObj.getAllUsers();
        return ansList;
    }


    public List<UserInfo> getFilterAgePeople(int lessAge,int greaterAge) {

        List<UserInfo> allUsers = repositoryLayerObj.getAllUsers();

        //Filtering part

        List<UserInfo> ansList = new ArrayList<>();

        for(UserInfo userInfo:ansList) {
            if(userInfo.getAge()>=greaterAge && userInfo.getAge()<= lessAge){
                ansList.add(userInfo);
            }
        }
        return ansList;
    }

    public List<String> getNames(){

        List<UserInfo> allUsers = repositoryLayerObj.getAllUsers();

        List<String> namesList = new ArrayList<>();

        for(UserInfo info : allUsers){
            namesList.add(info.getName());
        }
        return namesList;


    }




}
