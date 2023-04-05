package com.execute.protocol.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoryDto{
    /**
     * Конструктор копирования
     * @param categoryDto
     */
    public CategoryDto(CategoryDto categoryDto) {
        id = categoryDto.id;
        publication = categoryDto.publication;
        title = categoryDto.title;
        description = categoryDto.description;
    }

    @EqualsAndHashCode.Include
    private int id;
    private boolean publication;
    @EqualsAndHashCode.Include
    private String title;
    private String description;
}
