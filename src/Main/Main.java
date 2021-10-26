package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import book.Book;

public class Main {

	@SuppressWarnings("preview")
	public static void main(String[] args) throws IOException {
		Book b1 = new Book("mihai",5.2,"ALba",34);
		Book b2 = new Book("mihnea",5.2,"ne",34);
		Book b3 = new Book("c",5.2,"3",34);
		ArrayList<Book> arrayList = new ArrayList<Book>();
		try {
			FileOutputStream f = new FileOutputStream(new File(b1.getId().toString()));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(b1);
			o.writeObject(b2);
			o.writeObject(b3);
			o.close();
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage() + "-----");
		}
		try{
			FileInputStream fi = new FileInputStream(new File(b1.getId().toString()));
			ObjectInputStream oi = new ObjectInputStream(fi);
			while(true) 
			try{
				arrayList.add((Book)oi.readObject());
			}catch(Exception e) {
				break;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage() +"******");
		}
		File myFile = new File("books.txt");
		FileWriter myWriter = new FileWriter("booksText.txt");
		for(Book book : arrayList) {
			myWriter.write(book.toString());
			myWriter.write(System.getProperty("line.separator"));
		}
		myWriter.close();
		

	}

}
