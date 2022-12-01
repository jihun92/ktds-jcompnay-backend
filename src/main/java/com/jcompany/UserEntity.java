package com.jcompany;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	

}