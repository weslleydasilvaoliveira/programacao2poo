package entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private String name;
	//
	private Department department;// Linked / Relacionamento
	private List<HourContract> contracts = new ArrayList<>();
	
	//constructor
	public Worker(String name, Department department, List<HourContract> contracts) {
		super();
		this.name = name;
		this.department = department;
	}
	
	//methods
	public void addContract(HourContract hc) {
		contracts.add(hc);
	}
	
	public void remoceContract(HourContract hc) {
		contracts.remove(hc);
	}
}
