package com.example.demo.student;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface studentRepository extends CrudRepository<student, Integer> {

    @Override
    default <S extends student> S save(S entity) {
        return null;
    }

    @Override
    default <S extends student> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<student> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default Iterable<student> findAll() {
        return null;
    }

    @Override
    default Iterable<student> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(student entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends student> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
