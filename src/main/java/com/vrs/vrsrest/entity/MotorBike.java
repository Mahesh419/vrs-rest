package com.vrs.vrsrest.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("MotorBike")
public class MotorBike extends Vehicle {

	@Column(name = "start")
	private String start;

	@Column(name = "diskbreak")
	private Boolean diskbreak;

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public Boolean isDiskbreak() {
		return diskbreak;
	}

	public void setDiskbreak(Boolean diskbreak) {
		this.diskbreak = diskbreak;
	}
	
	

}
