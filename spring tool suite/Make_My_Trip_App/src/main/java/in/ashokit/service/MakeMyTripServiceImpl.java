package in.ashokit.service;

import org.springframework.web.client.RestTemplate;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

public class MakeMyTripServiceImpl implements MakeMyTripService {
	private String BOOK_TICKET_URL="http://13.232.253.164:8080/ticket";
	private String GET_TICKET_URL="http://13.232.253.164:8080/ticket/{ticketNum}";
	@Override
	public Ticket bookTicket(Passenger passenger) {
		RestTemplate rt = new RestTemplate();
		rt.postForEntity(BOOK_TICKET_URL, passenger, null);
		return null;
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
