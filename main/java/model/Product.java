package model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String age;
    private String nationality;
    private String img;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Blog blog;
    @ManyToOne
    private User user;




}
