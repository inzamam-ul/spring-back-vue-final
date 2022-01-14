package com.student.management.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "stuno", unique = true, nullable = false)
    private int stuno;
    private String stuname;
    private String studept;
    private String stuage;
    private String director;
       @Override
    public String toString() {
        return "Student [director=" + director + ", stuage=" + stuage + ", studept=" + studept + ", stuname=" + stuname
                + ", stuno=" + stuno + "]";
    }



    public Student(int stuno, String stuname, String studept, String stuage, String director) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.studept = studept;
        this.stuage = stuage;
        this.director = director;
    }




    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStudept() {
        return studept;
    }

    public void setStudept(String studept) {
        this.studept = studept;
    }

    public String getStuage() {
        return stuage;
    }

    public void setStuage(String stuage) {
        this.stuage = stuage;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

 

    public Student() {
    }

   



}
