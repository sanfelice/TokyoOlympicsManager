package com.tokyomanager.olympics.competitions;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tokyomanager.olympics.model.Competition;

/**
 *
 * @author Ricardo Sanfelice
 */
public interface Competitions extends JpaRepository<Competition, Long>  {
    
}
