package com.springbook.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAOSpring;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardDAO boardDAO;
//	private LogAdvice log;
	//CRUD 기능의 메소드 구현
	// 글 등록
	
//	public BoardServiceImpl() {
//		log = new LogAdvice();
//	}
	
	public void insertBoard(BoardVO vo) {
//		if(vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다");
//		}
//		log.printLog();
		boardDAO.insertBoard(vo);
	}

	// 글 수정
	public void updateBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.updateBoard(vo);
	}

	//글 삭제
	public void deleteBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.deleteBoard(vo);
	}

	//글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoard(vo);
	}

	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
//		log.printLog();
		return boardDAO.getBoardList(vo);
	}

}