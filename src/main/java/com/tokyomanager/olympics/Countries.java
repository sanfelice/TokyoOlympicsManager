package com.tokyomanager.olympics;

import com.tokyomanager.olympics.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo Sanfelice
 */
public interface Countries extends JpaRepository<Country, Long>  {
    
}
