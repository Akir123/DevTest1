package com.user.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.user.entity.Adi;
import com.user.entity.Mayur;
import com.user.entity.Susanta;

@Service
public class Personal {

	public List<Adi> getAdi() {
	return Arrays.asList(
		new Adi(5L,"Aditesh"),
		new Adi(6L,"Amesh")
			);
}
	public List<Mayur> getMayur() {
	return Arrays.asList(
		new Mayur(7L,"Mayuresh"),
		new Mayur(8L,"Mayureshwari")
			);
}
	public List<Susanta> getSusanta() {
	return Arrays.asList(
		new Susanta(9L,"Susanta"),
		new Susanta(10L, "Susantani")
			);
}
}
