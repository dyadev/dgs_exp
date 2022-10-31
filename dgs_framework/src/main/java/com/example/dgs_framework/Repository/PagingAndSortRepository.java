package com.example.dgs_framework.Repository;

import com.example.dgs_framework.Types.Show;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingAndSortRepository<S, L extends Number> extends PagingAndSortingRepository<Show, Long> {
    @NotNull
    Iterable<Show> findAll(@NotNull Sort sort);

    @NotNull
    Page<Show> findAll(@NotNull Pageable pageable);
}
