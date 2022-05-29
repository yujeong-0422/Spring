package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.respository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    public void write(Board board) {
        boardRepository.save(board);
    }
}