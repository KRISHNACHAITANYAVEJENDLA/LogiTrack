package com.fareye.LogiTrack.Controller;
import com.fareye.LogiTrack.Entity.Driver;
import com.fareye.LogiTrack.Repository.DriverRepository;
import com.fareye.LogiTrack.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {
    private final DriverRepository driverRepository;
    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
    public Driver createDriver(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }
    @PostMapping
    public Driver createDriver(@RequestBody Driver driver){
        return driverRepository.save(driver);
    }
    @GetMapping
    public List<Driver> getAllDrivers(){
        return driverRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Driver> getDriverById(@PathVariable Long Id){
        return driverRepository.findById(Id);
    }
    @PutMapping("/{id}")
    public Driver updateDriver(@PathVariable Long id,@RequestBody Driver updateDriver){
        return driverRepository.findById(id).map(driver ->{
            driver.setName(updateDriver.getName());
            driver.setEmail(updateDriver.getEmail());
            driver.setPh_number(updateDriver.getPh_number());
            driver.setLicensenumber(updateDriver.getLicensenumber());
            driver.setVehicle_number(updateDriver.getVehicle_number());
            return driverRepository.save(driver);
        })
                .orElseThrow(() -> new RuntimeException("Driver not found with id " + id));
    }
    @DeleteMapping("/{id}")
    public String deleteDriver(@PathVariable Long id){
        driverRepository.DeleteById(id);
        return "Driver Deleted Successfully";
    }
}
