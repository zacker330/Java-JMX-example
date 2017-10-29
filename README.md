
An example of JMX
---

## startup

use mvn to package our java code: `mvn compile package` then:

```
java -Dcom.sun.management.jmxremote \
-Dcom.sun.management.jmxremote.port=9999 \
-Dcom.sun.management.jmxremote.local.only=false \
-Dcom.sun.management.jmxremote.authenticate=false \
-Dcom.sun.management.jmxremote.ssl=false \
-Djava.net.preferIPv4Stack=true \
-Djava.rmi.server.hostname=127.0.0.1 \
-jar ./target/jmxexample-1.0-SNAPSHOT.jar codes.showme.App 
```

P.S. add this parameter if your jconsole can't connect to app's jmx port: `-Djava.rmi.server.hostname=127.0.0.1`


## setup jconsole log for debugging
```
jconsole -J-Djava.util.logging.config.file=/Users/jack/codebase/open-sources/jmxexample/jconsole-log4j.properties \
127.0.0.1:9999
```

![](./docs/1.jpeg)