package com.infokmed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max=100)
    private String name;


}
