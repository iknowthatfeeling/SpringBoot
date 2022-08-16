package com.rabbit.form.board;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardDTO {


	private String boardId;
	private String rabbitUser_rabbitUserId;
	private String boardTitle;
	private String boardDate;
	private int boardView;
	private String boardContent;
	private int recommendChat;
    
    @Builder
    public BoardDTO(String boardTitle,String boardDate, int boardView, String boardContent, int recommendChat) {
   this.boardTitle = boardTitle;
   this.boardDate = boardDate;
   this.boardView = boardView;
   this.boardContent = boardContent;
   this.recommendChat = recommendChat;
   
    	
    }

}
