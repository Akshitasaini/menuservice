package com.spicy.kitchen.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@ToString
@Table(name = "menu")
// public enum type{veg(-1) , nonVeg(1);
//public final int value;	
//}
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
    private String id;
	
	 @Column(name = "name")
	    private String itemName;
	
	    @Column(name = "price")
	    private Double price;

	    @Column(name = "tax")
	    private Double tax;

	    @Column(name = "ingredients")
	    private String ingredients;
	    
	    @Column(name = "type")
	    private String   type;
	    
	    @Column(name = "Description")
	    private String itemDescription;



	

}
