package dio.monitoramento.service.imp;

import dio.monitoramento.domain.model.Empresa;
import dio.monitoramento.domain.repository.EmpresaRepository;
import dio.monitoramento.service.EmpresaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmpresaServiceImp implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaServiceImp(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;

    }

    public Empresa create(Empresa empresaToCreate) {
        // Verifica se a empresa com o CNPJ já existe
        if (empresaRepository.existsByCnpj(empresaToCreate.getCnpj())) {
            throw new IllegalArgumentException("Essa empresa já existe!");
        }

        // Se não existir, persiste a empresa no banco
        return empresaRepository.save(empresaToCreate);
    }



    @Override
    public Empresa findById(Long id) {
        return empresaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Empresa não encontrada com o id: " + id));

    }

    @Override
    public Empresa update(Long id, Empresa empresa) {

        // Verifica se a empresa existe no banco de dados
        Empresa existingEmpresa = empresaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Empresa não encontrada com o id: " + id));

        // Atualiza os campos necessários da empresa
        existingEmpresa.setNome(empresa.getNome());
        existingEmpresa.setCnpj(empresa.getCnpj());
        // Adicione mais campos conforme necessário

        // Salva e retorna a empresa atualizada
        return empresaRepository.save(existingEmpresa);
    }

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll(); // Retorna todas as empresas do banco
    }

}

