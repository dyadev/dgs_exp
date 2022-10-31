package com.example.dgs_framework.Services;


import com.example.dgs_framework.Types.Show;
import com.example.dgs_framework.Types.ShowInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ShowService {
    List<Show> getList();
    Show addShow(ShowInput showInput);
    Long countOfData();
    Page<Show> showByPage(PageRequest request);
    List<Show> getContentFromPage(Page<?> page);
}
