package com.backend.travelid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetailDTO {
    private FlightDTO flight;
    private String customerName;
    private String phoneNumber;
    private String seatNumber;
    private Long totalSeatPrice;
    private String category; // adult, child, infant
}

