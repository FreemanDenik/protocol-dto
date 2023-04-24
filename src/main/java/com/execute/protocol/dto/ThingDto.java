package com.execute.protocol.dto;

import com.execute.protocol.enums.EmTarget;
import com.execute.protocol.interfaces.FastFinerDto;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ThingDto implements FastFinerDto {
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
    private EmTarget target;  // GOLD     REPUTATION  ANSWER
    //почему такое название meaning? Потому что если использовать "value" которое хочется, то падает база H2 и тесты не работают
    private int meaning;
}