package com.mph;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Forest implements Serializable{
	private Tree tree=new Tree();
	public static void main(String[] args) {
		Forest f=new Forest();
		try {
			FileOutputStream fos=new FileOutputStream("Forest.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(f);
			oos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
//class Tree{
//	
//}
