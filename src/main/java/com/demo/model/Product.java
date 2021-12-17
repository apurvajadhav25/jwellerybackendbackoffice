package com.demo.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	int id;
	String name;
	String description;
	long price;
	long discount;
	String gender;
	int rating;
	String imagePath;
	String filter1;
	String filter2;
	String filter3;
	String filter4;
	String filter5;
	String filter6;
	Boolean isEnable;

	@OneToMany(mappedBy = "product")
	Set<Image> images;
	
	public Product() {
		
	}
	
	public Product(int id) {
		super();
		this.id = id;
	}
	
	public Product(int id, String name, String description, long price, long discount, String gender, int rating,
			String imagePath, String filter1, String filter2, String filter3, String filter4, String filter5,
			String filter6,Boolean isEnable) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.gender = gender;
		this.rating = rating;
		this.imagePath = imagePath;
		this.filter1 = filter1;
		this.filter2 = filter2;
		this.filter3 = filter3;
		this.filter4 = filter4;
		this.filter5 = filter5;
		this.filter6 = filter6;
		this.isEnable = isEnable;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getFilter1() {
		return filter1;
	}
	public void setFilter1(String filter1) {
		this.filter1 = filter1;
	}
	public String getFilter2() {
		return filter2;
	}
	public void setFilter2(String filter2) {
		this.filter2 = filter2;
	}
	public String getFilter3() {
		return filter3;
	}
	public void setFilter3(String filter3) {
		this.filter3 = filter3;
	}
	public String getFilter4() {
		return filter4;
	}
	public void setFilter4(String filter4) {
		this.filter4 = filter4;
	}
	public String getFilter5() {
		return filter5;
	}
	public void setFilter5(String filter5) {
		this.filter5 = filter5;
	}
	public String getFilter6() {
		return filter6;
	}
	public void setFilter6(String filter6) {
		this.filter6 = filter6;
	}
	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}
	/*
	 * public Set<Image> getImages() { return images; } public void
	 * setImages(Set<Image> images) { this.images = images; for(Image i : images) {
	 * i.setProduct(this); } }
	 */
	

}
