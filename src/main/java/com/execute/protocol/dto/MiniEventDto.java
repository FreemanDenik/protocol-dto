package com.execute.protocol.dto;

import lombok.*;

import java.util.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MiniEventDto {
    private int id;
    private String title;
    private String description;

    private boolean isShadow;
    private Map<String, Integer> openCarts;
    public MiniEventDto(MiniEventDto miniEventDto) {
        id = miniEventDto.getId();
        title = miniEventDto.getTitle();
        description = miniEventDto.description;
        isShadow = miniEventDto.isShadow;
        openCarts = new HashMap<>(miniEventDto.openCarts);
    }
}
