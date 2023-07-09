package com.ecommerce.ecommerce.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userContact;

   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @OneToMany
    private List<Address> userAddresses;

}
