package com.altran.igjava.demoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@SpringBootApplication
public class DemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class);
    }
}

@RestController
class AddressController {

    @RequestMapping(path = "/addresses", produces = MediaType.APPLICATION_XML_VALUE)
    public NAW getAddresses() {
        return new NAW("Floren de Gier", "Herculesplein" , 24, "3500AB","Utrecht" );
    }

}


@XmlRootElement(name="NAW")
class NAW {

    //@XmlElement(name="name")
    private String name;

    //@XmlElement(name="street")
    private String street;

    //@XmlElement(name="number")
    private int number;

    //@XmlElement(name="zip")
    private String zip;

    //@XmlElement(name = "city")
    private String city;

    public NAW() {

    }

    public NAW(String name, String street, int number, String zip, String city) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}