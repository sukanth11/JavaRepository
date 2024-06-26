package org.doctorapp.service;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.exception.IdNotFoundException;
import org.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorService {

    void  addDoctor(Doctor doctor);
    void  updateDoctor(int DoctorId,double doctor);
    void  deleteDoctor(int DoctorId );
    Doctor getById(int doctorId) throws IdNotFoundException;
    List<Doctor>getAll();

    List<Doctor> getAll(String speciality)throws DoctorNotFoundException;
    List<Doctor> getBySpeciality(String speciality)throws DoctorNotFoundException;

//    List<Doctor> getBySpecialityAndNameCon(String speciality, String doctorName) throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndExp(String speciality, int experience)throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndLessFee(String speciality,double fees)throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndRating(String speciality,int ratings)throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndNameContains(String speciality,String doctorName)throws DoctorNotFoundException;

//    List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException;

//    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException;
}
