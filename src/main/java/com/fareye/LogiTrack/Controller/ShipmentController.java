package com.fareye.LogiTrack.Controller;

import com.fareye.LogiTrack.Entity.Driver;
import com.fareye.LogiTrack.Entity.Shipment;
import com.fareye.LogiTrack.Repository.ShipmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {
    private final ShipmentRepository shipmentRepository;
    public ShipmentController(ShipmentRepository shipmentRepository){
        this.shipmentRepository = shipmentRepository;
    }
    @PostMapping
    public Shipment createDriver(@RequestBody Driver driver){
        return shipmentRepository.save(driver);
    }
    @GetMapping
    public List<Shipment> getAllShipments(){
        return shipmentRepository.findAll();
    }
    @GetMapping{"/{id}"}
    public Optional<Shipment> getShipmentById(@PathVariable Long id){
        return shipmentRepository.findById(id);
    }
    @PutMapping("/{id}")
    public Driver updateDriver(@PathVariable Long id,
                               @RequestBody Driver updatedDriver) {

        return shipmentRepository.findById(id)
                .map(driver -> {
                    driver.setTrackingNumber(updateshipment.getTrackingNumber());
                    driver.setEmail(updatedDriver.getEmail());
                    driver.setPh_number(updatedDriver.getPh_number());
                    driver.setLicensenumber(updatedDriver.getLicensenumber());
                    driver.setVehicle_number(updatedDriver.getVehicle_number());
                    return driverRepository.save(driver);
                })
                .orElseThrow(() -> new RuntimeException("Driver not found with id " + id));
    }
}
