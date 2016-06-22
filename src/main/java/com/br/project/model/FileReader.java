package com.br.project.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.br.project.bean.ClienteBean;

public class FileReader {
	
	ClienteBean cliente = new ClienteBean();
	ClienteModel model = new ClienteModel();
	
	public void read( ) throws Exception {
		 try{
			//Le o arquivo e coloca em buffer
			File file = new File ("C:\\Users\\Felipe\\Documents\\ProjetoEngenharia\\ProjectJava\\uploads\\cc.txt");
            FileInputStream arquivo = new FileInputStream(file);
            InputStreamReader ler = new InputStreamReader(arquivo);
            BufferedReader x = new BufferedReader(ler);
            String name = x.readLine();
            while(name != null) {
                cliente.setNome(name);
                System.out.println("Nome: "+name);
                cliente.setCidade(x.readLine());
                cliente.setEstado(x.readLine());
                cliente.setPais(x.readLine());
                cliente.setBirthdate(x.readLine());
                cliente.setCivil(x.readLine());
                cliente.setSexo(x.readLine());
                cliente.setProfissao(x.readLine()); 
                name = x.readLine();                
                model.gravar(cliente);
            }
        }catch(Exception e){
            System.out.println(""+e);
            e.getStackTrace();
        }

	}
}