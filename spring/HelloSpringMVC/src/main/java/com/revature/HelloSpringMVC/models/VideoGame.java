package com.revature.HelloSpringMVC.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VideoGame {
    private String name;
    private String description;
    private String platform;
}
