package fapi_poo_mockitera;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;



public class TestarCalculadora {
	

	@Test
	public void test01(){
		 
		Calculadora testar = mock(Calculadora.class);
		when(testar.adicao(3, 5)).thenReturn(8);
		
		Assert.assertEquals(8, testar.adicao(3, 5));
		
	}

}
