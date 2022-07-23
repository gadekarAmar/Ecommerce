package com.app.pojos;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dept_tbl")
@Getter
@Setter
public class Department extends BaseEntity {
	//name , location
	@Column(name="dept_name",length =20,unique = true )
	private String deptName;
	@Column(length = 30)
	private String location;
	public Department() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", location=" + location + "]";
	}
	

}
