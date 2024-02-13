package com.codigo.msregistro.infraestructure.repository;

import com.codigo.msregistro.infraestructure.entity.TipoDocumentoEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {
    TipoDocumentoEntity findByCodTipo(@Param("codTipo") String codTipo);

}
