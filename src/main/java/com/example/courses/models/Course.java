package com.example.courses.models;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;

}
