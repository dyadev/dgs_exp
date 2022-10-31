package com.example.dgs_framework.Services;


import com.example.dgs_framework.Types.Show;
import com.example.dgs_framework.Types.ShowInput;

import java.util.List;

public interface ShowService {
    List<Show> getList();
    Show addShow(ShowInput showInput);
}
