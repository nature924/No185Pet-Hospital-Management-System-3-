package com.forest.demo.Controller;

import com.forest.demo.Entity.Forest_PetsEntity;
import com.forest.demo.Entity.Forest_VetDoctorEntity;
import com.forest.demo.Service.Forest_PetsService;
import com.forest.demo.Service.Forest_VetDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//D:\images\
@RestController
public class Forest_fileUploadController {
    Forest_PetsEntity forest_petsEntity=new Forest_PetsEntity();
    Forest_VetDoctorEntity forest_vetDoctorEntity=new Forest_VetDoctorEntity();
     @Autowired
     Forest_PetsService forest_petsService;
    @Autowired
    Forest_VetDoctorService forest_vetDoctorService;
    /**
     * 将图片存在对应文件中  宠物
     */
    @RequestMapping("upload")
    public Map fileUpload(@RequestParam MultipartFile file,String Forest_Pets_ID, HttpServletRequest request){
        Map map = new HashMap();
        boolean rs = false;
        if(!file.isEmpty()){
            String fileName = System.currentTimeMillis()+file.getOriginalFilename();
            forest_petsEntity.setForest_Pets_ID(Integer.parseInt(Forest_Pets_ID));
            forest_petsEntity.setForest_Pets_Photo(fileName);
            forest_petsService.ForestPetsEntityUpdate(forest_petsEntity);
            String savePath = "D:\\images\\";
            File dest = new File(savePath+File.separator+fileName);
            try {
                file.transferTo(dest);
                rs = true;
                map.put("result",rs);
            } catch (IOException e) {
                e.printStackTrace();
                map.put("result",rs);
            }
        }
        else if (file.isEmpty()){
            map.put("result",rs);
        }
        return map;
    }
    /**
     * 将图片存在对应文件中  宠物
     */
    @RequestMapping("uploadAdministrator")
    public Map uploadAdministrator(@RequestParam MultipartFile file,String Forest_VetDoctor_ID, HttpServletRequest request){
        Map map = new HashMap();
        boolean rs = false;
        if(!file.isEmpty()){
            String fileName = System.currentTimeMillis()+file.getOriginalFilename();
            forest_vetDoctorEntity.setForest_VetDoctor_ID(Integer.parseInt(Forest_VetDoctor_ID));
            forest_vetDoctorEntity.setForest_VetDoctor_Image(fileName);
            forest_vetDoctorService.ForestVetDoctorEntityUpdate(forest_vetDoctorEntity);
            String savePath = "D:\\images\\";
            File dest = new File(savePath+File.separator+fileName);
            try {
                file.transferTo(dest);
                rs = true;
                map.put("result",rs);
            } catch (IOException e) {
                e.printStackTrace();
                map.put("result",rs);
            }
        }
        else if (file.isEmpty()){
            map.put("result",rs);
        }
        return map;
    }
}
