package za.ac.cput.Repository.impl;

import za.ac.cput.Entity.Booking;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Entity.UserBooking;

@Repository
public interface UserBookingRepository extends JpaRepository <UserBooking, String> {

}
