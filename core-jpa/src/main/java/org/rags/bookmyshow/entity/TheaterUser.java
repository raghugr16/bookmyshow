package org.rags.bookmyshow.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.Date;
import java.util.UUID;

import javax.persistence.*;

@Data
@Entity
public class TheaterUser extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "org.hibernate.type.UUIDCharType")
	@Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
	private UUID userId;

	private String password;

	public TheaterUser() {
	}

	public TheaterUser(String userName, String emaill, String phonenumber, UUID userId, String password) {
		super(userName, emaill, phonenumber);
		this.userId = userId;
		this.password = password;
	}

	public TheaterUser(String userName, String emaill, String phonenumber, UUID userId, String password, BookMyShowApp bookMyShowApp) {
		super(userName, emaill, phonenumber);
		this.userId = userId;
		this.password = password;
	}
}