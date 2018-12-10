# Build
mvn clean package && docker build -t it.arpa.piemonte/SoNoIo .

# RUN

docker rm -f SoNoIo || true && docker run -d -p 8080:8080 -p 4848:4848 --name SoNoIo it.arpa.piemonte/SoNoIo 