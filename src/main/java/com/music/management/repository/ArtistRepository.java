package com.music.management.repository;

import com.music.management.entity.Artists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artists, String> {
}
