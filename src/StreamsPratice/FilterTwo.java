package StreamsPratice;

import java.util.ArrayList;
import java.util.List;

/*
 * Here iam gona bulid the product for laptop , which i will be creating multiple objects 
 * for product class and comparing its respective prices which is above 20,000 and printing its name and price for each object 
 */

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class FilterTwo {

	public static void main(String[] args) {
		
		List<Product> p1 = new ArrayList<>();
		
		p1.add(new Product(101,"HP",15000));
		p1.add(new Product(102,"Lenovo",20000));
		p1.add(new Product(103,"sony",17000));
		p1.add(new Product(104,"Apple",40000));
		
		p1.stream()
		           .filter(p->p.price>=20000)
		           .forEach(i->System.out.println(i.name+" "+i.price));
		
	}

}
