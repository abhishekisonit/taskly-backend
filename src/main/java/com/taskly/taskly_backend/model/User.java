package com.taskly.taskly_backend.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@NotNull
	@Size(min = 2, max = 100)
	private String fullName;

	@Column(unique = true, nullable = false)
	@NotNull
	@Email
	private String email;

	@Column(nullable = false)
	@NotNull
	@Size(min = 8)
	private String password;

	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(mappedBy = "assignedTo")
	private List<Task> tasks;
}