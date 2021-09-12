package com.example.pojo;
import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "product")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String productName;
    private Integer noOfUnitsCarton;
    private Double priceOfCarton;
    private BigInteger productImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNoOfUnitsCarton() {
        return noOfUnitsCarton;
    }

    public void setNoOfUnitsCarton(Integer noOfUnitsCarton) {
        this.noOfUnitsCarton = noOfUnitsCarton;
    }

    public Double getPriceOfCarton() {
        return priceOfCarton;
    }

    public void setPriceOfCarton(Double priceOfCarton) {
        this.priceOfCarton = priceOfCarton;
    }

    public BigInteger getProductImage() {
        return productImage;
    }

    public void setProductImage(BigInteger productImage) {
        this.productImage = productImage;
    }
}
