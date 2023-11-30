package com.hallinearaujo.api_prova2;

import com.hallinearaujo.api_prova2.model.Cliente;
import com.hallinearaujo.api_prova2.model.Pedido;
import com.hallinearaujo.api_prova2.repository.ClientesRepository;
import com.hallinearaujo.api_prova2.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {




    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}
