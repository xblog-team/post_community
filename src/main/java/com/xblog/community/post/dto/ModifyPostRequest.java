package com.xblog.community.post.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModifyPostRequest {
    private String title;
    private String content;
    private Long categoryId;
}
