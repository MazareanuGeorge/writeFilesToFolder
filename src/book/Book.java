package book;

import java.io.Serializable;
import java.util.UUID;

public class Book implements Serializable {
		private String author;
		private double price;
		private String name;
		private int amount;
		private static String id = "books";
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public Book(String author, double price, String name, int amount) {
			super();
			this.author = author;
			this.price = price;
			this.name = name;
			this.amount = amount;
		}
		@Override
		public String toString() {
			return "Book [author=" + author + ", price=" + price + ", name=" + name + ", amount=" + amount + "]";
		}
		public String getId() {
			return id;
		}
		
		
}
