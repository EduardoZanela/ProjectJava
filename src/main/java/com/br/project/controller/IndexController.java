package com.br.project.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public @ResponseBody ModelAndView handleFileUpload(@RequestParam("file") MultipartFile file){
		if (!file.isEmpty()) {
            try {

                byte[] bytes = file.getBytes();

                // Creating the directory to store file
                String rootPath = System.getProperty("C://Users//Eduardo");
                
                System.out.println(file.getName());
                
                File dir = new File(rootPath + File.separator + "tmpFiles");

                if (!dir.exists())
                   dir.mkdirs();
               
               // Create the file on server
               File serverFile = new File("C://Users//Eduardo" + File.separator + file.getOriginalFilename());
               BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
               stream.write(bytes);
               stream.close();


               return index();

            } 

            catch (Exception e) {
            	e.printStackTrace();
                return new ModelAndView("error");
            }
        }      
        else {
            return index();
        }
	}
	
}
