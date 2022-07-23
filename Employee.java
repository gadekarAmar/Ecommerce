package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="emp_tbl")
@Getter
@Setter
public class Employee extends BaseEntity{
//name adr salary joindate + Department dept
	@Column(length = 20)
	private String name;
	@Column(length = 40)
	private String address;
	private double salary;
	@Column(name="join_date")
	private LocalDate joinDate;
	//Many to One uni dir asso Dept 1<----- *Emp
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dept_id")
	private Department department;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", joinDate=" + joinDate
				+ "]";
	}
	
}
