package com.devsuperior.dsmeta.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_sales")
public class ReportSales implements Serializable {
    private static final long versionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sellerName;
    private int visited;
    private int deals;
    private double amount;
    private LocalDate date;

    public ReportSales() {
    }

    public ReportSales(long id, String sellerName, int visited, int deals, double amount, LocalDate date) {
        this.id = id;
        this.sellerName = sellerName;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getDeals() {
        return deals;
    }

    public void setDeals(int deals) {
        this.deals = deals;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportSales sale = (ReportSales) o;
        return id == sale.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
