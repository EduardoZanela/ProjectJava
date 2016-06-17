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
		ModelAndView mv = new ModelAndView("index1");		
		return mv;
	}
	
	@RequestMapping("/relatorio")
	public ModelAndView relatorioAlfabetica(@RequestParam("param") String param){
		ModelAndView mv = new ModelAndView("relatorio");
		String psql;
		if(param.equalsIgnoreCase("nome")){
			 psql="NOME";
			 mv.addObject("colorN", "color: red");
			 mv.addObject("title", "Relatorio de clientes ordenado Alfabeticamente");
		}else if(param.equalsIgnoreCase("cidade")){
			psql="CIDADE";
			mv.addObject("colorC", "color: red");
			mv.addObject("title", "Relatorio de clientes ordenado por Cidade");
		}else if(param.equalsIgnoreCase("pais")){
			psql="PAIS";
			mv.addObject("colorP", "color: red");
			mv.addObject("title", "Relatorio de clientes ordenado por País");
		}else{
			psql="NOME";
			mv.addObject("colorN", "color: red");
			mv.addObject("title", "Relatorio de clientes ordenado Alfabeticamente");
		}
		ClienteModel cm = new ClienteModel();		
		mv.addObject("usuarios", cm.listaClientesOrdenado(psql));				
		System.out.println("psql "+psql);
		return mv;
	}
	
//	@RequestMapping("/rcidade")
//	public ModelAndView relatorioCidade(){
//		ClienteModel cm = new ClienteModel();
//		ModelAndView mv = new ModelAndView("relatorio");
//		mv.addObject("usuarios", cm.listaClientesOrdenado("CIDADE"));
//		mv.addObject("title", "Relatorio de clientes ordenado por Cidade");
//		mv.addObject("colorC", "color: red");
//		return mv;
//	}
//	
//	@RequestMapping("/rpais")
//	public ModelAndView relatorioPais(){
//		ClienteModel cm = new ClienteModel();
//		ModelAndView mv = new ModelAndView("relatorio");
//		mv.addObject("usuarios", cm.listaClientesOrdenado("PAIS"));
//		mv.addObject("title", "Relatorio de clientes ordenado por País");
//		mv.addObject("colorP", "color: red");
//		return mv;
//	}
	
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
