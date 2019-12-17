package example.grpc.clients.testing_service.jmeter;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import example.grpc.clients.testing_service.TestingServiceClient;
import io.grpc.StatusRuntimeException;

public class TestingServiceSampler extends AbstractJavaSamplerClient {

	TestingServiceClient bclient = null;
	String varOne = "one";
	String varTwo = "two";
	String varThree = "three";

	@Override
	public void setupTest(JavaSamplerContext context) {
		String environment = context.getParameter("host");
		String port = context.getParameter("port");
		this.varOne = context.getParameter("varOne");
		this.varTwo = context.getParameter("varTwo");
		this.varThree = context.getParameter("varThree");
		this.bclient = new TestingServiceClient(environment, Integer.parseInt(port));
		super.setupTest(context);
	}

	@Override
	public Arguments getDefaultParameters() {
		Arguments defaultParameters = new Arguments();
		defaultParameters.addArgument("host", "abc.xyz.com");
		defaultParameters.addArgument("port", "5556");
		defaultParameters.addArgument("varOne", varOne);
		defaultParameters.addArgument("varTwo", varTwo);
		defaultParameters.addArgument("varThree", varThree);
		return defaultParameters;
	}

	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult result = new SampleResult();
		boolean success = true;
		String response = "";
		result.sampleStart();

		try {
			response = this.bclient.sendRequestToService(bclient, varOne, varTwo, varThree).toString();
			result.sampleEnd();
			result.setSuccessful(success);
			result.setResponseData(response.getBytes());
			result.setResponseMessage("Successfully performed backup healthcheck");
			result.setResponseCodeOK(); // 200 code
		} catch (StatusRuntimeException e) {
			result.sampleEnd(); // stop stopwatch
			result.setSuccessful(false);
			result.setResponseMessage("Exception: " + e);
			success = false;
			result.setSuccessful(success);
			// get stack trace as a String to return as document data
			java.io.StringWriter stringWriter = new java.io.StringWriter();
			e.printStackTrace(new java.io.PrintWriter(stringWriter));
			result.setResponseData(stringWriter.toString().getBytes());
			result.setDataType(org.apache.jmeter.samplers.SampleResult.TEXT);
			result.setResponseCode("500");
		}
		return result;
	}

	@Override
	public void teardownTest(JavaSamplerContext context) {
		try {
			bclient.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.teardownTest(context);
	}
}
