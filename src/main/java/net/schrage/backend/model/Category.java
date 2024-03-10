package net.schrage.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="CATEGORY")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Integer id;
  @Column(name = "NAME")
  private String name;
  @Column(name = "Users_Id")
  private String userId;

}
