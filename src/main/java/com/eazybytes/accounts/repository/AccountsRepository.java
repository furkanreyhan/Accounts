package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    //bir değişiklik olacağı için transactional
    //deleteById yada create'ler de değişiklik yapıyor ama deleteById'yi framework sağlıyor
    //.save()'i de framework sağlıyor.bunlar kendi handle ediyor.biz ekstra metot ekledik.
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
