package com.execute.protocol.dto;

import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EventDto {
    @EqualsAndHashCode.Include
    private int id;
    private boolean useOnce;
    private CategoryDto category;
    @EqualsAndHashCode.Include
    private String eventText;
    private Set<AnswerDto> answers;

}