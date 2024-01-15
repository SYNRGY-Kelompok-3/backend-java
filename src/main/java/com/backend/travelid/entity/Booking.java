package com.backend.travelid.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
@Where(clause = "deleted_date is null")
public class Booking extends AbstractDate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "total_price", nullable = false)
    private Long totalPrice;

    @Column(name = "paid", nullable = false)
    private Boolean paid;

    @Column(name = "AddOnSelectingSeat")
    private Long AddOnSelectingSeat;

    @Column(name = "AddOnLuggagePrice")
    private Long AddOnLuggagePrice;

    @Column(name = "AddOnLuggage")
    private String AddOnLuggage;

    @JsonManagedReference
    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<BookingDetail> bookingDetails = new ArrayList<>();

}

