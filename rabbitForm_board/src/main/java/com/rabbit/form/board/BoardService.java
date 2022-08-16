package com.rabbit.form.board;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository boardRepository;
	
//	public Long create(BoardDTO boardDTO) {
//	return boardRepository.save(boardDTO.toEntity()).getRabbitUserId();
//	}
}
