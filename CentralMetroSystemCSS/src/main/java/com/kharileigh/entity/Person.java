/**
 *
 * @author kharileigh
 */

package com.kharileigh.entity;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    
    private int id;
    private String name;
    
}
