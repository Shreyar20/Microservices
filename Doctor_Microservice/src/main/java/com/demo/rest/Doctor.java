package com.demo.rest;

import javax.persistence.*;
import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter

@Entity
@Table(name="Doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="ID")
	private int id;

	@Column(name="AMOUNT")
	private long amount;

	@Column(name="APPOINTMENTDATE")
	private Date appointementDate;

}
