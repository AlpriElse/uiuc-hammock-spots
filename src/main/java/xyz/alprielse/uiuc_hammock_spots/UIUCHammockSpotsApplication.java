package xyz.alprielse.uiuc_hammock_spots;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import xyz.alprielse.uiuc_hammock_spots.resources.HelloWorldResource;

public class UIUCHammockSpotsApplication extends Application<UIUCHammockSpotsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new UIUCHammockSpotsApplication().run(args);
    }

    @Override
    public String getName() {
        return "UIUCHammockSpots";
    }

    @Override
    public void initialize(final Bootstrap<UIUCHammockSpotsConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addBundle(new MigrationsBundle<UIUCHammockSpotsConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(UIUCHammockSpotsConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
    }

    @Override
    public void run(final UIUCHammockSpotsConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource helloWorldResource = new HelloWorldResource();
        environment.jersey().register(helloWorldResource);
    }
}
