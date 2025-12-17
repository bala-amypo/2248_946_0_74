package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
public class Student {
  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  private String name;
  private String email;
  private float cgpa;
  private String course;
  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getCourse() {
      return course;
  }

  public void setCourse(String course) {
      this.course = course;
  }

  public float getCgpa() {
      return cgpa;
  }

  public void setCgpa(float cgpa) {
      this.cgpa = cgpa;
  }
  public Student(int id, String name, String email, float cgpa, String course) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.cgpa = cgpa;
      this.course = course;
  }
  public Student(){
    
  }
}