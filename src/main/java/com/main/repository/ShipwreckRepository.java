package com.main.repository;

import com.main.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<Shipwreck,Long>
 *     The Shipwreck is the entity class
 *     Long is the type of the id preferred long
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {
}
