package com.execute.protocol.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoryDto {
    @EqualsAndHashCode.Include
    private int id;
    @EqualsAndHashCode.Include
    private String title;
    private String description;
}
