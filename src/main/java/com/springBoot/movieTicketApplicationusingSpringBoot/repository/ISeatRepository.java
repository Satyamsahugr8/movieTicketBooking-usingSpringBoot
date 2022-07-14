package com.springBoot.movieTicketApplicationusingSpringBoot.repository;

import com.springBoot.movieTicketApplicationusingSpringBoot.Entity.Seat;

public interface ISeatRepository {
public Seat bookSeat(Seat seat);
public Seat cancelSeatBooking(Seat seat);
public Seat blockSeat(Seat seat); //not available for any booking 
}
