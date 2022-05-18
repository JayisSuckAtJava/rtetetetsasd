package COM.DDD.CHO.jay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

	@RequestMapping("/")
	public void test() {
		System.out.println("dsd");
	}
}
