FROM rodolpheche/wiremock
WORKDIR /home/wiremock
COPY stubs/ /home/wiremock
COPY target/mock_server_extensions-1.0-SNAPSHOT.jar /var/wiremock/extensions/
CMD ["--extensions", "com.farfetch.fe.mock.extensions.BodyTransformer"]
CMD ["--https-port", "8443"]