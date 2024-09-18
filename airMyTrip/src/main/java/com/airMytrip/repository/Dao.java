package com.airMytrip.repository;

import java.util.Optional;

public interface Dao <T> {
	public Optional<T> get(Integer id);
	public int save(T t);
}
