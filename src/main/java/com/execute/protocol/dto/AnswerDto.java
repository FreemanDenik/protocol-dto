package com.execute.protocol.dto;

import lombok.*;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AnswerDto {
    /**
     * Конструктор копирования
     * @param answerDto
     */
    public AnswerDto(AnswerDto answerDto) {
        id = answerDto.id;
        useOnce = answerDto.useOnce;
        answerText = answerDto.answerText;
        gold = answerDto.gold;
        reputation = answerDto.reputation;
        influence = answerDto.influence;
        shadow = answerDto.shadow;
        luck = answerDto.luck;
        giveThings = answerDto.giveThings.stream().map(ThingDto::new).collect(Collectors.toSet());
        ifThings = answerDto.ifThings.stream().map(ThingDto::new).collect(Collectors.toSet());
        linkEvent = answerDto.linkEvent;
        openCategories = answerDto.openCategories.stream().map(CategoryDto::new).collect(Collectors.toSet());
        closeCategories = answerDto.closeCategories.stream().map(CategoryDto::new).collect(Collectors.toSet());
    }

    @EqualsAndHashCode.Include
    private int id;
    private boolean useOnce;
    @EqualsAndHashCode.Include
    private String answerText;
    private byte gold;
    private byte reputation;
    private byte influence;
    private byte shadow;
    private byte luck;
    private Set<ThingDto> giveThings;
    private Set<ThingDto> ifThings;
    private int linkEvent;
    private Set<CategoryDto> openCategories;
    private Set<CategoryDto> closeCategories;
   // private EventDto event;

}
