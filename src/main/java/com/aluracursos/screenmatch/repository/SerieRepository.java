package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Categoria;
import com.aluracursos.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Optional<Serie> findTituloContainingIgnoreCase(String nombreSerie);

    List<Serie> findTop5ByEvaluacionDesc();

    List<Serie>findByGenero(Categoria categoria);

    @Query("select s from Serie s WHERE s.totalTemporadas<=: totalTemporadas AND")
    List<Serie>seriesPorTemporadaYEvaluacion(int totalTemporadas,double evaluaciones)
}
