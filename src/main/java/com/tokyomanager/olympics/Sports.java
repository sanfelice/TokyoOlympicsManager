package com.tokyomanager.olympics;

import com.tokyomanager.olympics.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo Sanfelice
 */
public interface Sports extends JpaRepository<Sport, Long>  {
    
}
