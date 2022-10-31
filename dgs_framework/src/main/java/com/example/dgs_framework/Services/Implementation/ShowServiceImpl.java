package com.example.dgs_framework.Services.Implementation;

import com.example.dgs_framework.Repository.ShowRepository;
import com.example.dgs_framework.Services.ShowService;
import com.example.dgs_framework.Types.Show;
import com.example.dgs_framework.Types.ShowInput;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowServiceImpl implements ShowService {

    @Autowired
    ShowRepository showRepository;

    @Override
    public List<Show> getList() {
        return (List<Show>) showRepository.findAll();
    }

    @Override
    public Show addShow(ShowInput showInput) {
        return showRepository.save(
                Show.newBuilder()
                        .title(showInput.getTitle())
                        .releaseYear(showInput.getReleaseYear())
                        .build()
        );
    }

    @Override
    public Long countOfData() {
        return showRepository.count();
    }

    @Override
    public Page<Show> showByPage(PageRequest request) {
        return showRepository.findAll(request);
    }

    @Override
    public List<Show> getContentFromPage(Page<?> page) {
        return (List<Show>) page.getContent();
    }
}
