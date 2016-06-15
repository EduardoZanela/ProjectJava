package com.br.project.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReader {
	public void read( ) throws Exception {
		 // TODO Auto-generated method stub
        try{
            System.out.println("Entrou!");
            String aa = System.getProperty("user.dir");
            File file = new File ("C:\\Users\\Eduardo\\Documents\\ProjectEngenier\\Projeto\\ProjectJava\\uploads\\cc.txt");
            System.out.println(file.getAbsolutePath()+aa);
            FileInputStream arquivo = new FileInputStream(file);
            InputStreamReader ler = new InputStreamReader(arquivo);
            BufferedReader x = new BufferedReader(ler);
            String linha = x.readLine();
            while(linha != null) {
                String Tipo = linha;
                String Nome = linha;
                String Campo = linha;
                System.out.println(Tipo);
                System.out.println(Nome);
                System.out.println(Campo);
                linha = x.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
            e.getStackTrace();
        }

	}
}