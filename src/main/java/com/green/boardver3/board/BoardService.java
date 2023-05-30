package com.green.boardver3.board;

import com.green.boardver3.board.model.BoardDto;
import com.green.boardver3.board.model.BoardInsDto;
import com.green.boardver3.board.model.BoardListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper MAPPER;

    @Autowired
    public BoardService(BoardMapper mapper){
        this.MAPPER = mapper;
    }

    public int postBoard(BoardInsDto dto){
        return MAPPER.insBoard(dto);
    }

    public List<BoardListVo> selBoardList (BoardDto dto){
        dto.setStartIdx((dto.getPage()-1) * dto.getRowLen());
        return MAPPER.selBoardList(dto);
    }

}