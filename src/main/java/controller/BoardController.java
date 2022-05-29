package controller;

import com.study.board.entity.Board;
import com.study.board.respository.BoardRepository;
import com.study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;




    @GetMapping("/board/write")
    public String boardwriteForm() {

        return "boardwrite";
    }
    @PostMapping("/board/writepro")
    public String boardwritePro(Board board) {
        boardService.write(board);
        return "";
    }
}

