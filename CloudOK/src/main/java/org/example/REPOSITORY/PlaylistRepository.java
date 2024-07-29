package org.example.REPOSITORY;

import com.example.clound.MODELO.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    Playlist findByName(String name);
}
