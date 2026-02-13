package com.fareye.LogiTrack.Repository;

import com.fareye.LogiTrack.Entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //this tells the spring that this is responsible for the db operations.
public interface DriverRepository extends JpaRepository<Driver,Long> {//<>entity and the primary key type.

    //nothing inside until any custom query required.
}
