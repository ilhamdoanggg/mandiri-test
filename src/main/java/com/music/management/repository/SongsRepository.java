package com.music.management.repository;

import com.music.management.entity.Songs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongsRepository extends JpaRepository<Songs, String> {
}
