package com.visam.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Offers")
public class Offers {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "OffPercent")
    private int OffPercent;

    @Column(name = "OffDesc")
    private String OffDesc;
    
    @Column(name = "OffType")
    private String OffType;
    
    @Column(name = "OffCompany")
    private String OffCompany;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOffPercent() {
		return OffPercent;
	}

	public void setOffPercent(int offPercent) {
		OffPercent = offPercent;
	}

	public String getOffDesc() {
		return OffDesc;
	}

	public void setOffDesc(String offDesc) {
		OffDesc = offDesc;
	}

	public String getOffType() {
		return OffType;
	}

	public void setOffType(String offType) {
		OffType = offType;
	}

	public String getOffCompany() {
		return OffCompany;
	}

	public void setOffCompany(String offCompany) {
		OffCompany = offCompany;
	}
	
	 @Override
	    public String toString() {
	        return "Offers [id=" + id + ", OffPercent=" + OffPercent + ", OffDesc=" + OffDesc + ",OffType=" + OffType + ",OffCompany=" + OffCompany + "]";
	    }
}
