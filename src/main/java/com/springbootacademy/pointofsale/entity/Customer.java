package com.springbootacademy.pointofsale.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "Customers")
@TypeDefs({
        @TypeDef(name ="json",typeClass = JsonType.class)
})
public class Customer {

    @Id
    @Column(name = "customer_id", length = 45)
    private int customerId;

    @Column(name = "customer_name", length = 100,nullable = false)
    private String customerName;

    @Column (name = "customer_address", length = 255)
    private String customerAddress;


    @Type(type = "json")
    @Column(name = "contact_number", columnDefinition = "json")
    private ArrayList contactNumber;
}
