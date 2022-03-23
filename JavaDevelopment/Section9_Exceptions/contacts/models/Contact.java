package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
  private String name;
  private String phoneNumber;
  private String birthDate;
  private int age;

  public Contact(String name, String phoneNumber, String birthdate) throws ParseException{
    if(name==null || name.isBlank()){
      throw new IllegalArgumentException("Name can not be null");
    }
    if(phoneNumber==null || phoneNumber.isBlank()){
      throw new IllegalArgumentException("Phone number can not be null");
    }

    if(phoneNumber.length()<5){
      throw new IllegalArgumentException("Phoen number can not be less than 5 digits");
    }

    this.name=name;
    this.phoneNumber=phoneNumber;
    this.birthDate=birthdate;
    this.age=toAge(birthdate);
  }


  public Contact(Contact source) throws ParseException{
    this.name=source.name;
    this.phoneNumber=source.phoneNumber;
    this.birthDate=source.birthDate;
    this.age=source.age;
  }
  
  public String getName() {
      return name;
  }

  public String getPhoneNumber() {
      return phoneNumber;
  }

  public int getAge() {
      return age;
  }

  public String getBirthDate() {
      return birthDate;
  }

  public void setAge(int age) {
      this.age = age;
  }
  public void setBirthDate(String birthDate) throws ParseException{
      this.birthDate = birthDate;
      setAge(toAge(birthDate));
  }
  public void setPhoneNumber(String phoneNumber) {
    if(phoneNumber==null || phoneNumber.isBlank()){
      throw new IllegalArgumentException("Phone number can not be blank");
    }

    if(phoneNumber.length()<5){
      throw new IllegalArgumentException("Phone number can not be less than 5 characters");
    }
      this.phoneNumber = phoneNumber;
  }

  public void setName(String name) {
    if(name==null || name.isBlank()){
      throw new IllegalArgumentException("Name can not be set to null value");
    }
      this.name = name;
  }
  
  public int toAge(String birthDate) throws ParseException{
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    formatter.setLenient(false); //If we pass invalid format example date = 111/12/1988 it will fail
    Date toDate= formatter.parse(birthDate);
    long toMilli= toDate.getTime();
    long diff = new Date().getTime()-toMilli;
    return (int)TimeUnit.MILLISECONDS.toDays(diff)/365;
  }

  public String toString(){
    return this.name+this.age+this.phoneNumber+this.birthDate;
  }

}
