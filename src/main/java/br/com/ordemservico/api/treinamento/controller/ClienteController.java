package br.com.ordemservico.api.treinamento.controller;

import br.com.ordemservico.api.treinamento.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Deyvison");
        cliente1.setEmail("deyvi@gmail.com");
        cliente1.setTelefone("9898989283423");

        Cliente cliente2 = new Cliente();
        cliente2.setId(1L);
        cliente2.setNome("Bruno");
        cliente2.setEmail("brun@gmail.com");
        cliente2.setTelefone("9898989283423");

        return Arrays.asList(cliente1, cliente2);
    }
}
