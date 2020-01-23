package com.music.management.repository;

import com.music.management.entity.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Albums, String > {
}
