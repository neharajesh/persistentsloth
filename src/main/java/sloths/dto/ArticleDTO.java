package sloths.dto;

import lombok.Data;
import sloths.entities.Tag;
import sloths.entities.User;

import javax.validation.constraints.NotBlank;
import java.util.HashSet;

@Data
public class ArticleDTO {
    @NotBlank
    private String articleName;

    @NotBlank
    private User author;

    @NotBlank
    private HashSet<Tag> tagList;
}
