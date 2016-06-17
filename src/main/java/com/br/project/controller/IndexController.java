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

import com.br.project.model.ClienteModel;
import com.br.project.model.FileReader;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public ModelAndView index(){
		//Example to send object to JSP
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("profession", true);
		return mv;
	}
	
	@RequestMapping("/ralfabetica")
	public ModelAndView relatorioAlfabetica(){
		ClienteModel cm = new ClienteModel();
		ModelAndView mv = new ModelAndView("ralfabetico");
		mv.addObject("usuarios", cm.listalfabetica());
		return mv;
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public @ResponseBody ModelAndView handleFileUpload(@RequestParam("file") MultipartFile file){
		if (!file.isEmpty()) {
			try {

               byte[] bytes = file.getBytes();

               // Create the file on server
               File serverFile = new File("C:\\Users\\Felipe\\Documents\\ProjetoEngenharia\\ProjectJava\\uploads\\" + File.separator + "cc.txt");
               BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
               stream.write(bytes);
               stream.close();
               FileReader fr = new FileReader();
               fr.read();
               return index();

            } catch (Exception e) {
            	e.printStackTrace();
                return new ModelAndView("error");
            }
        }      
        else {
            return index();
        }
	}
	
}
