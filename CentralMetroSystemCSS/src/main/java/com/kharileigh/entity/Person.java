/**
 *
 * @author kharileigh
 */

package com.kharileigh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    
    @Id
    private int id;
    private String name;
    
}
