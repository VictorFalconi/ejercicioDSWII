package com.example.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.examen.entity.Curso;




public interface CursoRepository extends MongoRepository<Curso, Integer>{
    public Curso findByIdCurso(int idCurso);

    @Query("{'Nombre' : /^?0/}")
    public List<Curso> buscaPorNombre(String nombre);

    // @Query("{ 'idCurso' : ?0 }")
    // public abstract Curso buscaCursoPorId(int idCurso);
}
