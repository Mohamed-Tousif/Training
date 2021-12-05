package com.sonata;

public class TShirt {

	String material;	
	String color;
	String design;
		public TShirt(String mtrl, String colr, String dsgn) {
			this.material=mtrl;
			this.color=colr;
			this.design=dsgn;
		}
		
		public void display() {
			System.out.println("Product material is :" + material);
			System.out.println("Product color is:" + color);
			System.out.println("Product design is:" + design);
			
		}
		public static void main(String[] args) {
			TShirt small = new TShirt("Cotton","Green", "Round Neck") ;
			TShirt large = new TShirt("Sport", "Blue", "Sports wear") ;
			TShirt xtralarge = new TShirt("Wool", "Black", "Polo") ;
			System.out.println("Small size TShirt:");
			small.display();
			
			System.out.println("\n Large size TShirt: ");
			large.display();
			
			System.out.println("\n xtralarge size TShirt:");
			xtralarge.display();
		}

	}
