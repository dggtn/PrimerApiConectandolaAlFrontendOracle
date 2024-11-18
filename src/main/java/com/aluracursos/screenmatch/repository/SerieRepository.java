package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Categoria;
import com.aluracursos.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Optional<Serie> findTituloContainingIgnoreCase(String nombreSerie);

    List<Serie>findByGenero(Categoria categoria);

    @Query("select s from Serie s WHERE s.totalTemporadas<=: totalTemporadas AND s.evaluacion >=:evaluacion")
    List<Serie>seriesPorTemporadaYEvaluacion(int totalTemporadas,double evaluacion);


    //otros métodos
    @Query("SELECT s FROM Serie s " + "JOIN s.episodios e " + "GROUP BY s " + "ORDER BY MAX(e.fechaDeLanzamiento) DESC LIMIT 5")
    List<Serie> lanzamientosMasRecientes();

    List<Serie> findTop5ByOrderByEvaluacionDesc();
}
