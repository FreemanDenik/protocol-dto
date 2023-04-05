package com.execute.protocol.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ThingDto {
    /**
     * Конструктор копирования
     * @param thingDto
     */
    public ThingDto(ThingDto thingDto) {
        id = thingDto.id;
        publication = thingDto.publication;
        title = thingDto.title;
        description = thingDto.description;
    }

    @EqualsAndHashCode.Include
    private int id;
    private boolean publication;
    @EqualsAndHashCode.Include
    private String title;
    private String description;
//    private EmAction action;
//    private EmTarget target;
//    private int count;
}