package com.company.project.model;

import javax.persistence.*;

public class Funds {
    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    private Double funds;

    private String date;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return funds
     */
    public Double getFunds() {
        return funds;
    }

    /**
     * @param funds
     */
    public void setFunds(Double funds) {
        this.funds = funds;
    }

    /**
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
}