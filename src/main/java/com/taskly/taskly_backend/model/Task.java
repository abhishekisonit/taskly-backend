package com.taskly.taskly_backend.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@NotNull
	@Size(min = 3, max = 200)
	private String title;

	@Column(length = 1000)
	@Size(max = 1000)
	private String description;

	@Enumerated(EnumType.STRING)
	private TaskStatus status;

	@Enumerated(EnumType.STRING)
	private Priority priority;

	private LocalDateTime dueDate;

	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	@ManyToOne
	@JoinColumn(name = "assigned_to_id")
	private User assignedTo;

	@ManyToOne
	@JoinColumn(name = "created_by_id", nullable = false)
	private User createdBy;

	@OneToMany(mappedBy="task", cascade = CascadeType.ALL)
	private List<Comment> comments;
}
