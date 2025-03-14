package dio.monitoramento.controller;

import dio.monitoramento.domain.model.Empresa;
import dio.monitoramento.service.EmpresaService;
import dio.monitoramento.service.imp.EmpresaServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> findById(@PathVariable long id){
        var empresa = empresaService.findById(id);
        return ResponseEntity.ok(empresa);

    }

    @PostMapping
    public ResponseEntity<Empresa> create(@RequestBody Empresa empresa){
        var empresaCreate = empresaService.create(empresa);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(empresaCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(empresaCreate);

    }
    @GetMapping
    public ResponseEntity<List<Empresa>> findAll(){
        List<Empresa> empresas = empresaService.findAll();
        return ResponseEntity.ok(empresas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> update(@PathVariable Long id, @RequestBody Empresa empresa){
        Empresa empresaAtualizada = empresaService.update(id, empresa);
        return empresaAtualizada != null ? ResponseEntity.ok(empresaAtualizada) : ResponseEntity.notFound().build();
    }

}
