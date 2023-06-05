package pe.edu.idat.dswl;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Cod;
// import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CodRepository {
	private static final Map<String, Cod> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Cod lunes = new Cod();
		lunes.setName("Lunes");
		lunes.setIngles("Monday");

		countries.put(lunes.getName(), lunes);


        Cod martes = new Cod();
		martes.setName("Martes");
		martes.setIngles("Tuesday");

		countries.put(martes.getName(), martes);


        Cod miercoles = new Cod();
		miercoles.setName("Miercoles");
		miercoles.setIngles("Wednesday");

		countries.put(miercoles.getName(), miercoles);


        Cod jueves = new Cod();
		jueves.setName("Jueves");
		jueves.setIngles("Thursday");

		countries.put(jueves.getName(), jueves);


        Cod viernes = new Cod();
		viernes.setName("Viernes");
		viernes.setIngles("Friday");

		countries.put(viernes.getName(), viernes);


        Cod sabado = new Cod();
		sabado.setName("Sabado");
		sabado.setIngles("Saturday");

		countries.put(sabado.getName(), sabado);


        Cod domingo = new Cod();
		domingo.setName("Domingo");
		domingo.setIngles("Sunday");

		countries.put(domingo.getName(), domingo);
	}

	public Cod findCod(String name) {
		Assert.notNull(name, "The cod's name must not be null");
		return countries.get(name);
	}
}