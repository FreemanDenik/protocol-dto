package com.execute.protocol.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SearchFinerDto {
    @EqualsAndHashCode.Include
    private String search;
    // Исключенные из поиска коллекция id категории
    private Set<Integer> excludes;

    public Set<Integer> getExcludes() {
        return excludes.size() == 0 ? null : excludes;
    }
}
