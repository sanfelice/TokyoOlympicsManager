package com.tokyomanager.olympics;

import com.tokyomanager.olympics.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo Sanfelice
 */
public interface Stages extends JpaRepository<Stage, Long>  {
    
}
