package com.cbrl.soap.service.example.vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.cbrl.soap.service.example.vehicle.domain.Make;
import com.cbrl.soap.service.example.vehicle.domain.ObjectFactory;
import com.cbrl.soap.service.example.vehicle.domain.Vehicle;

@Component
@Configuration
@Import({ObjectFactory.class})
public class VehicleRepository {

	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	@Autowired
	ObjectFactory vehicleFactory;

	@PostConstruct
	public void initData() {
		Vehicle vehicle = vehicleFactory.createVehicle();
		vehicle.setColor("White");
		vehicle.setGear("Semi-Automatic");
		vehicle.setKm(24000);
		vehicle.setMake(Make.BMW);
		vehicle.setName("2015 çıkışlı SAHİBİNDEN HATASIZ NBT + ISITMALI HAFIZALI KOLTUK");
		vehicle.setYear(2015);
		vehicle.setPrice(new BigDecimal(255000));
		vehicles.add(vehicle);

		vehicle = vehicleFactory.createVehicle();
		vehicle.setColor("White");
		vehicle.setGear("Semi-Automatic");
		vehicle.setKm(12000);
		vehicle.setMake(Make.BMW);
		vehicle.setName("2015 4.28İ xDRİVE-COUPE-245HP-LUXURY-HARMAN KARDON-12.000KM");
		vehicle.setYear(2015);
		vehicle.setPrice(new BigDecimal(299000));
		vehicles.add(vehicle);

		vehicle = vehicleFactory.createVehicle();
		vehicle.setColor("Blue");
		vehicle.setGear("Automatic");
		vehicle.setKm(0);
		vehicle.setMake(Make.BMW);
		vehicle.setName("PİRANLAR BMW 840d XDRİVE M PAKET ÖZEL İTHALAT 10 GÜNDE TESLİMAT");
		vehicle.setYear(2019);
		vehicle.setPrice(new BigDecimal(1775000));
		vehicles.add(vehicle);

		vehicle = vehicleFactory.createVehicle();
		vehicle.setColor("Black");
		vehicle.setName("INTERCITY2 AUDI A4 Sedan 2.0 TDI Quattro Design S-Tronic");
		vehicle.setKm(78800);
		vehicle.setMake(Make.AUDI);
		vehicle.setGear("Automatic");
		vehicle.setYear(2016);
		vehicle.setPrice(new BigDecimal(215000));
		vehicles.add(vehicle);

		vehicle = vehicleFactory.createVehicle();
		vehicle.setColor("Red");
		vehicle.setGear("Automatic");
		vehicle.setKm(26000);
		vehicle.setMake(Make.AUDI);
		vehicle.setName("Hatasız A5 Coupe Design+Prestige+Deluxe 26.000 KM");
		vehicle.setYear(2017);
		vehicle.setPrice(new BigDecimal(269000));
		vehicles.add(vehicle);
	}

	public List<Vehicle> getVehiclesByMake(Make make) {
		return vehicles.stream().filter(a -> a.getMake().equals(make)).collect(Collectors.toList());
	}

	public List<Vehicle> getVehiclesByColor(String color) {
		return vehicles.stream().filter(a -> a.getColor().equals(color)).collect(Collectors.toList());
	}
}
