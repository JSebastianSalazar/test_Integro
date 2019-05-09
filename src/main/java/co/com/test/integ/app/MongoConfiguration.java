package co.com.test.integ.app;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@Configuration
@EnableReactiveMongoRepositories("co.com.test.integ")
public class MongoConfiguration  extends AbstractReactiveMongoConfiguration {

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb://sebastian:123456M@ds055680.mlab.com:55680/app-integro");
    }

    @Override
    protected String getDatabaseName() {
        return "app-integro";
    }
}
