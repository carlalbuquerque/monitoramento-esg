package dio.monitoramento.service;

import dio.monitoramento.domain.model.Empresa;
import java.util.List;

public interface EmpresaService {


    Empresa create(Empresa empresa);

    Empresa findById(Long id);

    List<Empresa> findAll();

    Empresa update(Long id, Empresa empresa);


}

