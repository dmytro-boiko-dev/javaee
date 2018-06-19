package com;

import com.dao.LofStatusDAO;
import com.models.LofStatusEntity;

import javax.inject.Inject;
import java.util.List;

public class DataTest {

   @Inject
    public LofStatusDAO lofStatusDAO;
    public List<LofStatusEntity> lofData() {
        return lofStatusDAO.getAllUsers();
    }

    public static void main(String[] args) {
        //System.out.println(DataTest.class.getMethod());


    }

}
