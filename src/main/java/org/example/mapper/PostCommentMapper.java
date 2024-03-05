package org.example.mapper;

import org.example.dto.PostCommentDTO;
import org.example.model.PostComment;
import org.mapstruct.*;

@Mapper(
        uses = {JsonNullableMapper.class, ReferenceMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class PostCommentMapper {
    @Mapping(source = "author.id", target = "authorId")
    @Mapping(source = "post.id", target = "postId")
    public abstract PostCommentDTO map(PostComment model);
}
