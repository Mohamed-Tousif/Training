package com.sonata;

public class Product {
		
	int prodtId;
		String prodtName;
		double prodtPrice;
		double totalPrice;
		
	public Product() {
			
		}
		public Product(int id,String name,double price) {
			this.prodtId = id;
			this.prodtName = name;
			this.prodtPrice = price;
		}
		
		public void display() {
			System.out.println("Product ID is:" + prodtId);
			System.out.println("Product Name is :" + prodtName);
			System.out.println("Product Price is:" + prodtPrice);
			System.out.println("Total Price with GST is : " + totalPrice);
		}
		
		public double totalPrice() {
			totalPrice = prodtPrice + (prodtPrice*0.18);
			return totalPrice;
		}
		public static void main(String[] args) {
			Product p1 = new Product(123, "Toy", 600);
			p1.totalPrice();
			p1.display();
		}

	}

