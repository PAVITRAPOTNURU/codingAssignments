package com.pi.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Product {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class ProductImplementation {
	int sumOfPrice(ArrayList<Product> productList) {
			int sum=0;
			for(Product i: productList)
			{
				sum+=i.getPrice();
			}
			return sum;
	}
	float  maxPrice(ArrayList<Product> productList) {
		float max=productList.get(0).getPrice();
		for(Product i:productList)
		{
			if(i.getPrice()>max)
			{
				 max=i.getPrice();
			}
		}
		return max;
		
	}
	float  minPrice(ArrayList<Product> productList) {
		float min=productList.get(0).getPrice();
		for(Product i:productList)
		{
			if(i.getPrice()<min)
			{
				min=i.getPrice();
			}
		}
		return min;
		
	}
List<String> getProductNameList(ArrayList<Product> productList) {
		ArrayList<String> namesList=new ArrayList<>();
		for(int i=0;i<productList.size();i++)
		{
			namesList.add(productList.get(i).getName());
		}
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		ProductImplementation pa=new ProductImplementation();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
		
	}
}
