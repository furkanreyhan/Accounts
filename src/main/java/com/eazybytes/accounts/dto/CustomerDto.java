package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5,max = 40, message = "Name should be 5-40 length")
    private String name;
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email address format is wrong")
    private String email;

    @Pattern(regexp = ("^$|[0-9]{10}"),message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
