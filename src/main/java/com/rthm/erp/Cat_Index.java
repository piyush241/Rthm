package com.rthm.erp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demo")
public class Cat_Index {
	@Id
	@Column
	private String cat_name;
	@Column
	private int cat_id;
	@Column
	private int s_id;
	
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	/*
	 * public Cat_Index() {
	 * 
	 * }
	 */

	/*
	 * public Cat_Index(String cat_name,int cat_id, int s_id) { super();
	 * this.cat_name = cat_name; this.cat_id = cat_id; this.s_id = s_id; }
	 */
	public static Object findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}