package com.api.hateoas.apirestcuentas.repository;

import com.api.hateoas.apirestcuentas.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.cdi.*;
import org.springframework.stereotype.*;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

    @Query("UPDATE Cuenta c set c.balance = ?1 WHERE c.id = ?2")
    @Modifying
    void actualizar (float monto, Integer id);

}
