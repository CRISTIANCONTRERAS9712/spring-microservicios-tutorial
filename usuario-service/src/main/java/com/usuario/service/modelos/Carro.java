package com.usuario.service.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Accessors(fluent = true, chain = true)
public class Carro {

	private String marca;
    private String modelo;
    private int usuarioId;
}
