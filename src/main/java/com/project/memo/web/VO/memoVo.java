package com.project.memo.web.VO;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class memoVo {
    String title;
    String content;
    boolean important;
    String uuid;
//    int bookMark;
}