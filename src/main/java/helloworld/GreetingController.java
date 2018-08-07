package helloworld;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws UnknownHostException {
        return new Greeting(String.format(template, name), getInstanceId(), getIpAddress());
    }

	private String getIpAddress() throws UnknownHostException {
		// TODO Auto-generated method stub
	    
	    InetAddress inetAddress = InetAddress.getLocalHost();
	    return inetAddress.getHostAddress();
	}

	private String getInstanceId() {
		// TODO Auto-generated method stub
		return "12345";
	}

}
