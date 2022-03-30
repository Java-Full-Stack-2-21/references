package models;


import lombok.*;

// lombok allows us to autogenerate our methods in our model
// @Data can replace Getter/Setter/toString/hashCode
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
