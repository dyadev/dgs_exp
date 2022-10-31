package com.example.dgs_framework.Services.Implementation;

import com.example.dgs_framework.Services.ShowService;
import com.example.dgs_framework.Types.Show;
import com.example.dgs_framework.Types.ShowInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowServiceImpl implements ShowService {
    @Override
    public List<Show> getList() {
        return List.of(
                Show.newBuilder().title("Title1").releaseYear(2022).build(),
                Show.newBuilder().title("Title1").releaseYear(2022).build(),
                Show.newBuilder().title("Title1").releaseYear(2022).build(),
                Show.newBuilder().title("Title1").releaseYear(2022).build()
        );
    }

    @Override
    public Show addShow(ShowInput showInput) {
        return Show.newBuilder().title("Title1").releaseYear(2023).build();
    }
//    private ShowRepository showRepository;
//
//    @Override
//    public List<Show> getList(){
//        return showRepository.findAll();
//    }
//
//    @Override
//    public Show addShow(ShowInput showInput) {
//        return showRepository.save(
//                Show.newBuilder()
//                .title(showInput.getTitle())
//                .releaseYear(showInput.getReleaseYear())
//                .build()
//        );
//    }
}
