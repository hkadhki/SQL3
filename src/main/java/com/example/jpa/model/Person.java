package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @EmbeddedId
    private Information information;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    private City cityOfLiving;




    @Override
    public String toString(){
        return "Person{"+
                "name=" + information.getName() +
                "surname=" + information.getSurname() +
                "age=" + information.getAge() +
                "phone_number=" + phoneNumber +
                "city_of_living" + cityOfLiving.getName() + "}";
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public City getCityOfLiving(){
        return cityOfLiving;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setCityOfLiving(City cityOfLiving){
        this.cityOfLiving = cityOfLiving;
    }

    public Information getInformation(){
        return information;
    }

    public void setInformation(Information information){
        this.information = information;
    }
}
