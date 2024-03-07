package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //Customerların telefon numaraları aynı olmasını engellemek için id'leri check
    //edemiyoruz. Çünkü customer oluşturulduktan sonra id'si otomatik jpa tarafından veriliyor.
    //bu yüzden telefon numaralarını check edebiliriz.
    //telefon numaraları için ayrıca bir metod tanımlıyoruz.
    Optional<Customer> findByMobileNumber(String mobileNumber);

    //mobileNumber kısmı entity class ile eşleşmesi lazım. findBy'ı otomatik tanıyor.
    //iki parametreli bir query istiyor olsaydık findByMobileNumberAndNeyse gibi yazabilirdik.
}
