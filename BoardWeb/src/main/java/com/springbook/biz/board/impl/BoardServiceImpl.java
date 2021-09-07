package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOMybatis boardDAOMybatis;

	public void insertBoard(BoardVO vo) {
//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAOMybatis.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAOMybatis.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAOMybatis.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAOMybatis.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAOMybatis.getBoardList(vo);
	}
}