package com.example;

public interface IEntityRepository<T> extends IEntity{
    public void add(T entity);
    public void remove(T entity);
    public void update(T entity);
}
