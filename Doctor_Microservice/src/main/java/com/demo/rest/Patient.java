package com.demo.rest;

import javax.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
@Table(name="PATIENT ")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="ID")
	private long id;

	@Column(name="P_NAME")
	private String username;

	@Column(name="EMAILID")
	private String contact;
	
	@Column(name="DISEASE_NAME")
	private String disease_name;

	@Column(name="DISEASE_DESCRIPTION")
	private String symptoms;


}
