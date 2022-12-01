package com.jcompany;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public BoardEntity getBoard(Long boardId) {
		return boardRepository.findById(boardId).orElseThrow(() -> 
        		new RestException(HttpStatus.NOT_FOUND, "Not found board"));
	}

}