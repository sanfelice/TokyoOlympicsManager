package com.tokyomanager.olympics;

import com.tokyomanager.olympics.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo Sanfelice
 */
public interface Sites extends JpaRepository<Site, Long>  {
    
}
