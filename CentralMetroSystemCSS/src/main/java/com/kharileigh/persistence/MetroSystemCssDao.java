/**
 *
 * @author kharileigh
 */

package com.kharileigh.persistence;

import com.kharileigh.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetroSystemCssDao extends JpaRepository<Person, Integer> {
    
}
