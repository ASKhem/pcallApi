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
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 7 7800X3D", " ", "NEW", 549.0d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1066/10665103/1575-amd-ryzen-7-7800x3d-42-ghz-5-ghz.jpg"));
				stockService.createStock(new ComponentStock(1L, 10));
				System.out.println(componentService.getComponents());
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 5 7600X", " ", "NEW", 234.0d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1057/10570001/1881-amd-ryzen-5-7600x-47-ghz-box-sin-ventilador-comprar.jpg"));
				stockService.createStock(new ComponentStock(2L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 9 7900X", " ", "NEW", 399.0d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1057/10570012/1241-amd-ryzen-9-7900x-sin-cooler-47-ghz-box-sin-ventilador-comprar.jpg"));
				stockService.createStock(new ComponentStock(3L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 3 4300G", " ", "NEW", 89.99d, 2023, 10, "https://thumb.pccomponentes.com/w-150-150/articles/1059/10593324/1699-amd-ryzen-3-4300g-38-ghz-box.jpg"));
				stockService.createStock(new ComponentStock(4L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen Threadripper 7960X", " ", "NEW", 1836.29d, 2023, 10, "https://thumb.pccomponentes.com/w-150-150/articles/1080/10803028/1307-amd-ryzen-threadripper-7960x-42-53ghz-box-comprar.jpg"));
				stockService.createStock(new ComponentStock(5L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "AMD", "Ryzen 5 5600G", " ", "NEW", 319.99d, 2023, 10, "https://thumb.pccomponentes.com/w-150-150/articles/42/422971/1183-amd-ryzen-5-5600g-440ghz.jpg"));
				stockService.createStock(new ComponentStock(6L, 10));

			//Intel
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i5-12400F", " ", "NEW", 137.99d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/83/834922/1636-intel-core-i5-12400f-44-ghz.jpg"));
				stockService.createStock(new ComponentStock(7L, 10));
				System.out.println(componentService.getComponents());
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", " Core i5-12600", " ", "NEW", 234.0d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/83/834916/1454-intel-core-i5-12600-48-ghz.jpg"));
				stockService.createStock(new ComponentStock(8L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i7-14700 ", " ", "NEW", 440.98d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1080/10805160/1878-intel-core-i7-14700-21-54ghz-box.jpg"));
				stockService.createStock(new ComponentStock(9L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i9-13900F", " ", "NEW", 581.44d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1064/10644158/1492-intel-core-i9-13900f-2-ghz-56-ghz.jpg"));
				stockService.createStock(new ComponentStock(10L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i9-13900 ", " ", "NEW", 659.0d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1064/10644142/1146-intel-core-i9-13900-2-ghz-56-ghz.jpg"));
				stockService.createStock(new ComponentStock(11L, 10));
				componentService.addComponentDto(new NewComponentDto( "CPU", "Intel", "Core i9-10980XE", " ", "NEW", 1354.23d, 2023, 10, "https://thumb.pccomponentes.com/w-530-530/articles/24/247046/intel-core-i9-10980xe-3-ghz-extreme-edition-comprar.jpg"));
				stockService.createStock(new ComponentStock(12L, 10));


			//Componente GPUS
			//Asus
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual GeForce RTX 4070 SUPER EVO OC Edition", "12GB GDDR6X DLSS3", "NEW", 709.0d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1081/10819242/129-asus-dual-geforce-rtx-4070-super-evo-oc-edition-12gb-gddr6x-dlss3.jpg"));
				stockService.createStock(new ComponentStock(13L, 10));
				System.out.println(componentService.getComponents());
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual GeForce RTX 4060 White OC Edition", "8GB GDDR6 DLSS3", "NEW", 350.98d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1074/10742718/1312-asus-dual-geforce-rtx-4060-white-oc-edition-8gb-gddr6-dlss3-foto.jpg"));
				stockService.createStock(new ComponentStock(14L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual Radeon RX 6700 XT OC Edition", "12GB GDDR6", "NEW", 784.56d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/79/790345/1327-asus-dual-radeon-rx-6700-xt-oc-edition-12gb-gddr6.jpg"));
				stockService.createStock(new ComponentStock(15L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "Dual GeForce RTX 3050 OC Edition", "8GB GDDR6", "NEW", 279.53d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1003/10038465/1152-asus-dual-geforce-rtx-3050-oc-edition-8gb-gddr6.jpg"));
				stockService.createStock(new ComponentStock(16L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "ROG Strix GeForce RTX 4080 OC Edition", "16GB GDDR6X DLSS3", "NEW", 1700.89d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1064/10643503/1657-asus-rog-strix-geforce-rtx-4080-oc-edition-16gb-gddr6x.jpg"));
				stockService.createStock(new ComponentStock(17L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Asus", "GeForce RTX 4080 SUPER Noctua OC Edition", "16GB GDDR6X DLSS3", "NEW", 1534.23d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1081/10815058/1809-asus-geforce-rtx-4080-super-noctua-oc-edition-16gb-gddr6x-dlss3.jpg"));
				stockService.createStock(new ComponentStock(18L, 10));
			
			//MSI
				componentService.addComponentDto(new NewComponentDto( "GPU", "MSI", "GeForce RTX 4090 GAMING X SLIM", "24GB GDDR6X DLSS3", "NEW", 959d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1079/10792156/1155-msi-geforce-rtx-4090-gaming-x-slim-24gb-gddr6x-dlss3.jpg"));
				stockService.createStock(new ComponentStock(18L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "MSI", "GeForce RTX 4070 Ti SUPER GAMING X SLIM White", "16GB GDDR6X DLSS3", "NEW", 999.0d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1081/10811517/1827-msi-geforce-rtx-4070-ti-super-gaming-x-slim-white-16gb-gddr6x-dlss3.jpg"));
				stockService.createStock(new ComponentStock(19L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "MSI", "GeForce RTX 4060 Ti VENTUS 2X BLACK OC", "8GB GDDR6 DLSS3", "NEW", 389.95d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1072/10728002/1992-msi-geforce-rtx-4060-ti-ventus-2x-black-oc-8gb-gddr6-dlss3.jpg"));
				stockService.createStock(new ComponentStock(20L, 10));

			//Gigabyte
				componentService.addComponentDto(new NewComponentDto( "GPU", "Gigabyte", "Gigabyte GeForce RTX 4090 WINDFORCE V2 ", "24GB GDDR6X", "NEW", 2109.01d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1080/10805452/1662-gigabyte-geforce-rtx-4090-windforce-v2-24gb-gddr6x.jpg"));
				stockService.createStock(new ComponentStock(21L, 10));
				componentService.addComponentDto(new NewComponentDto( "GPU", "Gigabyte", "GeForce RTX 4060 EAGLE OC", "", "NEW", 359.0d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1073/10739332/1318-gigabyte-geforce-rtx-4060-eagle-oc-8gb-gddr6-dlss3.jpg"));
				stockService.createStock(new ComponentStock(22L, 10));
			
			//Zotac
				componentService.addComponentDto(new NewComponentDto( "GPU", "Zotac", "Gaming GeForce RTX 4080 SUPER Trinity OC White Edition", "16GB GDDR6X", "NEW", 1239.76d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1081/10810542/1491-zotac-gaming-geforce-rtx-4080-super-trinity-oc-white-edition-16gb-gddr6x-dlss3.jpg"));
				stockService.createStock(new ComponentStock(23L, 10));
				// componentService.addComponentDto(new NewComponentDto( "GPU", "Zotac", "Gaming GeForce RTX 3050 ECO", "8GB GDDR6", "NEW", 0d, 2024, 10, "https://thumb.pccomponentes.com/w-530-530/articles/1075/10757145/1348-zotac-gaming-geforce-rtx-3050-eco-8gb-gddr6.jpg"));
				// stockService.createStock(new ComponentStock(24L, 10));
			
			
			//Componente RAM
			// componentService.addComponentDto(new NewComponentDto( "RAM", "", "", "", "NEW", 959d, 2024, 10, ""));
			// stockService.createStock(new ComponentStock(18L, 10));

		};	
	}

}

//Valores posibles para ComponentBrand:
// Asus, MSI, Gigabyte, AMD, Intel,Samsung, WesternDigital, Kingston, Seagate, Zotac, Corsair, NZXT, CoolerMaster, Creative, BeQuiet, Seasonic, Noctua, DeepCool

//valores posibles para ComponentCategory:
// CPU, GPU, RAM, Motherboard, Hard_Drive, SSD, Power_Supply, Case, Cooling_Fan, Network_Card, Sound_Card,

//valores posibles para ComponentState:
// NEW, SECONDHAND
