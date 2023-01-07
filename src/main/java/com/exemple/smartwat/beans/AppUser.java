package com.exemple.smartwat.beans;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String address;
	private String phone;
	private String email;
	private String password;
	private String image;
	private String role = "agriculture";
	
	@OneToMany
	@JoinColumn(name="user_id", nullable = true)
	private List<Ferme> espacesVerts;
	
	
	
}
