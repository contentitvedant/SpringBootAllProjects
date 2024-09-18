package com.airMytrip.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.airMytrip.domain.FlightReservation;

@Repository
public class ReservationDao implements Dao<FlightReservation> {
	
	
	private List<FlightReservation> reservationsList= new ArrayList<FlightReservation>();

	@Override
	public Optional<FlightReservation> get(Integer id) {
		if(!reservationsList.isEmpty()) {
			return Optional.of(reservationsList.get(id));
		}
		return Optional.empty();
	}

	@Override
	public int save(FlightReservation t) {
		int userId = reservationsList.size();
		t.setId(userId);
		reservationsList.add(t);
		System.out.println("Succssfully Booked!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" +userId);
		return userId;
	}

}
//@Repository
//@Scope("singleton")
//public class StudentUserDAO implements DAO<StudentUser>{
//	
//	private List<StudentUser> studentUserList = new ArrayList<StudentUser>();
//
//	@Override
//	public Optional<StudentUser> get(Integer id) {
//		if(!studentUserList.isEmpty()) {
//			return Optional.of(studentUserList.get(id));
//		}
//		return Optional.empty();
//	}
//
//	@Override
//	public int save(StudentUser student) {
//		int userId = studentUserList.size();
//		student.setId(userId);
//		studentUserList.add(student);
//		System.out.println("Student Saved"+userId);
//		return userId;
//	}
//
//}
