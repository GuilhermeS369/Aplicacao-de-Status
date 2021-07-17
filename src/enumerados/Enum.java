package enumerados;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Enum {

	public static void main(String[] args) {
	
		
		Order pedido = new Order (1080,new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		//AQUI DEFINI A VARIAVEL COM O NOVO TIPO, E ELA JA RECEBEU O ID, A DATA ATUA, 
		
		//E O ORDER STATUS Q DEFINI O ENUM
		
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		
		
		
	}

}
