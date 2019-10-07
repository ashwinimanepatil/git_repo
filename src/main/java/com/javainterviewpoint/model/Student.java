package com.javainterviewpoint.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="STUDENT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Student")
public class Student implements Serializable
{
    private static final long serialVersionUID = -1232395859408322328L;

    @Id
    @Column(name="PRODUCTID")
    private long productId;
    
    @Column(name="PRODUCTNAME")
    private String productName;
    
    @Column(name="PRODUCTPRICE")
    private long productPrice;
    
    @Column(name="PRODUCTSTATUS")
    private String productStatus;
    
    @Column(name="PRODUCTIMG")
    private String productImg;
    
    

    public Student()
    {
        super();
    }
    public Student(long productId, String productName, long productPrice, String productStatus, String productImg)
    {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productName = productName;
        this.productStatus = productStatus;
        this.productImg = productImg;
    }
    
   
    
    public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	@Override
    public String toString()
    {
        return "Student [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ",productStatus=" + productStatus + ",productImg=" + productImg + "]";
    }
}
