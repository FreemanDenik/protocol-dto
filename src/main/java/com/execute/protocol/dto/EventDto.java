package com.execute.protocol.dto;

import com.execute.protocol.interfaces.FastFinerDto;
import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EventDto implements FastFinerDto {
    /**
     * Конструктор копирования
     * @param eventDto
     */
    public EventDto(EventDto eventDto) {
        id = eventDto.id;
        useOnce = eventDto.useOnce;
        publication = eventDto.publication;
        child = eventDto.child;
        shadow = eventDto.shadow;
        category = new CategoryDto(eventDto.category);
        eventText = eventDto.eventText;
        answers = eventDto.getAnswers().stream().map(AnswerDto::new).collect(Collectors.toSet());
    }

    @EqualsAndHashCode.Include
    private int id;
    private boolean useOnce;
    private boolean publication;
    private boolean shadow;
    private boolean child;
    private CategoryDto category;
    @EqualsAndHashCode.Include
    private String eventText;
    private AnswerDto ownAnswer;
    private Set<AnswerDto> answers;
    private Map<String, Integer> openCarts;
    @Override
    public String getTitle() {
        return eventText;
    }
    @Override
    public String getDescription() {
        return null;
    }
}