package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AccountsDto {
    @NotEmpty
    private Long accountNumber;
    @NotEmpty
    private String accountType;
    @NotEmpty
    private String branchAddress;
}
