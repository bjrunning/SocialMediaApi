package org.example.specification;

import org.example.dto.PostCommentParamsDTO;
import org.example.model.PostComment;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PostCommentSpecification {
    public Specification<PostComment> build(PostCommentParamsDTO params) {
        return withPostId(params.getPostId())
                .and(withCreatedAtGt(params.getCreatedAtGt()));
    }

    private Specification<PostComment> withPostId(Long postId) {
        return (root, query, cb) -> postId == null ? cb.conjunction() : cb.equal(root.get("post").get("id"), postId);
    }

    private Specification<PostComment> withCreatedAtGt(Date date) {
        return (root, query, cb) -> date == null ? cb.conjunction() : cb.greaterThan(root.get("created_at"), date);
    }
}
