package com.mtechlabs.springboot.springit.model.domain.doa;

import com.mtechlabs.springboot.springit.model.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
