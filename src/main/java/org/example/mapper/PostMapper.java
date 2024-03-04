package org.example.mapper;

import org.example.dto.PostCreateDTO;
import org.example.dto.PostDTO;
import org.example.dto.PostUpdateDTO;
import org.example.model.Post;
import org.mapstruct.*;

@Mapper(
        uses = { JsonNullableMapper.class, ReferenceMapper.class },
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class PostMapper {
    @Mapping(target = "author", source = "authorId")
    public abstract Post map(PostCreateDTO dto);

    @Mapping(source = "author.id", target = "authorId")
    public abstract PostDTO map(Post model);

    public abstract void update(PostUpdateDTO dto, @MappingTarget Post model);
}
