/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplaceT.marketplaceTd.interfaces;

import marketplaceT.marketplaceTd.modelo.rol;
import marketplaceT.marketplaceTd.modelo.usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public interface IRol extends CrudRepository<rol, Integer> {
    
    
    
}
