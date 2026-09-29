package com.universidad.reservaslabs.web;

import com.universidad.reservaslabs.exception.RecursoNoEncontradoException;
import com.universidad.reservaslabs.exception.ReservaConflictException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Traduce las MISMAS excepciones de dominio que {@link com.universidad.reservaslabs.exception.GlobalRestExceptionHandler}
 * a una redirección con mensaje flash, en lugar de un cuerpo JSON.
 * Restringido con {@code assignableTypes} a {@link ReservaWebController}
 * para no competir con el manejador REST de la Parte 1, que está
 * restringido con {@code annotations = RestController.class}. Mismo
 * vocabulario de errores de dominio, presentación distinta por superficie
 * (ver Punto de decisión 4 en el README).
 */
@ControllerAdvice(assignableTypes = ReservaWebController.class)
public class ReservaWebExceptionHandler {

    @ExceptionHandler(ReservaConflictException.class)
    public String conflicto(ReservaConflictException ex, RedirectAttributes redirect) {
        redirect.addFlashAttribute("error", ex.getMessage());
        return "redirect:/reservas/nueva";
    }

    @ExceptionHandler(RecursoNoEncontradoException.class)
    public String noEncontrado(RecursoNoEncontradoException ex, RedirectAttributes redirect) {
        redirect.addFlashAttribute("error", ex.getMessage());
        return "redirect:/reservas";
    }
}
