package pe.edu.idat.dswl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetCodRequest;
import io.spring.guides.gs_producing_web_service.GetCodResponse;

@Endpoint
public class CodEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private CodRepository codRepository;

	@Autowired
	public CodEndpoint(CodRepository codRepository) {
		this.codRepository = codRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCodRequest")
	@ResponsePayload
	public GetCodResponse getCod(@RequestPayload GetCodRequest request) {
		GetCodResponse response = new GetCodResponse();
		response.setCod(codRepository.findCod(request.getName()));

		return response;
	}
}