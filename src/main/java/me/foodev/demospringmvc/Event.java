package me.foodev.demospringmvc;

import lombok.*;

import java.time.LocalDateTime;


@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor //롬복 어노테이션을 사용하면 컴파일 시점에
public class Event {
    private String name;
    private int limit;
    private LocalDateTime startDateTime;
    private LocalDateTime endDataTime;

}
