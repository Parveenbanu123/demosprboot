package com.mph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Food implements Serializable{
	int good=3;
}
class Fruit extends Food {
	int juice=5;
}
public class Banana extends Fruit{
	int yellow=4;
	public void serializeBanana() {
		try {
			FileOutputStream fos = new FileOutputStream("myfile1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Banana ban = new Banana();
			oos.writeObject(ban);
			System.out.println("Serialized...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Banana deserializeBanana() {
		try {
			FileInputStream fis = new FileInputStream("myfile1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Banana ban = (Banana) ois.readObject();
			return ban;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public String toString() {
		return "Banana [yellow=" + yellow + "]";
	}
	public static void main(String[] args) {
		Banana b=new Banana();
		Banana b2=new Banana();
		b.serializeBanana();
		b2=b.deserializeBanana();
		System.out.println("restore "+b2.yellow+" "+b2.juice+" "+b2.good);

	}

}
