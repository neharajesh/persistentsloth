package sloths.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import sloths.enums.TagNames;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TagNames tagName;
}
