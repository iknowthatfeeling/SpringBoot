package com.rabbit.form.board;

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
public class Board {

	@Id
	private String boardId;
	
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
	
    @Column(columnDefinition = "TINYINT")
	private int recommendChat;

}
