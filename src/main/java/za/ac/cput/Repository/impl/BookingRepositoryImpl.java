//package za.ac.cput.Repository.impl;
//
//import za.ac.cput.Entity.Booking;
//import java.util.*;
//
//@Deprecated
//public class BookingRepositoryImpl implements BookingRepository {
//
//    private Set<Booking> bookings;
//    private static BookingRepository repository = null;
//
//    public BookingRepositoryImpl() {
//        this.bookings = new HashSet<>();
//    }
//
//    @Override
//    public Booking create(Booking booking) {
//        this.bookings.add(booking);
//        return booking;
//    }
//
//    @Override
//    public Booking update(Booking booking) {
//      Booking read = read(booking.getBookID());
//      if(read != null) {
//          this.bookings.remove(read);
//          this.bookings.add(booking);
//          return booking;
//      }
//      return null;
//    }
//
//    @Override
//    public Booking read(String bookID) {
//        for (Booking booking : this.bookings) {
//            if(booking.getBookID().equalsIgnoreCase(bookID))
//                return booking;
//        }
//        return null;
//
//    }
//
//    @Override
//    public void delete(String s) {
//        Booking booking = read(s);
//        if (booking != null) this.bookings.remove(booking);
//    }
//
//    @Override
//    public Set<Booking> getall() {
//        return this.bookings;
//    }
//
//}
