package example.grpc.clients.testing_service;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

public class HeaderClientInterceptor implements ClientInterceptor {
	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
			CallOptions callOptions, Channel next) {
		return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

			@Override
			public void start(Listener<RespT> responseListener, Metadata headers) {
				/* put custom header */

				if (headers != null) {
					Metadata fixedHeaders = new Metadata();
					Metadata.Key<String> key = Metadata.Key.of("header", Metadata.ASCII_STRING_MARSHALLER);
					fixedHeaders.put(key, "hiiii");
					headers.merge(fixedHeaders);
				}
				super.start(new SimpleForwardingClientCallListener<RespT>(responseListener) {
					@Override
					public void onHeaders(Metadata headers) {
						/**
						 * if you don't need receive header from server, you can use
						 * {@link io.grpc.stub.MetadataUtils attachHeaders} directly to send header
						 */
						super.onHeaders(headers);
					}
				}, headers);
			}
		};
	}
}
