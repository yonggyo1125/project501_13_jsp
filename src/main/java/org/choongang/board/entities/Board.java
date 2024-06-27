package org.choongang.board.entities;

import lombok.Builder;
import lombok.Data;
import org.choongang.board.constants.Authority;

@Data
@Builder
public class Board {
    private String bId; // 게시판 아이디
    private String bName; // 게시판 이름
    private int rowsPerPage; // 1페이지 행 수
    private int active; // 사용 여부
    private int activeCategory; // 분류 사용 여부
    //private String category; // 분류
    private Authority authority;
}
