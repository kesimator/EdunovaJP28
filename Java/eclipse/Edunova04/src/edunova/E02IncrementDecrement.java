package edunova;

public class E02IncrementDecrement {
	
	public static void main(String[] args) {
		
		
		int i=0;
		
		// increment
		i =i+1;		// 1
		
		i+=1;		// 2
		
		i++;		// 3
		
		++i;		// 4
		
		
		
		// decrement
		i=i-1;		// 3
		
		i-=1;		// 2
		
		i--;		// 1
		
		--i;		// 0
		
		System.out.println(i);
		
		
		
		// i++ prvo koristi vrijednost pa ju uveća
		
		i=1;
		System.out.println(i++ ); 	//1
		System.out.println(i); 		//2
		
		
		
		// ++i prvo uveća pa onda koristi vrijednost
		System.out.println(++i); 	//3 u ovom slučaju, a da krenemo otpočetka od i=1 pa print onda bi pokazalo 2
		
		// isto vrijedi i za --
		
		
		
		
		
		// tipični zadaci
		
		
		
		
		
		
		
	}

}
