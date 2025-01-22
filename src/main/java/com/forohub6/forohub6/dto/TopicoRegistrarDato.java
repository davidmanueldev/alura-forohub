package com.forohub2024.forohub2024.dto;

import jakarta.validation.constraints.NotBlank;

public record TopicoRegistrarDato(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String curso)

{
}