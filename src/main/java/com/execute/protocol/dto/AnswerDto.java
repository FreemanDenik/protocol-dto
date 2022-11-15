package com.execute.protocol.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AnswerDto{
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
    private Set<ThingDto> addThings;
    private Set<ThingDto> ifThings;
    private int link;
    private Set<CategoryDto> openCategories;
    private Set<CategoryDto> closeCategories;
   // private EventDto event;
}
