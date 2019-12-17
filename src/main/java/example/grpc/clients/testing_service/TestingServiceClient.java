package example.grpc.clients.testing_service;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.java.testing_service.TestingGrpc;
import io.grpc.java.testing_service.TestingGrpc.TestingBlockingStub;
import io.grpc.java.testing_service.TestingRequest;
import io.grpc.java.testing_service.TestingResponse;
import io.grpc.netty.NettyChannelBuilder;

public class TestingServiceClient {

	public ManagedChannel channel;
	public TestingBlockingStub stub;
	public TestingRequest request;
	public Metadata header;

	public static void main(String args[]) {
	}

	public TestingServiceClient(String host, int port) {
		this.channel = createChannel(host, port);
		this.stub = createBlockingStub(this.channel);
	}

	public ManagedChannel createChannel(String host, int port) {
		channel = NettyChannelBuilder.forAddress(host, port).usePlaintext().build();
		return channel;
	}

	public TestingBlockingStub createBlockingStub(ManagedChannel channel) {
		stub = TestingGrpc.newBlockingStub(channel);
		return stub;
	}

	public TestingServiceClient createTestingRequest(String varOne, String varTwo, String varThree) {
		request = TestingRequest.newBuilder().setVarOne(varOne).setVarTwo(varTwo).setVarThree(varThree).build();
		return this;
	}

	public TestingResponse sendRequestToService(TestingServiceClient client, String varOne, String varTwo,
			String varThree) {
		client = client.createTestingRequest(varOne, varTwo, varThree);

		TestingResponse serverResponse = stub.withInterceptors(new HeaderClientInterceptor())
				.testingRequestHandler(request);
		return serverResponse;
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

}
