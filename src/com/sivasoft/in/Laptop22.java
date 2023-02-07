package com.sivasoft.in;

import java.util.Comparator;

public class Laptop22 implements Comparator {
	 String name;
	  int ram;
	  int price;
	 public Laptop22(String name, int ram, int price) {
			super();
			this.name = name;
			this.ram = ram;
			this.price = price;
		}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int compare(Laptop o1, Laptop o2) {
		   if (o1.getRam() < o2.getRam()) {
		      return -1;
		   }else if (o1.getRam() > o2.getRam()) {
		      return 1;
		   } else {
		      return 0;
		   }
		}
	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}
