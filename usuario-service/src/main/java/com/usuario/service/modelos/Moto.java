package com.usuario.service.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Accessors(fluent = true)
public class Moto {

	private String marca;
    private String modelo;
    private int usuarioId;
}
