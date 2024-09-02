package com.xblog.community.post.service;

import com.xblog.community.post.dto.AddPostDto;
import com.xblog.community.post.dto.GetPostResponse;
import com.xblog.community.post.dto.ModifyPostRequest;
import com.xblog.community.post.dto.ModifyPostResponse;

import java.util.List;

public interface PostService {
    AddPostDto createPost(AddPostDto dto, String userId);
    GetPostResponse viewPost(Long postId);
    List<GetPostResponse> getPostList(Long categoryId);
    List<GetPostResponse> getPostListByViews(Long partyId);
    ModifyPostResponse modifyPost(ModifyPostRequest dto, Long postId, String userId);
    void deletePost(Long postId);
}
