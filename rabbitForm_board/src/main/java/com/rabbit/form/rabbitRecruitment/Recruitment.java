package com.rabbit.form.rabbitRecruitment;

import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Recruitment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String recruitmentBoardId;
	
	@Column(length = 30)
	private String rabbitUser_rabbitUserId;
	
	@Column(length = 45)
	private String boardTitle;

	@Column(length = 10)
	private String boardDate;

	@Column
	private int boardView;
	
	@Column(columnDefinition = "TEXT")
	private String boardContent;
	
	@Column(length = 10)
	private String categorize;

	@Column(length = 45)
	private String productTitle;
	
	@Column(length = 10)
	private String director;
	
	@Column(length = 10)
	private String role;
	
	@Column(length = 25)
	private String period;
	
	@Column(length = 25)
	private String paid;

	@Column
	private int peopleNum;
	
	@Column(length = 10)
	private String gender;

	@Column(length = 10)
	private String incharge;

	@Column(length = 45)
	private String email;

	@Column(length = 20)
	private String deadline;
	
}
