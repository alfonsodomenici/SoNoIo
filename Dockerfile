FROM airhacks/glassfish
COPY ./target/SoNoIo.war ${DEPLOYMENT_DIR}
