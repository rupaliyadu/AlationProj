package helloworld;

public class Greeting {
    private final String content;
    private final String instanceId;
    private final String ipAddress;

    public Greeting(String content, String instanceId, String ipAddress) {
        this.content = content;
        this.instanceId = instanceId;
        this.ipAddress = ipAddress;
    }


    public String getContent() {
        return content;
    }


	public String getInstanceId() {
		return instanceId;
	}


	public String getIpAddress() {
		return ipAddress;
	}

}
