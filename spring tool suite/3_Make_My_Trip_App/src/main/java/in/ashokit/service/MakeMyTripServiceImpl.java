package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {
private String BOOK_TICKET_URL="http://54.206.243.210:8080/ticket";
private String GET_TICKET_URL="http://54.206.243.210:8080/ticket/{ticketNum}";
	@Override
	public Ticket bookTicket(Passenger passenger) {
//		WebClient webClient = WebClient.create();
//		Ticket ticket = webClient.post()
//		.uri(BOOK_TICKET_URL)
//		.bodyValue(passenger)
//		.retrieve()
//		.bodyToMono(Ticket.class)
//		.block();
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respEntity = rt.postForEntity(BOOK_TICKET_URL,passenger, Ticket.class);
		Ticket ticket = respEntity.getBody();
		return ticket;

	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
//		WebClient webClient = WebClient.create();
//		Ticket ticket = webClient.get()
//		.uri(GET_TICKET_URL,ticketNumber)
//		.retrieve()
//		.bodyToMono(Ticket.class)
//		.block();
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respEntity = rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
		Ticket ticket = respEntity.getBody();
		return ticket;
		
	}																		

}
