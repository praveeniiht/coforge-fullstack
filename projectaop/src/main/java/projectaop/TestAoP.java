package projectaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			TestCustomer tc = (TestCustomer) context.getBean("tcustomer");
			tc.test1();
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}

}
