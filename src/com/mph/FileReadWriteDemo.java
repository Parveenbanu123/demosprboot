package com.mph;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
	public void writeToFile() {
		try(FileWriter fw=new FileWriter("files.txt")){
			fw.write("Hello Everybody");
			System.out.println("Written on file...");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void readFromFile() {
		try(FileReader fr=new FileReader("files.txt")){
			int ch;
			while((ch=(fr.read()))!=-1) {
				System.out.print((char)ch);
			}
			System.out.println();
			System.out.println("Reading Done...");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FileReadWriteDemo f=new FileReadWriteDemo();
		f.writeToFile();
		f.readFromFile();

	}

}
