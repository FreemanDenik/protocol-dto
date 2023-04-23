package com.execute.protocol.dto;

import com.execute.protocol.interfaces.FastFinerDto;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoryDto implements FastFinerDto {
    /**
     * Конструктор копирования
     * @param categoryDto
     */
    public CategoryDto(CategoryDto categoryDto) {
        id = categoryDto.id;
        publication = categoryDto.publication;
        title = categoryDto.title;
        description = categoryDto.description;
        eventCount = categoryDto.eventCount;
    }
    private long eventCount;
    @EqualsAndHashCode.Include
    private int id;
    private boolean publication;
    @EqualsAndHashCode.Include
    private String title;
    private String description;
}
