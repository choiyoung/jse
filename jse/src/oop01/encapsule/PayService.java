package oop01.encapsule;

public class PayService {
	
	PayVO vo = new PayVO();

	public int Tax() {
		return (int)(vo.TAX*100);			
	}
	public int Incom(String name, int salary) {
		
		vo.setName(name);
		vo.setSalary(salary);
		return (int)(vo.getSalary()-vo.getSalary() * vo.TAX);
		
	}	
}
