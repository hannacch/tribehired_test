package com.tribehired.test.Service;

import java.util.List;

import com.tribehired.test.Model.Comment;
import com.tribehired.test.Model.PostComment;

public interface PostService {
	
	List<PostComment> list();
	
	List<Comment> search(Long postId, Long id, String name, String email, String body);

}
