package com.pcallserver.pcall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pcallserver.pcall.component.ComponentService;
import com.pcallserver.pcall.component.componentStorage.ComponentStock;
import com.pcallserver.pcall.component.componentStorage.ComponentStockService;
import com.pcallserver.pcall.component.dto.NewComponentDto;

@SpringBootApplication
public class PcallApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcallApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(ComponentService componentService, ComponentStockService stockService){
		return args -> {
			
			//Componente CPU
			//AMD
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 7 7800X3D", " ", "NEW", 549.0d, 2024, 10));
				stockService.createStock(new ComponentStock(1L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 5 7600X", " ", "NEW", 234.0d, 2023, 10));
				stockService.createStock(new ComponentStock(2L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 9 7900X", " ", "NEW", 399.0d, 2023, 10));
				stockService.createStock(new ComponentStock(3L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 3 4300G", " ", "NEW", 89.99d, 2023, 10));
				stockService.createStock(new ComponentStock(4L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen Threadripper 7960X", " ", "NEW", 1836.29d, 2023, 10));
				stockService.createStock(new ComponentStock(5L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 5 5600G", " ", "NEW", 319.99d, 2023, 10	));
				stockService.createStock(new ComponentStock(6L, 10));

			//Intel
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i5-12400F", " ", "NEW", 137.99d, 2024, 10	));
				stockService.createStock(new ComponentStock(7L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i5-12600", " ", "NEW", 234.0d, 2023, 10	));
				stockService.createStock(new ComponentStock(8L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i7-14700", " ", "NEW", 440.98d, 2023, 10	));
				stockService.createStock(new ComponentStock(9L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i9-13900F", " ", "NEW", 581.44d, 2023, 10	));
				stockService.createStock(new ComponentStock(10L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i9-13900", " ", "NEW", 659.0d, 2023, 10	));
				stockService.createStock(new ComponentStock(11L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i9-10980XE", " ", "NEW", 1354.23d, 2023, 10	));
				stockService.createStock(new ComponentStock(12L, 10));


			//Componente GPUS
			//Asus
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual GeForce RTX 4070 SUPER EVO OC Edition", "12GB GDDR6X DLSS3", "NEW", 709.0d, 2024, 10	));
				stockService.createStock(new ComponentStock(13L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual GeForce RTX 4060 White OC Edition", "8GB GDDR6 DLSS3", "NEW", 350.98d, 2024, 10));
				stockService.createStock(new ComponentStock(14L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual Radeon RX 6700 XT OC Edition", "12GB GDDR6", "NEW", 784.56d, 2024, 10));
				stockService.createStock(new ComponentStock(15L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual GeForce RTX 3050 OC Edition", "8GB GDDR6", "NEW", 279.53d, 2024, 10));
				stockService.createStock(new ComponentStock(16L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "ROG Strix GeForce RTX 4080 OC Edition", "16GB GDDR6X DLSS3", "NEW", 1700.89d, 2024, 10));
				stockService.createStock(new ComponentStock(17L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "GeForce RTX 4080 SUPER Noctua OC Edition", "16GB GDDR6X DLSS3", "NEW", 1534.23d, 2024, 10));
				stockService.createStock(new ComponentStock(18L, 10));
				
				//MSI
				componentService.addComponentDto(new NewComponentDto( "GPU", "MSI", "GeForce RTX 4090 GAMING X SLIM", "24GB GDDR6X DLSS3", "NEW", 959d, 2024, 10));
				stockService.createStock(new ComponentStock(18L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "MSI", "GeForce RTX 4070 Ti SUPER GAMING X SLIM White", "16GB GDDR6X DLSS3", "NEW", 999.0d, 2024, 10));
				stockService.createStock(new ComponentStock(19L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "MSI", "GeForce RTX 4060 Ti VENTUS 2X BLACK OC", "8GB GDDR6 DLSS3", "NEW", 389.95d, 2024, 10));
				stockService.createStock(new ComponentStock(20L, 10));
				
				//Gigabyte
				componentService.addComponentDto(new NewComponentDto( "GPU", "Gigabyte", "GeForce RTX 4090 WINDFORCE V2", "24GB GDDR6X", "NEW", 2109.01d, 2024, 10));
				stockService.createStock(new ComponentStock(21L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Gigabyte", "GeForce RTX 4060 EAGLE OC", "", "NEW", 359.0d, 2024, 10));
				stockService.createStock(new ComponentStock(22L, 10));
				
				//Zotac
				componentService.addComponentDto(new NewComponentDto( "GPU", "Zotac", "Gaming GeForce RTX 4080 SUPER Trinity OC White Edition", "16GB GDDR6X", "NEW", 1239.76d, 2024, 10));
				stockService.createStock(new ComponentStock(23L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Zotac", "Gaming GeForce RTX 3050 ECO", "8GB GDDR6", "NEW", 215.0d, 2024, 10));
				stockService.createStock(new ComponentStock(24L, 10));
			

				//Componente RAM
				//Corsair
				componentService.addComponentDto(new NewComponentDto( "RAM", "Corsair", "Vengeance LPX DDR4", "3200MHz PC4-25600 32GB 2x16GB CL16", "NEW", 77.0d, 2024, 10));
				stockService.createStock(new ComponentStock(25L, 10));
				componentService.addComponentDto(new NewComponentDto( "RAM", "Corsair", "Vengeance RGB DDR5", "6000MHz PC5-48000 32GB 2x16GB CL36 Negra", "NEW", 127.99d, 2024, 10));
				stockService.createStock(new ComponentStock(26L, 10));
				componentService.addComponentDto(new NewComponentDto( "RAM", "Corsair", "Vengeance DDR5", "6400MHz 64GB 2x32GB CL32", "NEW", 253.99d, 2024, 10));
				stockService.createStock(new ComponentStock(27L, 10));

				//Kingston
				componentService.addComponentDto(new NewComponentDto( "RAM", "Kingston", "FURY Beast DDR4", "3200 MHz 16GB 2x8GB CL16", "NEW", 49.98d, 2024, 10));
				stockService.createStock(new ComponentStock(28L, 10));
				componentService.addComponentDto(new NewComponentDto( "RAM", "Kingston", "FURY Renegade DDR5", "6000 MHz 32GB 2x16GB CL32", "NEW", 149.09d, 2024, 10));
				stockService.createStock(new ComponentStock(29L, 10));

				//Crucial
				componentService.addComponentDto(new NewComponentDto( "RAM", "Crucial", "Pro DDR5", "5600MHz 64GB 2x32GB CL46", "NEW", 225.568d, 2024, 10));
				stockService.createStock(new ComponentStock(30L, 10));
				componentService.addComponentDto(new NewComponentDto( "RAM", "Crucial", "CT2K16G56C46U5 DDR5", "5600 MHz 32GB 2x16 GB CL46", "NEW", 116.43d, 2024, 10));

				//GSkill
				componentService.addComponentDto(new NewComponentDto( "RAM", "GSkill", "Trident Z5 RGB Plata DDR5", "8000MHz 32GB 2x16GB CL38", "NEW", 3278.37d, 2024, 10));
				stockService.createStock(new ComponentStock(31L, 10));
				componentService.addComponentDto(new NewComponentDto( "RAM", "GSkill", "Trident Z5 RGB DDR5", "6000MHz 32 GB 2x16GB CL40", "NEW", 165.00d, 2024, 10));
				stockService.createStock(new ComponentStock(32L, 10));

				//Componente Motherboard
				//Asus
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "Asus", "Prime B760-PLUS D4", " ", "NEW", 125.99d, 2024, 10));
				stockService.createStock(new ComponentStock(33L, 10));
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "Asus", "TUF GAMING B760 PLUS WIFI", " ", "NEW", 201.76d, 2024, 10));
				stockService.createStock(new ComponentStock(34L, 10));
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "Asus", "ROG Strix X299-E Gaming II", " ", "NEW", 459.99d, 2024, 10));
				stockService.createStock(new ComponentStock(35L, 10));

				//MSI
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "MSI", "MPG B550 GAMING PLUS", " ", "NEW", 132.99d, 2024, 10));
				stockService.createStock(new ComponentStock(36L, 10));
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "MSI", "MPG Z790 EDGE TI MAX WIFI", " ", "NEW", 354.99d, 2024, 10));
				stockService.createStock(new ComponentStock(37L, 10));

				//Gigabyte
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "Gigabyte", "B760M DS3H DDR4", " ", "NEW", 100.99d, 2024, 10));
				stockService.createStock(new ComponentStock(38L, 10));
				componentService.addComponentDto(new NewComponentDto( "Motherboard", "Gigabyte", "B650E AORUS MASTER", " ", "NEW", 394.99d, 2024, 10));
				stockService.createStock(new ComponentStock(39L, 10));

				//Componente Hard_Drive
				//WesternDigital
				componentService.addComponentDto(new NewComponentDto( "Hard_Drive", "WesternDigital", "Red Plus 3.5", "6TB SATA3", "NEW", 171.99d, 2024, 10));
				stockService.createStock(new ComponentStock(40L, 10));
				componentService.addComponentDto(new NewComponentDto( "Hard_Drive", "WesternDigital", "Purple Pro 3.5", "10TB SATA3", "NEW", 307.48d, 2024, 10));
				stockService.createStock(new ComponentStock(41L, 10));
				componentService.addComponentDto(new NewComponentDto( "Hard_Drive", "WesternDigital", "Ultrastar DC HC550 3.5", "16TB SAS", "NEW", 415.52d, 2024, 10));

				//Seagate
				componentService.addComponentDto(new NewComponentDto( "Hard_Drive", "Seagate", "BarraCuda 3.5", "2TB SATA3", "NEW", 63.18d, 2024, 10));
				stockService.createStock(new ComponentStock(42L, 10));
				componentService.addComponentDto(new NewComponentDto( "Hard_Drive", "Seagate", "Enterprise Exos X16 3.5", "10TB SATA3", "NEW", 241.70d, 2024, 10));

				
				//Componente NVMe
				//WesternDigital
				componentService.addComponentDto(new NewComponentDto( "NVMe", "WesternDigital", "WD BLACK SN770", "2TB NVMe SSD", "NEW", 142.99d, 2024, 10));
				stockService.createStock(new ComponentStock(43L, 10));
				componentService.addComponentDto(new NewComponentDto( "NVMe", "WesternDigital", "Red SN700", "4TB SSD M.2 NVMe PCIe 3.0", "NEW", 370.23d, 2024, 10));
				stockService.createStock(new ComponentStock(44L, 10));

				//Samsung
				componentService.addComponentDto(new NewComponentDto( "NVMe", "Samsung", "990 PRO", "4TB SSD PCIe 4.0 NVMe M.2", "NEW", 372.99d, 2024, 10));
				stockService.createStock(new ComponentStock(45L, 10));
				componentService.addComponentDto(new NewComponentDto( "NVMe", "Samsung", "990 EVO", "2TB SSD M.2 PCIe 4.0 x4/5.0 x2 NVMe 2.0", "NEW", 196.99d, 2024, 10));
				stockService.createStock(new ComponentStock(46L, 10));
				componentService.addComponentDto(new NewComponentDto( "NVMe", "Samsung", "980 PRO", "1TB NVMe SSD", "NEW", 139.99d, 2024, 10));
				stockService.createStock(new ComponentStock(47L, 10));

				//Kingston
				componentService.addComponentDto(new NewComponentDto( "NVMe", "Kingston", "NV2", "2TB NVMe SSD", "NEW", 123.99d, 2024, 10));
				stockService.createStock(new ComponentStock(48L, 10));
				componentService.addComponentDto(new NewComponentDto( "NVMe", "Kingston", "KC3000", "TB M.2 PCIe 4.0 NVMe", "NEW", 95.99d, 2024, 10));
				stockService.createStock(new ComponentStock(49L, 10));


				//Componente Power_Supply
				//Seasonic
				componentService.addComponentDto(new NewComponentDto( "Power_Supply", "Seasonic", "Focus GX-850", "850W 80 Plus Gold Modular", "NEW", 104.99d, 2024, 10));
				stockService.createStock(new ComponentStock(50L, 10));
				componentService.addComponentDto(new NewComponentDto( "Power_Supply", "Seasonic", "Prime Fanless TX-700", "700W 80 Plus Titanium Modular", "NEW", 316.33d, 2024, 10));
				stockService.createStock(new ComponentStock(51L, 10));

				//Corsair
				componentService.addComponentDto(new NewComponentDto( "Power_Supply", "Corsair", "RMe Series RM850e", "850W 80 Plus Gold Modular", "NEW", 122.89d, 2024, 10));
				stockService.createStock(new ComponentStock(52L, 10));
				componentService.addComponentDto(new NewComponentDto( "Power_Supply", "Corsair", "RM1200x SHIFT White Series", " 1200W 80 Plus Gold Modular", "NEW", 252.99d, 2024, 10));
				stockService.createStock(new ComponentStock(53L, 10));

				//Asus
				componentService.addComponentDto(new NewComponentDto( "Power_Supply", "Asus", "ROG Thor 1200P2 Gaming", "1200W 80 Plus Platinum Modular", "NEW", 357.99d, 2024, 10));
				stockService.createStock(new ComponentStock(54L, 10));
				componentService.addComponentDto(new NewComponentDto( "Power_Supply", "Asus", "ROG THOR 1000W Platinum II EVA Edition", "80 Plus Platinum Modular", "NEW", 533.0d, 2024, 10));
				stockService.createStock(new ComponentStock(55L, 10));

				//Componente Case
				//NZXT
				componentService.addComponentDto(new NewComponentDto( "Case", "NZXT", "H9 Flow", "Dual-Chamber Mid-Tower Airflow Case", "NEW", 159.05d, 2024, 10));
				stockService.createStock(new ComponentStock(56L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "NZXT", "H510", "Compact Mid-Tower Case", "NEW", 89.99d, 2024, 10));
				stockService.createStock(new ComponentStock(57L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "NZXT", "H710", "Mid-Tower Case with Tempered Glass", "NEW", 169.99d, 2024, 10));
				stockService.createStock(new ComponentStock(58L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "NZXT", "H700 Nuka-Cola", "CRFT Limited Edition Mid-Tower", "NEW", 299.99d, 2024, 10));
				stockService.createStock(new ComponentStock(59L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "NZXT", "H1", "15.6-liter Mini-ITX", "NEW", 399.99d, 2024, 10));
				stockService.createStock(new ComponentStock(60L, 10));

				//CoolerMaster
				componentService.addComponentDto(new NewComponentDto( "Case", "CoolerMaster", "Master Cosmos C700M", " ", "NEW", 493.0d, 2024, 10));
				stockService.createStock(new ComponentStock(61L, 10));

				//Fractal
				componentService.addComponentDto(new NewComponentDto( "Case", "Fractal", "Design North ATX Mid Tower", "USB 3.2 Chalk White", "NEW", 169.42d, 2024, 10));
				stockService.createStock(new ComponentStock(62L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "Fractal", "Design Torrent TG Dark Tint ATX", "Cristal Templado 3.2 Negra", "NEW", 263.33d, 2024, 10));
				stockService.createStock(new ComponentStock(63L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "Fractal", "Design Terra Mini Tower", "USB-C Grafito", "NEW", 240.86d, 2024, 10));	
				stockService.createStock(new ComponentStock(64L, 10));

				//LianLi
				componentService.addComponentDto(new NewComponentDto( "Case", "LianLi", "O11 Dynamic EVO XL Full Tower", "Cristal Templado USB-C Blanca", "NEW", 282.94d, 2024, 10));
				stockService.createStock(new ComponentStock(65L, 10));
				componentService.addComponentDto(new NewComponentDto( "Case", "LianLi", "Odyssey X", "Cristal Templado USB-C/3.1 Plata", "NEW", 439.89d, 2024, 10));
				stockService.createStock(new ComponentStock(66L, 10));

				//Thermaltake
				componentService.addComponentDto(new NewComponentDto( "Case", "Thermaltake", "Core P6 Snow", " ", "NEW", 211.89d, 2024, 10));
				stockService.createStock(new ComponentStock(67L, 10));


				//Componente Cooling
				//NZXT
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "NZXT", "Kraken Z63", "280mm Liquid Cooler with LCD Display", "NEW", 229.99d, 2024, 10));
				stockService.createStock(new ComponentStock(68L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "NZXT", "Elite 240 RGB", "240mm AIO Liquid Cooler with LCD Display and RGB Fans", "NEW", 259.99d, 2024, 10));
				stockService.createStock(new ComponentStock(69L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "NZXT", "T120 RGB", "CPU Air Cooler with RGB", "NEW", 59.99d, 2024, 10));
				stockService.createStock(new ComponentStock(70L, 10));

				//CoolerMaster
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "CoolerMaster", "HYPER 212 HALO SF6 RYU", " ", "NEW", 53.99d, 2024, 10));
				stockService.createStock(new ComponentStock(71L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "CoolerMaster", "MasterLiquid PL360 Flux White Edition", " ", "NEW", 299.99d, 2024, 10));
				stockService.createStock(new ComponentStock(72L, 10));

				//Asus
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "Asus", "ROG Ryujin III 360", " ", "NEW", 365.0d, 2024, 10));
				stockService.createStock(new ComponentStock(73L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPUCooling", "Asus", "Strix LC III 360", " ", "NEW", 223.99d, 2024, 10));
				stockService.createStock(new ComponentStock(74L, 10));


				//Componente Cooling_Fan
				//Noctua
				componentService.addComponentDto(new NewComponentDto( "Cooling_Fan", "Noctua", "NF-A20 5V PWM", " ", "NEW", 47.52d, 2024, 10));
				stockService.createStock(new ComponentStock(75L, 10));
				componentService.addComponentDto(new NewComponentDto( "Cooling_Fan", "Noctua", "NF-F12 PWM Industrial PPC", " ", "NEW", 29.90d, 2024, 10));
				stockService.createStock(new ComponentStock(76L, 10));

				//lianLi
				componentService.addComponentDto(new NewComponentDto( "Cooling_Fan", "LianLi", "UNI Fan SL V2", " ", "NEW", 42.15d, 2024, 10));
				stockService.createStock(new ComponentStock(77L, 10));
				componentService.addComponentDto(new NewComponentDto( "Cooling_Fan", "LianLi", "Uni Fan SL120 RGB", " ", "NEW", 84.67d, 2024, 10));
				stockService.createStock(new ComponentStock(78L, 10));

				//Corsair
				componentService.addComponentDto(new NewComponentDto( "Cooling_Fan", "Corsair", "ICUE Link QX120 RGB", " ", "NEW", 153.98d, 2024, 10));
				stockService.createStock(new ComponentStock(79L, 10));

				//BeQuiet
				componentService.addComponentDto(new NewComponentDto( "Cooling_Fan", "BeQuiet", "Light Wings PWM High Speed", " ", "NEW", 28.31d, 2024, 10));
				stockService.createStock(new ComponentStock(80L, 10));

				//Componente Network_Card
				//Asus
				componentService.addComponentDto(new NewComponentDto( "Network_Card", "Asus", "PCE-AX58BT", " ", "NEW", 69.99d, 2024, 10));
				stockService.createStock(new ComponentStock(81L, 10));
				componentService.addComponentDto(new NewComponentDto( "Network_Card", "Asus", "XG-C100C", " ", "NEW", 98.99d, 2024, 10));
				stockService.createStock(new ComponentStock(82L, 10));

				//QNAP
				componentService.addComponentDto(new NewComponentDto( "Network_Card", "QNAP", "Qxg-25g2sf-cx6", " ", "NEW", 448.14d, 2024, 10));
				stockService.createStock(new ComponentStock(83L, 10));
				componentService.addComponentDto(new NewComponentDto( "Network_Card", "QNAP", "QXG-10G1T", " ", "NEW", 190.99d, 2024, 10));
				stockService.createStock(new ComponentStock(84L, 10));

				//Componente Sound_Card
				//Creative
				componentService.addComponentDto(new NewComponentDto( "Sound_Card", "Creative", "Sound BlasterX AE-5 Plus", " ", "NEW", 107.99d, 2024, 10));
				stockService.createStock(new ComponentStock(85L, 10));
				componentService.addComponentDto(new NewComponentDto( "Sound_Card", "Creative", "Sound Blaster Z SE", " ", "NEW", 60.98d, 2024, 10));
				stockService.createStock(new ComponentStock(86L, 10));
				componentService.addComponentDto(new NewComponentDto( "Sound_Card", "Creative", "Sound Blaster AE-7", " ", "NEW", 193.99d, 2024, 10));
				stockService.createStock(new ComponentStock(87L, 10));

				//Asus
				componentService.addComponentDto(new NewComponentDto( "Sound_Card", "Asus", "Strix Soar", " ", "NEW", 118.99d, 2024, 10));
				stockService.createStock(new ComponentStock(87L, 10));
				componentService.addComponentDto(new NewComponentDto( "Sound_Card", "Asus", "Xonar AE", " ", "NEW", 59.99d, 2024, 10));
		};	
	}

}

//Valores posibles para ComponentBrand:
// Asus, MSI, Gigabyte, AMD, Intel,Samsung, WesternDigital, Kingston, Seagate, Zotac, Corsair, NZXT, CoolerMaster, Creative, BeQuiet, Seasonic, Noctua, DeepCool

//valores posibles para ComponentCategory:
// CPU, GPU, RAM, Motherboard, Hard_Drive, NVMe, Power_Supply, Case, Cooling, Network_Card, Sound_Card,

//valores posibles para ComponentState:
// NEW, SECONDHAND
