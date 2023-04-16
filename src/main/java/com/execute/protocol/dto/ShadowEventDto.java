package com.execute.protocol.dto;

import com.execute.protocol.interfaces.FastFinerDto;
import lombok.*;

import java.util.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ShadowEventDto implements FastFinerDto {
    private int id;
    private String title;
    private String description;
    private boolean publication;
    private boolean isShadow;
    private Map<String, Integer> openCarts;
    public ShadowEventDto(ShadowEventDto shadowEventDto) {
        id = shadowEventDto.getId();
        title = shadowEventDto.getTitle();
        description = shadowEventDto.description;
        isShadow = shadowEventDto.isShadow;
        openCarts = new HashMap<>(shadowEventDto.openCarts);
    }


}
