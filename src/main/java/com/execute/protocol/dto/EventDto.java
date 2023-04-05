package com.execute.protocol.dto;

import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EventDto {
    /**
     * Конструктор копирования
     * @param eventDto
     */
    public EventDto(EventDto eventDto) {
        id = eventDto.id;
        useOnce = eventDto.useOnce;
        publication = eventDto.publication;
        child = eventDto.child;
        category = new CategoryDto(eventDto.category);
        eventText = eventDto.eventText;
        answers = eventDto.getAnswers().stream().map(AnswerDto::new).collect(Collectors.toSet());
    }

    @EqualsAndHashCode.Include
    private int id;
    private boolean useOnce;
    private boolean publication;
//    private int parentEvent;
//    private int ownEvent;
//    private int ownAnswer;
    private boolean child;
    private CategoryDto category;
    @EqualsAndHashCode.Include
    private String eventText;
    private Set<AnswerDto> answers;

}